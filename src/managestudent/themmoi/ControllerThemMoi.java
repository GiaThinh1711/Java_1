//package managestudent.themmoi;
//
//import javafx.scene.control.TextField;
//import managestudent.model.SinhVien;
//
//import java.io.*;
//import java.util.List;
//
//public class ControllerThemMoi {
//    public TextField txtName;
//    public TextField txtAge;
//    public TextField txtMark;
//
//    public void add(List<SinhVien> sinhVienList){
//        try{
//            FileOutputStream fos = new FileOutputStream("Student.bin");
//            DataOutputStream dos = new DataOutputStream(fos);
//            FileInputStream fis = new FileInputStream("Student.bin");
//            DataInputStream dis = new DataInputStream(fis);
//            String txt = dis.readLine();
//            while (txt != null){
//                System.out.println(txt);
//                txt = dis.readLine();
//            }
//        }catch (FileNotFoundException f){
//                System.out.println("FILE NOT FOUND");
//        }catch (IOException io) {
//            System.out.println("FILE ERROR");
//        }
//    }
//
//    public void back(){
//
//    }
//}
