package lk.uok.mmsdb.controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.uok.mmsdb.view.tm.DoctorTM;

import java.io.IOException;
import java.sql.*;

public class DoctorFormController {
    public AnchorPane doctorFormContext;
    public TextField txtDocSearch;
    public TableView<DoctorTM> tblDoctor;
    public TableColumn colDocId;
    public TableColumn colDocName;
    public TableColumn colDocGender;
    public TableColumn colDocSpecialization;
    public TableColumn colDocFee;
    public TableColumn colDocMobile;
    public TableColumn colDocEmail;
    public TableColumn colDocAddress;
    public TableColumn colDocUsername;
    public TableColumn colDocPassword;
    public JFXButton btnLoadAll;
    public JFXButton btnDocDelete;
    public JFXButton btnDocUpdate;


    public void previousPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)doctorFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"))));
    }

    public void newDoctorOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)doctorFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RegDoctorForm.fxml"))));
    }

    public void loadAllOnAction(ActionEvent actionEvent) {

    }

    public void docDeleteOnAction(ActionEvent actionEvent) {
    }

    public void docUpdateOnAction(ActionEvent actionEvent) {
    }

    public void cancelOnAction(ActionEvent actionEvent) {
    }
}
