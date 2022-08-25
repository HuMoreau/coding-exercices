package builder_with_director;

// The director is here to create objects that are often used (kinda like we had blueprints), however you can see that
// our director does not return the content of the builder because we don't know what object is really constructed
// (e.g. A product or a productManual ?)

public class Director {

    public void constructGoodProduct(Builder builder){
        builder.setOptionA("This is a good product");
        builder.setOptionB(10);
        builder.setOptionC(true);
    }

    public void constructMehProduct(Builder builder){
        builder.setOptionB(1);
    }

}
