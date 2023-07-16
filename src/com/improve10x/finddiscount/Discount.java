package com.improve10x.finddiscount;

public class Discount {
    public double findDiscount(int price, int discountPercentage) {
        double discount= price*discountPercentage/100;
        double finalPrice = price- discount;
        return finalPrice;
    }
}
