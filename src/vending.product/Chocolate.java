package vending.product;

public class Chocolate extends Product {
    private int getAddChocolateCount = 0;

    @Override
    public String description() {
        return "This are chocolates";
    }

    @Override
    public void addStock(Chocolate chocolate) {
        System.out.println("\tadd 1 Chocolate to stock");
        getAddChocolateCount+=1;
    }

    @Override
    public int getChocolate(Chocolate chocolate) {
        return getAddChocolateCount;
    }
}
