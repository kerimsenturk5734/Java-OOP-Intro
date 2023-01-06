package com.company;

public class Main {

    public static void main(String[] args) {
        ICustomerManager manager=new SQLManager();
        manager.add();

        ICustomerManager manager1=new OracleManager();
        manager1.add();

        ICustomerManager customerManager=new ICustomerManager() {
            @Override
            public void add() {
                System.out.println("Genel customer'a eklendi");
            }
        };

        ICustomerManager.innerClass asd=new ICustomerManager.innerClass();
        ICustomerManager.innerInterface innerInterface=new ICustomerManager.innerInterface() {
            @Override
            public void read() {
                System.out.println("read edildi");
            }
        };

    }
}
