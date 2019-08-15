package com.movierental;

import java.util.List;

public class Customer {
  private String name;
  private Rentals rentals = new Rentals();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    return new TextStatement().display(rentals, this.getName());
  }

  public String htmlStatement(){
    String result = "<h1>Rental Record for <b>" + getName() + "</b></h1><br/>";
    double totalAmount =    rentals.totalAmount();
    int totaFrequentRenterPoints = rentals.totaFrequentRenterPoints();

    for (Rental each : rentals) {
      //show figures for this rental
      result += "\t" + each.getMovie().getTitle() + "\t" +
              String.valueOf(each.amount()) + "<br/>";
    }
    //add footer lines result
    result += "Amount owed is <b>" + String.valueOf(totalAmount) + "</b><br/>";
    result += "You earned <b>" + String.valueOf(totaFrequentRenterPoints)
            + "</b> frequent renter points";
    return result;
  }

  private class TextStatement {
    public String display(Rentals rentals, String name) {
      String result = "Rental Record for " + name + "\n";
      for (Rental each : rentals) {
        //show figures for this rental
        result += "\t" + each.getMovie().getTitle() + "\t" +
                String.valueOf(each.amount()) + "\n";
      }
      //add footer lines result
      result += "Amount owed is " + String.valueOf(rentals.totalAmount()) + "\n";
      result += "You earned " + String.valueOf(rentals.totaFrequentRenterPoints())
          + " frequent renter points";
      return result;
    }
  }
}

