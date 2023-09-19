package lk.uok.mmsdb.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppointmentFormController {
    public AnchorPane appointmentFormContext;
    public TextField txtAppSearch;
    public TableView tblAppointment;
    public TableColumn colAppId;
    public TableColumn colAppPatName;
    public TableColumn colAppPatId;
    public TableColumn colAppDocName;
    public JFXButton btnLoadAll;
    public TableColumn colAppDocId;
    public TableColumn colAppDocCreated;
    public TableColumn colAppDate;
    public TableColumn colAppTime;
    public TableColumn colAppType;

    public void previousPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)appointmentFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"))));
    }

    public void loadAllOnAction(ActionEvent actionEvent) {
    }
}
