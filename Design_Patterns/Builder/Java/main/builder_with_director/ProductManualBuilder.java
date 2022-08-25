package builder_with_director;

public class ProductManualBuilder implements Builder{

    private String optionA;
    private int optionB;
    private boolean optionC;

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

    public ProductManual buildProductManual(){
        return new ProductManual(optionA, optionB, optionC);
    }
}
