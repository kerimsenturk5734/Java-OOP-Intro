package com.company;

public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance=getBalance()+amount;
    }
    public void withdraw(double amount) throws BalanceInsufficentException {
        if(amount<=getBalance()){
            balance=getBalance()-amount;
        }else{
            throw new BalanceInsufficentException("Bakiye Yetersiz");//Burada bir exception tanımlanır.
                                                   //fonksiyon buraya düştüğünde exception fırlatılır ve
                                                    // kullanılacağı yerde kontrol edilmesi gerekir
                                                   //Kodu yazan kişinin bunu bilmesi önemlidir.

        }

    }


    public double getBalance() {
        return balance;
    }
}
