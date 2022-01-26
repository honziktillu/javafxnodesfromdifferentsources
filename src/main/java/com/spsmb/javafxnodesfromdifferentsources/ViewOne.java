package com.spsmb.javafxnodesfromdifferentsources;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewOne implements Initializable {



    public AnchorPane mainLayout;
    public Button myButton;
    public Label myLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void changeScene(ActionEvent actionEvent) {
        try {
            FXMLManager.getInstance().setView("ViewTwo", "JavaFX Application - View Two");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeLabel(ActionEvent actionEvent) {
        if (ViewTwo.shadowMyLabel != null) {
            ViewTwo.shadowMyLabel.setText("Hello from view one!");
        }
    }
}
