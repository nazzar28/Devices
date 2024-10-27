package org.example;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class TabletInputPane extends VBox {
    private TextField nameField;
    private TextField priceField;
    private TextField weightField;
    private TextField batteryLifeField;
    private TextField hasStylusField;
    private Button addButton;

    public TabletInputPane() {
        nameField = new TextField();
        nameField.setPromptText("Введите имя планшета");

        priceField = new TextField();
        priceField.setPromptText("Введите цену планшета");

        weightField = new TextField();
        weightField.setPromptText("Введите вес планшета");

        batteryLifeField = new TextField();
        batteryLifeField.setPromptText("Введите время работы от батареи");

        hasStylusField = new TextField();
        hasStylusField.setPromptText("Есть стилус? (true/false)");

        addButton = new Button("Добавить планшет");
        addButton.setOnAction(event -> addTablet());

        this.getChildren().addAll(
                new Label("Планшет"),
                nameField,
                priceField,
                weightField,
                batteryLifeField,
                hasStylusField,
                addButton
        );
    }

    private void addTablet() {
        // Здесь вы можете обработать добавление планшета в список
        System.out.println("Добавлен планшет: " + nameField.getText());
    }
}
