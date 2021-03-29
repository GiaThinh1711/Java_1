package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
    public void screenD5() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("bt1.fxml"));
        Main.mainStage.setTitle("Danh sach sinh vien");
        Main.mainStage.setScene(new Scene(root,600,400));
        Main.mainStage.show();
    }
}
