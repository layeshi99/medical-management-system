package lk.uok.mmsdb.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentFormController {
    public AnchorPane paymentFormContext;

    public void previousPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)paymentFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"))));
    }
}
