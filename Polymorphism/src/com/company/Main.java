package com.company;

public class Main {

    public static void main(String[] args) {

        //This projects purpose that learn polymorphism in the JAVA

       /* BasePrice[] basePrice=new BasePrice[] {new BasePrice(),new ChildPrice(),new StudentPrice()};

        for(BasePrice basePrice1:basePrice){
            basePrice1.computePrice(5);
        }

        ChildPrice childPrice=new ChildPrice();
        childPrice.computePrice(5,7);*/

        ChildPrice childPrice=new ChildPrice();
        StudentPrice studentPrice=new StudentPrice();
        BasePrice basePrice=new BasePrice();

        PriceManager priceManager=new PriceManager(studentPrice);

    }
}
