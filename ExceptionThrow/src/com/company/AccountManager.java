package com.company;

public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance=getBalance()+amount;
    }
    public void withdraw(double amount) throws Exception {
        if(amount<=getBalance()){
            balance=getBalance()-amount;
        }else{
            throw new Exception("Bakiye Yetersiz");//Burada bir exception tanımlanır.
                                                   //fonksiyon buraya düştüğünde exception fırlatılır ve
                                                    // kullanılacağı yerde kontrol edilmesi gerekir
                                                   //Kodu yazan kişinin bunu bilmesi önemlidir.
            //Ancak önemli hatalarda yeni bir exception sınıfı oluşturmak daha etkin görev görür.
        }

    }


    public double getBalance() {
        return balance;
    }
}
