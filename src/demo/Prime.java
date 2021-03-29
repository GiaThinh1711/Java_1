package demo;

public class Prime {
    int x=1;
    int y=1;
    int z=0;
    public void tangXY(){
        x++;
        y++;
    }
    public void tinhKetqua(){
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println(Thread.currentThread().getName()+"---");
    }
    public void thayDoi(){
        z++;
        System.out.println("Z = "+z);
        System.out.println(Thread.currentThread().getName()+"---");
    }
    public void thayDoiXY(){
        tangXY();
        tinhKetqua();
    }
}
