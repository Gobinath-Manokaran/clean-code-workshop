//package com.movierental;
//
//public class StatementCalculation {
//    private Customer customer;
//    public StatementCalculation(Customer customer){
//        this.customer = customer;
//    }
//    public calculateTotalamount(){
//        for (Rental each : customer.rentals) {
//            double thisAmount = 0;
//            //determine amounts for each line
//            switch (each.getMovie().getPriceCode()) {
//                case Movie.REGULAR:
//                    thisAmount += 2;
//                    if (each.getDaysRented() > 2)
//                        thisAmount += (each.getDaysRented() - 2) * 1.5;
//                    break;
//                case Movie.NEW_RELEASE:
//                    thisAmount += each.getDaysRented() * 3;
//                    break;
//                case Movie.CHILDRENS:
//                    thisAmount += 1.5;
//                    if (each.getDaysRented() > 3)
//                        thisAmount += (each.getDaysRented() - 3) * 1.5;
//                    break;
//            }
//    }
//}
