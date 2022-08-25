package builder_with_director;

public class ProductManual {

    private final String manualContent;

    public ProductManual(String optionA, int optionB, boolean optionC){
        StringBuilder stringBuilder = new StringBuilder();

        if(optionA != null){
            stringBuilder.append("Your product was engraved with the legend : ");
            stringBuilder.append(optionA);
            stringBuilder.append("\n");
        }
        else {
            stringBuilder.append("Your product isn't engraved.\n");
        }


        if(optionB > 0){
            stringBuilder.append("Your product is under guaranty for  ");
            stringBuilder.append(optionB);
            stringBuilder.append("years.\n");
        }
        else {
            stringBuilder.append("Your product isn't under guaranty. ");
        }

        if(optionC){
            stringBuilder.append("Your will find a voucher for other of our products down below");
        }

        stringBuilder.append("Thank you for trusting our products.");

        this.manualContent = stringBuilder.toString();
    }

    public String getManualContent() {
        return manualContent;
    }
}
