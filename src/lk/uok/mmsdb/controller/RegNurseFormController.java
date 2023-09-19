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

public class RegNurseFormController {
    public AnchorPane regNurseContext;
    public JFXButton btnRegNurse;
    public TextField txtNurseID;
    public TextField txtNurseName;
    public TextField txtNurseGender;
    public TextField txtNurseDutyHours;
    public TextField txtNurseMobile;
    public TextField txtNurseEmail;
    public TextField txtNurseAddress;
    public TextField txxtNurseUsername;
    public TextField txtNursePassword;

    public void previousPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)regNurseContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DoctorForm.fxml"))));
    }

    public void registerNurseOnAction(ActionEvent actionEvent) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/ mmsdb",
                            "root", "mysql");
            String sql = "INSERT INTO nurse VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setObject(1,Integer.parseInt (txtNurseID.getText()));
            stm.setObject(2, txtNurseName.getText());
            stm.setObject(3, txtNurseGender.getText());
            stm.setObject(4, Integer.parseInt(txtNurseDutyHours.getText()));
            stm.setObject(5, txtNurseMobile.getText());
            stm.setObject(6, txtNurseEmail.getText());
            stm.setObject(7, txtNurseAddress.getText());
            stm.setObject(8, txxtNurseUsername.getText());
            stm.setObject(9, txtNursePassword.getText());
            boolean isSaved = stm.executeUpdate()>0;
            if (isSaved) new Alert(Alert.AlertType.CONFIRMATION,
                    "Nurse was Saved", ButtonType.OK).show();
            else new Alert(Alert.AlertType.WARNING, "Something went wrong! please try again.",
                    ButtonType.CANCEL).show();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void cancelOnAction(ActionEvent actionEvent) {
    }
}
