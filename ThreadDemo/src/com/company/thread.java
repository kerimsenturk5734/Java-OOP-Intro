package com.company;

public class thread implements Runnable{
    private Thread thread;
    private String threadName;

    public thread(String threadName){//Threadlerin bir ismi olmalıdır.Bu isim sayesinde sistem tarafından ayırt edilebilirler
        this.threadName=threadName;

    }

    @Override
    public void run() {
        //Thread'in yapmasını istediğimiz kodlar burada yer alır.
        System.out.println("Thread çalışıyor");
        try{
            for(int i=0;i<10;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }

        catch (InterruptedException e){
            System.out.println("Thread kesildi");
        }
        System.out.println("Thread bitti.");
    }

    public void start(){ //Genelde start ismi verilen bu method thread'i oluşturur ve başlatılmasını sağlar.
        if(thread==null){
            System.out.println(threadName+" oluşturuluyor");
            thread=new Thread(this,threadName);
            thread.start();
        }
    }

    //BİR THREAD'DE START VE CONSTRUCTOR KISIMLARI SABİTTİR VE HER THREAD'DE BULUNUR.ANCAK RUN METHOD'NUN İÇERĞİ DEĞİŞİR
}
