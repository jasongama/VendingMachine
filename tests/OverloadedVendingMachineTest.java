import org.junit.Test;
import vending.product.Chocolate;
import vending.product.Product;
import vending.OverloadedVendingMachine;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.Assert.assertEquals;

public class OverloadedVendingMachineTest {

    @Test
    public void shouldTellAProductDescription() {

        Product productDescription = new Product();

        productDescription.description();
        assertEquals("This is a product", productDescription.description());
    }
    @Test
    public void shouldBuySoftDrinks() {

        OverloadedVendingMachine productBought = new OverloadedVendingMachine();


        productBought.buy(new SoftDrink());
        productBought.buy(new SoftDrink());

        assertEquals(1, productBought.buyCount(new SoftDrink()));
    }
    @Test
    public void shouldBuySaltySnacks() {

        OverloadedVendingMachine productBought = new OverloadedVendingMachine();

        productBought.buy(new SaltySnack());
        assertEquals(2, productBought.buyCount(new SaltySnack()));
    }
    @Test
    public void shouldBuyChocolateAndItWillStopToZero () {

        OverloadedVendingMachine productBought = new OverloadedVendingMachine();

        productBought.buy(new Chocolate());
        productBought.buy(new Chocolate());
        productBought.buy(new Chocolate());
        productBought.buy(new Chocolate());
        productBought.buy(new Chocolate());
        assertEquals(0, productBought.buyCount(new Chocolate()));
    }
}