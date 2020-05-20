package vending.product;

public class SaltySnacks extends Product {

    @Override
    public String description() {
        return "This is a SaltySnacks";
    }

    @Override
    public void addStock(SaltySnack saltySnack) {
        System.out.println("\tadd 1 SaltySnack to stock");
    }
}