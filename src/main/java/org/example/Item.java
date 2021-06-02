package org.example;

import java.util.Scanner;

public class Item {
    Scanner scanner = new Scanner(System.in);

    private double price;
    private int itemNumber, quantity;

    Item (int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void createItem() {
        System.out.print("Enter the price of item " +  itemNumber + ": ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity of item " +  itemNumber + ": ");
        quantity = scanner.nextInt();
    }

    public double getValue() {
        return price * quantity;
    }

}
