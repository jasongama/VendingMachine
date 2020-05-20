package vending.product;

public class Product {
    private int getStockCount = 0;
    private int getAddSoftDrinkStockCount = 0;
    private int getAddSaltySnackCount = 0;
    private int getAddChocolateCount = 0;

    public String description() {
        return "This is a product";
    }

    public void addStock(SoftDrink softdrink) {
        System.out.println("\tadd 1 SoftDrink to stock");
        getAddSoftDrinkStockCount += 3;
    }

    public void addStock(SaltySnack saltySnack) {
        System.out.println("\tadd 1 SaltySnack to stock");
        getAddSaltySnackCount += 3;

    }

    public void addStock(Chocolate chocolate) {
        System.out.println("\tadd 1 Chocolate to stock");
        getAddChocolateCount += 3;

    }

    public void addStock(Product product) {
        getAddSoftDrinkStockCount += 3;
        getAddSaltySnackCount += 3;
        getAddChocolateCount += 3;
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