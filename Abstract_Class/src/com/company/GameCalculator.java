package com.company;

public abstract class GameCalculator {
    public abstract void hesapla();
    //BU SINIF ABSTRACT VE HESAPLA METHODU ABSTRACT BIR METHOD
    //BUNUN ANLAMI BU METHOD DEFAULT OLARAK BELIIRLENMEMISTIR
    // VE EXTEND EDEN TUM SINIFLAR BU METHODU OVERRIDE ETMEK ZORUNDADIR

    public final void  gameOver(){  //FINAL BU METHOD UN OVERRIDE EDILEMEYECEGINI GOSTERIR
        System.out.println("Oyun Bitti");
    }

}
