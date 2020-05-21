package vending;

import vending.product.Product;
import vending.product.SoftDrink;
import vending.product.Chocolate;
import vending.product.SaltySnack;


public class OverloadedVendingMachine {
    private static int softDrinkCount = 0;
    private static int saltySnackCount = 0;
    private static int chocolateCount = 0;


    public static void buy(SoftDrink softdrink) {

        if (softDrinkCount > 0) {
            softDrinkCount -= 1;
        }

    }

    public static void buy(SaltySnack saltySnack) {

        if (saltySnackCount > 0) {
            saltySnackCount -= 1;
        }

    }

    public static void buy(Chocolate chocolate) {

        if (chocolateCount > 0) {
            chocolateCount -= 1;
        }


    }

    public void buy(Product product) {
        if (softDrinkCount < 0 && saltySnackCount < 0 && chocolateCount < 0) {
            softDrinkCount = -1;
            saltySnackCount = -1;
            chocolateCount = -1;
        }


    }

    public static void addStock(SoftDrink softdrink) {

        softDrinkCount += 1;
    }

    public static void addStock(SaltySnack saltySnack) {

        saltySnackCount += 1;

    }

    public static void addStock(Chocolate chocolate) {

        chocolateCount += 1;

    }

    public void addStock(Product product) {
        softDrinkCount += 1;
        saltySnackCount += 1;
        chocolateCount += 1;
    }

    public static int getSoftDrink(SoftDrink softdrink) {
        return softDrinkCount;
    }

    public static int getSaltySnack(SaltySnack saltySnack) {
        return saltySnackCount;
    }

    public static int getChocolate(Chocolate chocolate) {
        return chocolateCount;
    }

    public static int buyCount(SoftDrink softdrink) {
        return softDrinkCount;
    }

    public static int buyCount(SaltySnack saltySnack) {
        return saltySnackCount;
    }

    public static int buyCount(Chocolate chocolate) {
        return chocolateCount;
    }

    public static void main(String[] args) {

        addStock(new SaltySnack());
        addStock(new SaltySnack());
        buy(new SaltySnack());

        System.out.println("Buying SaltySnacks: " + getSaltySnack(new SaltySnack()) + buyCount(new SaltySnack()));

        addStock(new SoftDrink());
        addStock(new SoftDrink());
        addStock(new SoftDrink());
        addStock(new SoftDrink());
        addStock(new SoftDrink());
        buy(new SoftDrink());

        System.out.println("BuySoftDrinks: " + getSoftDrink(new SoftDrink()) + buyCount(new SoftDrink()));

        addStock(new Chocolate());
        addStock(new Chocolate());
        addStock(new Chocolate());
        addStock(new Chocolate());
        buy(new Chocolate());
        System.out.println("BuyChocolate: " + getChocolate(new Chocolate()) + buyCount(new Chocolate()));


    }

}
