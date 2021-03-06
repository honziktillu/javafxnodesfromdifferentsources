package com.spsmb.javafxnodesfromdifferentsources;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLManager fxmlManager = FXMLManager.getInstance();
        fxmlManager.init(HelloApplication.class, stage);
        fxmlManager.setTitleChangeOnLoad(true);
        fxmlManager.setView("ViewOne", "JavaFX Application - View One");
        fxmlManager.setAppIcon("image.jpg");
        fxmlManager.setStyleSheet("style.css");
        fxmlManager.printViews();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}