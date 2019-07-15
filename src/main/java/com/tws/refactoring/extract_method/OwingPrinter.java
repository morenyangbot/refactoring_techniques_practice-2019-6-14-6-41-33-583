package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();

        printBanner();
        double outstanding = getAmount(elements);
        printOutstanding(name, outstanding);
    }

    void printBanner() {
        System.out.print("*****************************\n");
        System.out.print("****** Customer totals ******\n");
        System.out.print("*****************************\n");
    }

    double getAmount(Iterator<Order> elements) {
        double outstanding = 0.0;
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    void printOutstanding(String name, Double outstanding) {
        // print details
        System.out.print("name: " + name + "\n");
        System.out.print("amount: " + outstanding + "\n");
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
