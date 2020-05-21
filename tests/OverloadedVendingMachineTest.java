import org.junit.Test;
import vending.product.*;
import vending.OverloadedVendingMachine;
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

        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());
        productBought.buy(new SoftDrink());

        assertEquals(3, productBought.buyCount(new SoftDrink()));
    }

    @Test
    public void shouldBuySaltySnacks() {

        OverloadedVendingMachine productBought = new OverloadedVendingMachine();
        productBought.addStock(new SaltySnack());
        productBought.addStock(new SaltySnack());
        productBought.addStock(new SaltySnack());
        productBought.buy(new SaltySnack());
        assertEquals(2, productBought.buyCount(new SaltySnack()));
    }

    @Test
    public void shouldBuyChocolateAndItWillStopToZero() {

        OverloadedVendingMachine productBought = new OverloadedVendingMachine();

        productBought.addStock(new Chocolate());
        productBought.addStock(new Chocolate());
        productBought.addStock(new Chocolate());
        productBought.buy(new Chocolate());
        productBought.buy(new Chocolate());
        assertEquals(1, productBought.buyCount(new Chocolate()));
    }
    @Test
    public void shouldAddChocolateStock() {

        OverloadedVendingMachine productBought = new OverloadedVendingMachine();

        productBought.addStock(new Chocolate());
        productBought.addStock(new Chocolate());
        productBought.addStock(new Chocolate());

        assertEquals(3, productBought.getChocolate(new Chocolate()));
    }
    @Test
    public void  shouldAddSaltySnacks() {

        OverloadedVendingMachine productBought = new OverloadedVendingMachine();

        productBought.addStock(new SaltySnack());
        productBought.addStock(new SaltySnack());
        productBought.addStock(new SaltySnack());
        productBought.addStock(new SaltySnack());
        productBought.addStock(new SaltySnack());
        assertEquals(5, productBought.getSaltySnack(new SaltySnack()));

    }
    @Test
    public void shouldAddSoftDrinks() {

        OverloadedVendingMachine productBought = new OverloadedVendingMachine();

        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());

        assertEquals(7, productBought.getSoftDrink(new SoftDrink()));
    }
    @Test
    public void shouldBuySoftDrinksITWontShowNegativeNum() {

        OverloadedVendingMachine productBought = new OverloadedVendingMachine();

        productBought.buy(new SoftDrink());
        productBought.buy(new SoftDrink());
        productBought.buy(new SoftDrink());
        productBought.buy(new SoftDrink());
        productBought.buy(new SoftDrink());
        productBought.buy(new SoftDrink());
        productBought.buy(new SoftDrink());


        assertEquals(0, productBought.getSoftDrink(new SoftDrink()));
    }
}