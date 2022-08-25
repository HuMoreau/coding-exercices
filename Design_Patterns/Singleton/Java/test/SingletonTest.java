import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void a_singleton_instance_should_be_created_when_I_call_getInstance_the_first_time(){
        // Given

        // When
        Singleton singleton = Singleton.getInstance("");

        // Then
        Assertions.assertNotNull(singleton);
    }

    @Test
    public void when_I_call_getInstance_it_should_correctly_take_the_value_I_gave_in_parameter(){
        // Given
        String testString = "Test";

        // When
        Singleton singleton = Singleton.getInstance(testString);

        //Then
        Assertions.assertEquals(singleton.value, testString);
    }

    @Test
    public void when_I_call_getInstance_multiple_time_it_should_always_give_me_the_same_instance(){
        // Given

        // When
        String singletonAdress1 = Singleton.getInstance("A").toString();
        String singletonAdress2 = Singleton.getInstance("B").toString();

        // Then
        Assertions.assertEquals(singletonAdress1, singletonAdress2);
    }
}
