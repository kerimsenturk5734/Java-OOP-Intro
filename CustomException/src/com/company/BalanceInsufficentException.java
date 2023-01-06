package com.company;

public class BalanceInsufficentException extends Exception{ //Bir exception olduğu yazacağımız için
    private String message;                                 // Exception sınıfadan extend ediyoruz.

    public BalanceInsufficentException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
    //Bu çok spesifik bir exception oldu.Ancak mevcut balance ile ilgili bir exception yazıp bunları ondan extends edebiliriz.
}
