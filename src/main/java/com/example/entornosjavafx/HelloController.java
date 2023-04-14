package com.example.entornosjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void mouseOver() {
        welcomeText.setText("");
    }

    @FXML
    protected void mouseExit() {
        welcomeText.setText("Viva España y vivan los españoles");
    }





}