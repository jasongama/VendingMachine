package vending.product;

    public class Product {

    public String description() {
        return "This is a product";
     }

     public void addStock(SoftDrink softdrink){
         System.out.println("\tadd 1 SoftDrink to stock");
     }

     public void addStock(SaltySnack saltySnack) {
        System.out.println("\tadd 1 SaltySnack to stock");
     }
     public void addStock(Chocolate chocolate){
         System.out.println("\tadd 1 Chocolate to stock");
     }

}