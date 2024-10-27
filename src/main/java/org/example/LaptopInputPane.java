package org.example;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class LaptopInputPane extends VBox {
    private TextField nameField;
    private TextField priceField;
    private TextField weightField;
    private TextField ramSizeField;
    private TextField processorTypeField;
    private Button addButton;

    public LaptopInputPane() {
        nameField = new TextField();
        nameField.setPromptText("Введите имя ноутбука");

        priceField = new TextField();
        priceField.setPromptText("Введите цену ноутбука");

        weightField = new TextField();
        weightField.setPromptText("Введите вес ноутбука");

        ramSizeField = new TextField();
        ramSizeField.setPromptText("Введите размер RAM");

        processorTypeField = new TextField();
        processorTypeField.setPromptText("Введите тип процессора");

        addButton = new Button("Добавить ноутбук");
        addButton.setOnAction(event -> addLaptop());

        this.getChildren().addAll(
                new Label("Ноутбук"),
                nameField,
                priceField,
                weightField,
                ramSizeField,
                processorTypeField,
                addButton
        );
    }

    private void addLaptop() {
        // Здесь вы можете обработать добавление ноутбука в список
        System.out.println("Добавлен ноутбук: " + nameField.getText());
    }
}
