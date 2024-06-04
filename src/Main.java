public class Main {
    public static void main(String[] args) {
        // let's do this;
        double subTotal = 0.00;
        double taxRate = 0.05;
        double salesTaxAm = 0.00;
        double taxedTotal = 0.00;

        System.out.println("Please enter the price of your item.");
        subTotal = 59.99;
        salesTaxAm = subTotal * taxRate;
        taxedTotal = subTotal + salesTaxAm;
        System.out.println("Your subtotal is " + subTotal + ".  Taxed at a rate of " + taxRate + ", you w" +
                "ill pay " + salesTaxAm + " in tax for a total of " + taxedTotal + ".");



    }
}