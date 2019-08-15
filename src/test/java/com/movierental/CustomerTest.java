package com.movierental;

import org.junit.Test;
import org.junit.Assert;

public class CustomerTest {
    @Test
    public void test(){}
    @Test
    public void shouldmatchtextstatement(){
        Customer customer = new Customer("Gobi");
        Movie movie = new Movie("NKP",2);
        Rental rental = new Rental(movie,10);
        customer.addRental(rental);
        Assert.assertEquals("Rental Record for Gobi\n" +
                "\tNKP\t12.0\n" +
                "Amount owed is 12.0\n" +
                "You earned 1 frequent renter points",customer.statement());
    }
    @Test
    public void shouldmatchHTMLstatement(){
        Customer customer = new Customer("Gobi");
        Movie movie = new Movie("NKP",2);
        Rental rental = new Rental(movie,10);
        customer.addRental(rental);
        Assert.assertEquals("<h1>Rental Record for <b>Gobi</b></h1><br/>" +
                "\tNKP\t12.0<br/>" +
                "Amount owed is <b>12.0</b><br/>" +
                "You earned <b>1</b> frequent renter points",customer.htmlStatement());
    }

}