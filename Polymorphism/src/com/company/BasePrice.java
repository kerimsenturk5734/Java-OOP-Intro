package com.company;

public class BasePrice {

    public void computePrice(int hour){
        int price=hour*20;
        System.out.println("Default price:"+price);
    }
}
