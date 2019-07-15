package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private OwingPrinter owingPrinter = new OwingPrinter();


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void should_print_banner() {
        owingPrinter.printBanner();
        assertEquals("*****************************\n****** Customer totals ******\n*****************************\n", outContent.toString());
    }

    @Test
    public void should_calculate_amount() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(10.0));
        orders.add(new Order(1.5));
        assertEquals(11.5, owingPrinter.getAmount(orders.iterator()), 0);
    }

    @Test
    public void should_print_outstanding() {
        owingPrinter.printOutstanding("test", 10.0);
        assertEquals("name: test\namount: 10.0\n", outContent.toString());
    }

    @Test
    public void printOwing() {
        OwingPrinter owingPrinter = new OwingPrinter();
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(10));
        orders.add(new Order(1.5));
        owingPrinter.printOwing("name", orders);

        assertEquals("*****************************\n****** Customer totals ******\n*****************************\nname: name\namount: 11.5\n", outContent.toString());
    }
}