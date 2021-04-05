package models;

import config.Connector;
import models.entity.Sinhvien;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ModelSinhVien implements DataAccessObject<Sinhvien> {

    @Override
    public ArrayList<Sinhvien> getlist() {
        ArrayList<Sinhvien> arrayList = new ArrayList<>();
        try {
            Statement st = Connector.getInstance().getStatement();
            String txt_sql = "select * from SinhVien";
            ResultSet rs = st.executeQuery(txt_sql);
            while (rs.next()){
                arrayList.add(new Sinhvien(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getInt("mark")));
            }
        }catch (Exception e){

        }
        return null;
    }

    @Override
    public boolean create(Sinhvien sinhvien) {
        return false;
    }
}
