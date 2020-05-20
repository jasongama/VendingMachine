package vending;

import vending.product.Product;
import vending.product.SoftDrink;
import vending.product.Chocolate;
import vending.product.SaltySnack;

public class OverloadedVendingMachine {
    private int softDrinkCount = 0;
    private int saltySnackCount = 0;
    private int chocolateCount = 0;


    public void buy(SoftDrink softdrink) {
        System.out.println("Buy 1 SoftDrink");
        if (softDrinkCount > 0) {
            softDrinkCount -= 1;
        }

    }

    public void buy(SaltySnack saltySnack) {
        System.out.println("Buy 1 saltySnack");
        if (saltySnackCount > 0) {
            saltySnackCount -= 1;
        }

    }

    public void buy(Chocolate chocolate) {
        System.out.println("Buy 1 chocolate");
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

    public void addStock(SoftDrink softdrink) {
        System.out.println("\tadd 1 SoftDrink to stock");
        softDrinkCount += 1;
    }

    public void addStock(SaltySnack saltySnack) {
        System.out.println("\tadd 1 SaltySnack to stock");
        saltySnackCount += 1;

    }

    public void addStock(Chocolate chocolate) {
        System.out.println("\tadd 1 Chocolate to stock");
        chocolateCount += 1;

    }

    public int buyCount(SoftDrink softdrink) {
        return softDrinkCount;
    }

    public int buyCount(SaltySnack saltySnack) {
        return saltySnackCount;
    }

    public int buyCount(Chocolate chocolate) {
        return chocolateCount;
    }


    public static void main(String[] args) {
        OverloadedVendingMachine buyProduct = new OverloadedVendingMachine();
        buyProduct.buy(new SaltySnack());
        buyProduct.buy(new Chocolate());
        buyProduct.buy(new SoftDrink());
        buyProduct.buy(new Chocolate());


    }

}
