package com.company;

public interface ICustomerManager extends Idenem,Ideneme { //Sadece interface extend edebilir
                                                            //birden fazla interface extend edebilir
     static void remove(){
          //static ve default metotlar state tutmak zorundadır
     }
     void add(); //state tutmasına gerek yoktur

    class innerClass{
        void update(){
            System.out.println("Update edildi");
        }
    }
    interface innerInterface{
        void read();
    }
}
