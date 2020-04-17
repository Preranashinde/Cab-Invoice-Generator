package com.bridgelabz.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
    InvoiceService invoiceService = null;
    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare(){
        invoiceService = new InvoiceService();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceService.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }
    @Test
    public void givenLessDistanceAndTime_shouldReturnTotalFare() {
        invoiceService = new InvoiceService();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceService.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }
    @Test
    public void givenMultipleRides_shouldReturnTotalFare() {
        invoiceService = new InvoiceService();
        Ride[] rides = { new Ride(2.0, 5),
                new Ride(0.1, 1),
        };
        InvoiceSummary summary = invoiceService.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }
    @Test
    public void givenUserIdAndRides_shouldReturnInvoiceSummary() {
        invoiceService = new InvoiceService();
        String userId = "abc.com";
        Ride[] rides = { new Ride(2.0, 5),
                new Ride(0.1, 1),
        };
        invoiceService.addRides(userId , rides);
        InvoiceSummary summary = invoiceService.getInvoiceSummary(userId);
    }
}
