package lk.uok.mmsdb.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.uok.mmsdb.db.DBConnection;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginFormController {
    public AnchorPane loginFormContext;
    public JFXComboBox cmbUserType;
    public JFXTextField txtUsername;
    public JFXPasswordField pswrdPassword;

    public void initialize(){
        cmbUserType.setItems(FXCollections.observableArrayList("Administrator","Doctor","Receptionist","Nurse"));


    }


    public void loginOnAction(ActionEvent actionEvent) throws IOException, SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        try {

            Statement st;
            st = connection.createStatement();

            String username, password, usertype;

            usertype = cmbUserType.getItems().toString();
            username = txtUsername.getText();
            password = String.valueOf(pswrdPassword.getText());

            String query = "";

            switch(usertype){

                case "Administrator":
                    query = "SELECT * FROM mmsdb.administrator WHERE Username = '" + username + "' AND Password='" + password + "'";
                    break;

                case "Doctor":
                    query = "SELECT * FROM mmsdb.doctor WHERE Username = '" + username + "' AND Password='" + password + "'";
                    break;

                case "Receptionist":
                    query = "SELECT * FROM mmsdb.receptionist WHERE Username = '" + username + "' AND Password='" + password + "'";
                    break;

                case "Nurse":
                    query = "SELECT * FROM mmsdb.nurse WHERE Username = '" + username + "' AND Password='" + password + "'";
                    break;
            }


            ResultSet resultSet = st.executeQuery(query);
            if (resultSet.next()) {

                Stage stage=(Stage)loginFormContext.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"))));


            } else
                JOptionPane.showMessageDialog(null, "Invalid user name or password", "Alter", JOptionPane.INFORMATION_MESSAGE);


        } catch (Exception ex) {
            throw new RuntimeException(ex);

        }


    }

    public void cancelOnAction(ActionEvent actionEvent) {
    }

    public void selectOnAction(ActionEvent actionEvent) {
    }
}
