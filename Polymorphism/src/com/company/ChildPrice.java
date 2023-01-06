package com.company;

public class ChildPrice extends BasePrice {

    public void computePrice(int hour,int age) {
        int price=hour*(age-5);
        System.out.println("Child Price:"+price);
    }
}
