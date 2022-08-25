import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void should_correctly_create_the_product_I_asked_for(){
        // Given
        String optionA = "Blue";
        int optionB = 23;
        boolean optionC = true;

        // When
        Product.ProductBuilder productBuilder = new Product.ProductBuilder();
        productBuilder.setOptionA(optionA).setOptionB(optionB).setOptionC(optionC);
        Product product = productBuilder.buildProduct();

        // Then
        Assertions.assertEquals(optionA, product.getOptionA());
        Assertions.assertEquals(optionB, product.getOptionB());
        Assertions.assertEquals(optionC, product.getOptionC());
    }

    @Test
    public void should_be_created_without_all_fields_having_value(){
        // Given
        int optionB = 23;

        // When
        Product.ProductBuilder productBuilder = new Product.ProductBuilder();
        productBuilder.setOptionB(optionB);
        Product product = productBuilder.buildProduct();

        // Then
        Assertions.assertNull(product.getOptionA());
        Assertions.assertEquals(optionB, product.getOptionB());
        Assertions.assertFalse(product.getOptionC());
    }

}
