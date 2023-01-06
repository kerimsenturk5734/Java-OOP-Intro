package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sehirler=new ArrayList();
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add(1);  //Generic olmayan arraylist her türlü tipde çalışır.
        // Bu durum tip karmaşıklığına sebep olur ve pek önerilmez
        ArrayList<String> sayılar=new ArrayList<String>();
        sayılar.add("1");
        sayılar.add("2");
        sayılar.add("3"); //String olmayan bir değer yazarsam göründğü gibi hata verecektir.


        //Kendi istediğimiz generic yapıyı da üretebiliriz
        MyList<Boolean> logic=new MyList<Boolean>();
        logic.add(true);
        logic.remove(false);

        //Kendi istediğimiz tip ile de çalışabiliriz.
        MyList<Customers> customersMyList=new MyList<Customers>();
        customersMyList.add(new Customers());//Veri tabanına eklenecek müşterilerin bir listesi oluşturulabilir

    }
}
