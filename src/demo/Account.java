package demo;

public class Account {
    int balance;
    public synchronized void napTien(int amout){
        balance+=amout;
        System.out.println("Nạp "+amout+" thành công");
        try{
            notify();
        }catch (Exception e){}
    }
    public synchronized void rutTien(int amout){
        if(balance <= amout){
            System.out.println("BỐ MÀY ĐANG GỬI");
            try{
                notify();
            }catch (Exception e){}
        }
            balance -= amout;
            System.out.println("Rút "+amout+" thành công");
    }
}
