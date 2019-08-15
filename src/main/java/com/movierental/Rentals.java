package com.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {
    public int totaFrequentRenterPoints() {
      int totaFrequentRenterPoints = 0;
      for (Rental each : this) {
        // add frequent renter points
        totaFrequentRenterPoints += each.frequentRenterPoints();

      }
      return totaFrequentRenterPoints;
    }

    public double totalAmount() {
      double totalAmount = 0;
      for (Rental each : this) {
        totalAmount += each.amount();
      }
      return totalAmount;
    }
}
