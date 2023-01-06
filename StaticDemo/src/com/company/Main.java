package com.company;

public class Main {

    public static void main(String[] args) {
	    reader myreader=new reader();
        myreader.line="asd"; //static olmayan bir değişken veya fonksiyona instance üzerinden erişilebilir.

        System.out.println(reader.count);
        reader.count=15; //static olan bir değişken veya fonksiyona tanımlandığı class dışında sadece class ismi ile erişilir.
        reader.isReadable();
        System.out.println(reader.count);




    }

    public static void doThose(){
        doThose();
        doThese();
    }                             //STATIC methodlar kendi içlerinde sadece static metodlara erişim sağlayabilirler.
    public static void doThese(){
        doThese();
        doThose();
    }
    private void doIt(){
        doIt();
        doThat();
        doThese();
        doThose();
    }                       //STATIC olmayan bir methoddan static olan veya olmayan bütün methodlara erişilir.

    public void doThat(){
        doThat();
        doIt();
        doThese();
        doThose();
    }
}
