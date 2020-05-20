package vending.product;

public class SaltySnack extends Product{
    private int getAddSaltySnackCount = 0;

    @Override
    public String description() {
        return "This are SaltySnacks";
    }

    @Override
    public void addStock(SaltySnack saltySnack) {
        System.out.println("\tadd 1 SaltySnack to stock");
        getAddSaltySnackCount+=3;
    }

    @Override
    public int getSaltySnack(SaltySnack saltySnack) {
        return getAddSaltySnackCount;
    }
}
