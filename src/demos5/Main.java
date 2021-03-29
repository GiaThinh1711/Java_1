package demos5;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("Hi.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeBytes(" FUCK YOU \n");
            dos.writeBytes(" NON \n");
            dos.writeBytes(" NON \n");
            FileInputStream fis = new FileInputStream("Hi.bin");
            DataInputStream dis = new DataInputStream(fis);
            String txt = dis.readLine();
            while (txt != null){
                System.out.println(txt);
                txt = dis.readLine();
            }
        }catch (FileNotFoundException f) {
            System.out.println("FILE NOT FOUND");
        }catch (IOException io) {
            System.out.println("FILE ERROR");
        }
    }
}
