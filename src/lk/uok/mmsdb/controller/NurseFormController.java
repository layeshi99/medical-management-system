package lk.uok.mmsdb.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class NurseFormController {
    public AnchorPane nurseFormContext;
    public JFXButton btnNurDelete;
    public JFXButton btnLoadAll;
    public TableColumn colNurPassword;
    public TableColumn colNurUsername;

    public void previousPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)nurseFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"))));
    }

    public void newNurseOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)nurseFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RegNurseForm.fxml"))));
    }

    public void loadAllOnAction(ActionEvent actionEvent) {
    }

    public void nurDeleteOnAction(ActionEvent actionEvent) {
    }

    public void nurUpdateOnAction(ActionEvent actionEvent) {
    }

    public void cancelOnAction(ActionEvent actionEvent) {
    }
}
