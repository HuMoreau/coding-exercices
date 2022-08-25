//Singleton must assure that an instance can only be created once, and that this instance is accessible from everywhere

public class Singleton {

    // Volatile because multithreading might mess with the getInstance() method.
    // More : https://en.wikipedia.org/wiki/Double-checked_locking#Usage_in_Java
    private static volatile Singleton instance;

    public String value;

    // Private constructor because we don't want anybody to access it, only way to call it is by getInstance()
    private Singleton(String value){
        this.value = value;
    }

    // Here I used a pimped double-checked locking (DCL) to ensure that multithreading won't cause multiple
    // instanciations of our singleton.
    // -> https://en.wikipedia.org/wiki/Double-checked_locking#Usage_in_Java
    public static Singleton getInstance(String value){

        // We instantiate result because referencing it won't trigger the volatile's securities of instance,
        // however I'm not sure of why it is implemented like this, because I only use result once (and by instantiating
        // result I call instance, so complexity is even bigger like this). I might try to play around in order to check
        // why I saw Singleton implemented like this. (As I understood it, it is as caveat of Java, while it might seem
        // useless, it really speeds up the process).
        Singleton result = instance;

        // "Lazy loading" implementation (if instance is already instantiated, then return it, duh ;) )
        if (result != null){
            return instance;
        }
        // We synchronise it, in case of a race condition (https://en.wikipedia.org/wiki/Race_condition#In_software)
        synchronized (Singleton.class){
            // Then we check if instance is already instantiated, as another thread could already have begun
            // its instantiation
            if(instance == null){
                instance = new Singleton(value);
            }
            return instance;
        }

    }
}
