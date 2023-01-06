public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();

        //POLİMORFİK YAPI İLE İSTEDİĞİMİZ ZAMAN DATABASE'İ DEĞİŞTİREBİLİR
        // İSTEDİĞİMİZ ZAMAN KOLAYCA YENİ BİR ÖZELLİK EKLYEBİLİRİZ
        //BURADA ORACLE CLASS I YERİNE SQL,MYSQL.. İSTEDİĞİM VERİ TABANINI IMPLEMENT EDEBILIRIM
        customerManager.databaseManager=new OracleDatabaseManager();
        customerManager.getCustomers();

        customerManager.databaseManager=new SqlServerDatabaseManager();
        customerManager.getCustomers();
    }
}
