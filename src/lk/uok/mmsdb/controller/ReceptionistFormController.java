package lk.uok.mmsdb.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistFormController {
    public AnchorPane receptionistFormContext;

    public void previousPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)receptionistFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"))));
    }

    public void newReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)receptionistFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RegReceptionistForm.fxml"))));
    }

    public void loadAllOnAction(ActionEvent actionEvent) {
    }

    public void recDeleteOnAction(ActionEvent actionEvent) {
    }

    public void recUpdateOnAction(ActionEvent actionEvent) {
    }

    public void cancelOnAction(ActionEvent actionEvent) {
    }
}
