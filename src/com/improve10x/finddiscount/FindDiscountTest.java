package com.improve10x.finddiscount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FindDiscountTest {

    @Test
    public void nothing(){

    }
    @Test
    public void givenPriceDiscountPercentage_returnFinalPrice(){
        Discount discount = new Discount();
        double result = discount.findDiscount(0, 0);
        assertEquals(0,result);
    }
    @Test
    public void givenPriceDiscount_returnFinalPrice(){
        Discount discount = new Discount();
        double result = discount.findDiscount(89, 20);
        assertEquals(72.0,result);
    }
    @Test
    public void givenPriceDiscountPercent_returnFinalPrice(){
        Discount discount = new Discount();
        double result = discount.findDiscount(700, 25);
        assertEquals(525,result);
    }
    @Test
    public void givenPriceAndDiscount_returnFinalPrice() {
        Discount discount = new Discount();
        double result = discount.findDiscount(1000, 9);
        assertEquals(910, result);
    }
}




