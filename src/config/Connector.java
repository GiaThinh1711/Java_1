package config;
import java.sql.*;
public class Connector {
     private static Connector connector;

     Statement statement ;
    public final static String connectString ="jdbc:mysql://localhost:3306/T2008M?useUnicode=true&characterEncoding=utf-8" ;
    public final static String user = "root";
    public final static String password = "";
     private Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString,user,password);
            Statement stt = conn.createStatement();
        }catch (Exception e){
            System.out.println("ERROR");
        }
     }
     public static Connector getInstance(){
         if (connector == null)
             connector = new Connector();
         return connector;
     }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
}
