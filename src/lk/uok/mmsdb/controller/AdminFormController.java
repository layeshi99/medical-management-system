package lk.uok.mmsdb.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminFormController {
    public JFXButton btnDoctor;
    public JFXButton btnNurse;
    public JFXButton btnAppointments;
    public JFXButton btnReceptionist;
    public JFXButton btnPatient;
    public JFXButton btnPayments;
    public AnchorPane adminFormContext;

    public void loadDoctorOnAction(ActionEvent actionEvent) throws IOException {
        setUi("DoctorForm");
    }

    public void loadNurseOnAction(ActionEvent actionEvent) throws IOException {
        setUi("NurseForm");
    }

    public void loadAppointmentsOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AppointmentForm");
    }

    public void loadReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionistForm");
    }

    public void loadPatientOnAction(ActionEvent actionEvent) throws IOException {
        setUi("PatientForm");
    }

    public void loadPaymentsOnAction(ActionEvent actionEvent) throws IOException {
        setUi("PaymentForm");
    }

    private void setUi(String location) throws IOException {
        Stage stage=(Stage)adminFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }

    public void previousPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)adminFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));
    }
}
