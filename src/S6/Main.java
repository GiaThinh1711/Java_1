package S6;
import java.sql.*;

public class Main {
    public final static String connectString ="jdbc:mysql://localhost:3306/T2008M?useUnicode=true&characterEncoding=utf-8" ;    public final static String user = "root";
    public final static String password = "";
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString,user,password);
            Statement stt = conn.createStatement();
            //lietkesinhvien
            String txt_sql = "select * from SinhVien";
            ResultSet rs = stt.executeQuery(txt_sql);
            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("Name"));
                System.out.println(rs.getInt("Age"));
                System.out.println(rs.getInt("Mark"));
            }
            //themsinhvien
            String insert_sql = "insert into SinhVien(Name,Age,Mark) values('lê đạt',1,6)";
            stt.execute(insert_sql);
        }catch (ClassNotFoundException e){
            System.out.println("File not found");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
