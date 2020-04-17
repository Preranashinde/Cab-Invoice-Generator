package com.bridgelabz.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
    InvoiceGenerator invoiceGenerator = null;
    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare(){
        invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }
    @Test
    public void givenLessDistanceAndTime_shouldReturnTotalFare() {
        invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }
    @Test
    public void givenMultipleRides_shouldReturnTotalFare() {
        invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = { new Ride(2.0, 5),
                new Ride(0.1, 1),
        };
        double fare = invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(30, fare, 0.0);
    }
}
