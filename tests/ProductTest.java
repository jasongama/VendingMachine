import org.junit.Test;
import vending.product.*;
import vending.product.SoftDrink;
import vending.product.SaltySnack;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    @Test
    public void shouldTellAProductDescription() {

        Product productDescription = new Product();

        productDescription.description();
        assertEquals("This is a product", productDescription.description());
    }

    @Test
    public void shouldAddSaltySnackInTheVendingMachine() {

        SaltySnack product = new SaltySnack();


        product.addStock(new SaltySnack());
        product.addStock(new SaltySnack());
        product.addStock(new SaltySnack());
        product.addStock(new SaltySnack());
        product.addStock(new SaltySnack());

        assertEquals(5, product.getSaltySnack(new SaltySnack()));
    }

    @Test
    public void shouldAddSoftDrinkInTheVendingMachine() {

        SoftDrink product = new SoftDrink();


        product.addStock(new SoftDrink());
        product.addStock(new SoftDrink());
        product.addStock(new SoftDrink());
        product.addStock(new SoftDrink());

        assertEquals(4, product.getSoftDrink(new SoftDrink()));
    }

    @Test
    public void shouldAddChocolateInTheVendingMachine() {

        Chocolate product = new Chocolate();


        product.addStock(new Chocolate());
        product.addStock(new Chocolate());
        product.addStock(new Chocolate());
        product.addStock(new Chocolate());
        product.addStock(new Chocolate());
        product.addStock(new Chocolate());

        assertEquals(6, product.getChocolate(new Chocolate()));
    }

    @Test
    public void shouldTellAChocolateDescription() {

        Chocolate productDescription = new Chocolate();


        productDescription.description();


        assertEquals("This are chocolates", productDescription.description());
    }

    @Test
    public void shouldTellASaltySnacksDescription() {

        SaltySnack productDescription = new SaltySnack();


        productDescription.description();


        assertEquals("This are SaltySnacks", productDescription.description());
    }

    @Test
    public void shouldTellASoftDrinkDescription() {

        SoftDrink productDescription = new SoftDrink();


        productDescription.description();


        assertEquals("This are SoftDrinks", productDescription.description());
    }



}