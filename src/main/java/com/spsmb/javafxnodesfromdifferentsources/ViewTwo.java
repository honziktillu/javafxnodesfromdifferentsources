package com.spsmb.javafxnodesfromdifferentsources;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewTwo implements Initializable {
    public AnchorPane mainLayout;
    public Button myButton;
    public Label myLabel;

    public static AnchorPane shadowMainLayout;
    public static Button shadowMyButton;
    public static Label shadowMyLabel;

    private FXMLManager fxmlManager;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        fxmlManager = FXMLManager.getInstance();
        shadowMainLayout = mainLayout;
        shadowMyButton = myButton;
        shadowMyLabel = myLabel;
    }

    public void changeScene(ActionEvent actionEvent) {
        try {
            FXMLManager.getInstance().setView("ViewOne", "JavaFX Application - View One");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeLabel(ActionEvent actionEvent) {
        ViewOne viewOneController = (ViewOne) fxmlManager.getController("ViewOne");
        viewOneController.myLabel.setText("Hello from view two!");
    }

    public void resetLabel(ActionEvent actionEvent) {
        myLabel.setText("View Two");
    }
}
