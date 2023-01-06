package com.company;

public class Main {

    public static void main(String[] args) {
        WomanGameCalculator woman=new WomanGameCalculator();
        woman.hesapla();
        woman.gameOver();

        //BIR ABSTRACT CLASS INSTANCE EDILDIGINDE ABSTRACT METHOD'U BURADA OVERRIDE EDILMELIDIR.
        //BU KULLANIM PEK HOS BIR KULLANIM DEGILDIR.BU YUZDEN ABSTRACT CLASS KULLANIYORSAK ONU EXTEND ETTIGIMIZ SINIFLARIN OLMASI MANTIKLI OLANDIR.
        //BU EXTEND ETTIGIMIZ SINIFIN INSTANCE 'I ILE CALISMAK DOGRU OLANDIR.
        //----------------------------------------------------------------------
        GameCalculator gameCalculator=new GameCalculator() {
            @Override
            public void hesapla() {
            }
        };
        //----------------------------------------------------------------------
    }
}
