package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private static final int MAX_DISCOUNT = 500;
    private static final int MAX_SHIPPING_COST = 100;
    private static final double DISCOUNT_RATE = 0.05;
    private static final double SHIPPING_RATE = 0.1;

    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        return quantity * itemPrice - getDiscount(quantity, itemPrice) + getShippingCost(quantity, itemPrice);
    }

    double getDiscount(int quantity, int itemPrice) {
        return Math.max(0, quantity - MAX_DISCOUNT) * itemPrice * DISCOUNT_RATE;
    }

    double getShippingCost(int quantity, int itemPrice) {
        return Math.min(quantity * itemPrice * SHIPPING_RATE, MAX_SHIPPING_COST);
    }
}
