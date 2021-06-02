package org.example;

/**
 * Self-Checkout
 */
public class App {
    public static void main( String[] args ) {
        Item item1 = new Item(1);
        Item item2 = new Item(2);
        Item item3 = new Item(3);

        final double taxRate = 5.5;
        double subtotal, tax, total;
        String subtotalSt, taxSt, totalSt;

        item1.createItem();
        item2.createItem();
        item3.createItem();

        subtotal = item1.getValue() + item2.getValue() + item3.getValue();
        tax = subtotal * (5.5 / 100);
        total = subtotal + tax;

        subtotalSt = String.format("Subtotal:  %.2f", subtotal);
        taxSt = String.format("     Tax:  %.2f", tax);
        totalSt = String.format("   Total:  %.2f", total);

        System.out.println(subtotalSt);
        System.out.println(taxSt);
        System.out.println(totalSt);
    }

}
