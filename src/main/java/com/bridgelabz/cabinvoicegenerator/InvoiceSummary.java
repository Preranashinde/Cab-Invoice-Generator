package com.bridgelabz.cabinvoicegenerator;

public class InvoiceSummary {
    private final int noOfRides;
    private final double totalfare;
    private final double averageFare;

    public InvoiceSummary(int noOfRides, double totalFare) {
        this.noOfRides = noOfRides;
        this.totalfare = totalFare;
        this.averageFare = this.totalfare / this.noOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary summary = (InvoiceSummary) o;
        return noOfRides == summary.noOfRides &&
                Double.compare(summary.totalfare, totalfare) == 0 &&
                Double.compare(summary.averageFare, averageFare) == 0;
    }
}
