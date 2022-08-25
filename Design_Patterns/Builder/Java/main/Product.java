// A Builder is a way to create an immutable object that support multiple options with multiple values. We don't want
// to create a whole lot of constructors (that might not be exhaustive).

// The product we wanna build.
public class Product {

    // The builder for our product (a static inner class)
    public static class ProductBuilder{

        // Possess the same fields than our product (those aren't finals though).
        private String optionA;
        private int optionB;
        private boolean optionC;

        // Empty constructor, I believe that it would be the place where I would implement a "default configuration" for
        // our product if I had to.
        public ProductBuilder(){}

        //Setters

        public ProductBuilder setOptionA(String optionA){
            this.optionA = optionA;
            return this;
        }

        public ProductBuilder setOptionB(int optionB){
            this.optionB = optionB;
            return this;
        }

        public ProductBuilder setOptionC(boolean optionC){
            this.optionC = optionC;
            return this;
        }

        //This is where the magic happen : we call for the private constructor of our product and give it our builder
        public Product buildProduct(){
            return new Product(this);
        }
    }

    // All or option fields are final and private (remember, we want our object to be "immutable")
    private final String optionA;
    private final int optionB;
    private final boolean optionC;

    // Private constructor, take our builder in parameter (I could also implement business logic in there ?)
    private Product(ProductBuilder productBuilder){
        this.optionA = productBuilder.optionA;
        this.optionB = productBuilder.optionB;
        this.optionC = productBuilder.optionC;
    }

    //Getters

    public String getOptionA() {
        return optionA;
    }

    public int getOptionB() {
        return optionB;
    }

    public boolean getOptionC() {
        return optionC;
    }
}
