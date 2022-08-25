package builder_with_director;

public class ProductBuilder implements Builder {

    private String optionA;
    private int optionB;
    private boolean optionC;

    private ProductBuilder(){
    }

    @Override
    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    @Override
    public void setOptionB(int optionB) {
        this.optionB = optionB;
    }

    @Override
    public void setOptionC(boolean optionC) {
        this.optionC = optionC;
    }

    public Product buildProduct(){
        return new Product(this.optionA, this.optionB, this.optionC);
    }
}
