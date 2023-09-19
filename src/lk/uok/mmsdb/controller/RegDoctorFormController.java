package lk.uok.mmsdb.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegDoctorFormController {
    public AnchorPane regDoctorContext;
    public JFXButton btnRegDoctor;
    public TextField txtDocId;
    public TextField txtDocName;
    public TextField txtSpecialization;
    public TextField txtDocFee;
    public TextField txtDocMobile;
    public TextField txtDocEmail;
    public TextField txtDocAddress;
    public TextField txtDocUsername;
    public TextField txtDocPassword;
    public TextField txtDocGender;

    public void previousPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)regDoctorContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DoctorForm.fxml"))));
    }

    public void registerDoctorOnAction(ActionEvent actionEvent) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/ mmsdb",
                            "root", "mysql");
            String sql = "INSERT INTO doctor VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setObject(1,Integer.parseInt (txtDocId.getText()));
            stm.setObject(2, txtDocName.getText());
            stm.setObject(3, txtDocGender.getText());
            stm.setObject(4, txtSpecialization.getText());
            stm.setObject(5, Integer.parseInt(txtDocFee.getText()));
            stm.setObject(6, txtDocMobile.getText());
            stm.setObject(7, txtDocEmail.getText());
            stm.setObject(8, txtDocAddress.getText());
            stm.setObject(9, txtDocUsername.getText());
            stm.setObject(10, txtDocPassword.getText());
            boolean isSaved = stm.executeUpdate()>0;
            if (isSaved) new Alert(Alert.AlertType.CONFIRMATION,
                    "Doctor was Saved", ButtonType.OK).show();
            else new Alert(Alert.AlertType.WARNING, "Something went wrong! please try again.",
            ButtonType.CANCEL).show();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void cancelOnAction(ActionEvent actionEvent) {
    }
}
