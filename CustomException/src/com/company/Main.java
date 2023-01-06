package com.company;

public class Main {

    public static void main(String[] args) {
        AccountManager manager=new AccountManager();
        System.out.println("Hesap: "+manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap: "+manager.getBalance());
        try{
            manager.withdraw(110);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        //Bu şekilde programcının daha iyi anlayabileceği spesifik bir exceptionn yazdık.
        System.out.println("Hesap: "+manager.getBalance());

    }
}
