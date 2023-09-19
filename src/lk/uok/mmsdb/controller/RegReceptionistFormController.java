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

public class RegReceptionistFormController {
    public AnchorPane regReceptionistContext;
    public JFXButton btnRegReceptionist;
    public TextField txtRecId;
    public TextField txtReName;
    public TextField txtRecGender;
    public TextField txtRecDutyHours;
    public TextField txtRecMobile;
    public TextField txtRecEmail;
    public TextField txtRecAddress;
    public TextField txtRecUsername;
    public TextField txtRecPassword;

    public void previousPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)regReceptionistContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DoctorForm.fxml"))));
    }

    public void registerReceptionistOnAction(ActionEvent actionEvent) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/ mmsdb",
                            "root", "mysql");
            String sql = "INSERT INTO receptionist VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setObject(1,Integer.parseInt (txtRecId.getText()));
            stm.setObject(2, txtReName.getText());
            stm.setObject(3, txtRecGender.getText());
            stm.setObject(4, Integer.parseInt(txtRecDutyHours.getText()));
            stm.setObject(5, txtRecMobile.getText());
            stm.setObject(6, txtRecEmail.getText());
            stm.setObject(7, txtRecAddress.getText());
            stm.setObject(8, txtRecUsername.getText());
            stm.setObject(9, txtRecPassword.getText());
            boolean isSaved = stm.executeUpdate()>0;
            if (isSaved) new Alert(Alert.AlertType.CONFIRMATION,
                    "Receptionist was Saved", ButtonType.OK).show();
            else new Alert(Alert.AlertType.WARNING, "Something went wrong! please try again.",
                    ButtonType.CANCEL).show();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void cancelOnAction(ActionEvent actionEvent) {
    }
}
