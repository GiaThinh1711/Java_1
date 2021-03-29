package demo;

public class DemoWait {
    public static void main(String[] args){
        Account ac = new Account();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ac.napTien(160000);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ac.rutTien(1500000);
            }
        });
        t1.start();
        t2.start();
    }
}
