package builder_with_director;

public class Product {
    private final String optionA;
    private final int optionB;
    private final boolean optionC;

    public Product(String optionA, int optionB, boolean optionC){
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
    }

    public String getOptionA() {
        return optionA;
    }

    public int getOptionB() {
        return optionB;
    }

    public boolean isOptionC() {
        return optionC;
    }
}
