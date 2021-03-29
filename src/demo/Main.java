package demo;

import java.util.FormatFlagsConversionMismatchException;

public class Main {
    public static void main(String[] args){
        Prime p = new Prime();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<20;i++){
                         p.tangXY();
                         p.tinhKetqua();
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<50;i++){
                    System.out.println("T2 i = "+i);
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                        p.thayDoi();
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {}
                }
            }
        });
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t1.start();
//        try {
//            t1.join();
//        }catch (Exception e){}
        t2.start();
        t3.start();
    }
}
