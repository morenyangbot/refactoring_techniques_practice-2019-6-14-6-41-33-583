package com.tws.refactoring.extract_variable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {
    private PriceCalculator priceCalculator;

    @Before
    public void init() {
        priceCalculator = new PriceCalculator();
    }

    @Test
    public void should_return_1100_when_call_quantity_500_and_item_price_2() {
        int quantity = 500;
        int itemPrice = 2;

        double result = priceCalculator.getPrice(quantity, itemPrice);
        assertEquals(1100.0, result, 0);
    }

    @Test
    public void should_return_550_when_call_quantity_100_and_item_price_5() {
        int quantity = 100;
        int itemPrice = 5;

        double result = priceCalculator.getPrice(quantity, itemPrice);
        assertEquals(550, result, 0);
    }

    @Test
    public void should_return_655_when_call_quantity_600_and_item_price_1() {
        int quantity = 600;
        int itemPrice = 1;

        double result = priceCalculator.getPrice(quantity, itemPrice);
        assertEquals(655, result, 0);
    }
}