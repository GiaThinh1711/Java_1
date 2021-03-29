package managestudent.home;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import managestudent.Main;


public class ControllerHome {
    public void danhSach() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../danhsach/haha.fxml"));
        Main.mainStage.setTitle("Quản lý sinh viên");
        Main.mainStage.setScene(new Scene(root,600,400));
        Main.mainStage.show();
    }
    public void themSV(){

    }
}
