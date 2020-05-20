package vending.product;

public class SoftDrink extends Product {
    private int getAddSoftDrinkStockCount = 0;

    @Override
    public String description() {
        return "This are SoftDrinks";
    }

    @Override
    public void addStock(SoftDrink softdrink) {
        System.out.println("\tadd 1 SoftDrink to stock");
        getAddSoftDrinkStockCount+=1;

    }

    @Override
    public int getSoftDrink(SoftDrink softdrink) {
        return getAddSoftDrinkStockCount;
    }
}
