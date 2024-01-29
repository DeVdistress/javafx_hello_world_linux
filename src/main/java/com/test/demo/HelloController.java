package com.test.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        if (welcomeText != null)
            welcomeText.setText("Welcome to JavaFX Application!");
    }
}