package com.company;

public class StudentPrice extends BasePrice {

    public void computePrice(int hour){
        int price=hour*15;
        System.out.println("Student Price:"+price);
    }
}
