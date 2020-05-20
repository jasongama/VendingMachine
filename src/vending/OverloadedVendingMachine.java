package vending;

public class OverloadedVendingMachine {
    private int softDrinkCount = 0;
    private int saltySnackCount = 0;
    private int chocolateCount = 0;


    public void buy(SoftDrink softdrink) {
        System.out.println(" Buy 1 SoftDrink");
        softDrinkCount++;
    }

    public void buy(SaltySnack saltySnack) {
        System.out.println("Buy 1 saltySnack");
        saltySnackCount++;
    }

    public void buy(Chocolate chocolate) {
        System.out.println("Buy 1 chocolate");
        chocolateCount++;

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


    }

}
