package org.example;

import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SmartphoneInputPane extends VBox {
    private TextField nameField;
    private TextField priceField;
    private TextField weightField;
    private TextField screenSizeField;
    private TextField cameraResolutionField;

    public SmartphoneInputPane() {
        nameField = new TextField();
        nameField.setPromptText("Enter smartphone name");

        priceField = new TextField();
        priceField.setPromptText("Enter smartphone price");

        weightField = new TextField();
        weightField.setPromptText("Enter smartphone weight");

        screenSizeField = new TextField();
        screenSizeField.setPromptText("Enter screen size");

        cameraResolutionField = new TextField();
        cameraResolutionField.setPromptText("Enter camera resolution");

        this.getChildren().addAll(nameField, priceField, weightField, screenSizeField, cameraResolutionField);
    }
}
