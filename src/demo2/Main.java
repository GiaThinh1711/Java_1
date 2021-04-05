package demo2;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args){
        ResourceBundle us = ResourceBundle.getBundle("demo2.Session9_Messages",Locale.US);
        Locale vi = new Locale("vi","VN");
        Locale.setDefault(vi);
        ResourceBundle vn = ResourceBundle.getBundle("demo2.Session9_Messages",vi);
        System.out.println("Xin chào bằng tiếng anh: "+us.getString("hello"));
        System.out.println("Xin chào bằng tiếng việt: "+vn.getString("hello"));
    }
}
