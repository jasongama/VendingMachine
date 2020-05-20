package vending.product;

public class Product {
    private int getAddSoftDrinkStockCount = 0;
    private int getAddSaltySnackCount = 0;
    private int getAddChocolateCount = 0;

    public String description() {
        return "This is a product";
    }

    public void addStock(SoftDrink softdrink) {
        System.out.println("\tadd 1 SoftDrink to stock");
        getAddSoftDrinkStockCount += 1;
    }

    public void addStock(SaltySnack saltySnack) {
        System.out.println("\tadd 1 SaltySnack to stock");
        getAddSaltySnackCount += 1;

    }

    public void addStock(Chocolate chocolate) {
        System.out.println("\tadd 1 Chocolate to stock");
        getAddChocolateCount += 1;

    }

    public void addStock(Product product) {
        getAddSoftDrinkStockCount += 1;
        getAddSaltySnackCount += 1;
        getAddChocolateCount += 1;
    }

    public int getSoftDrink(SoftDrink softdrink) {
        return getAddSoftDrinkStockCount;
    }

    public int getSaltySnack(SaltySnack saltySnack) {
        return getAddSaltySnackCount;
    }

    public int getChocolate(Chocolate chocolate) {
        return getAddChocolateCount;
    }




}