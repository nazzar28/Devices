package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class DeviceController {
    @FXML private TabPane deviceTabPane;
    @FXML private ListView<Device> listView;
    @FXML private TextField nameField, priceField, weightField;
    @FXML private TextField screenSizeField, cameraResolutionField; // Smartphone fields
    @FXML private TextField ramSizeField, processorTypeField; // Laptop fields
    @FXML private TextField batteryLifeField;
    @FXML private CheckBox hasStylusCheckBox; // Tablet fields
    @FXML private Label selectedText;
    
    private ObservableList<Device> devices = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        listView.setItems(devices);
    }

    @FXML
    protected void handleAdd() {
        // Retrieve selected tab and corresponding fields
        Tab selectedTab = deviceTabPane.getSelectionModel().getSelectedItem();
        String name = nameField.getText();
        double price = Double.parseDouble(priceField.getText());
        double weight = Double.parseDouble(weightField.getText());

        Device device = null;
        if (selectedTab.getText().equals("Smartphone")) {
            double screenSize = Double.parseDouble(screenSizeField.getText());
            double cameraResolution = Double.parseDouble(cameraResolutionField.getText());
            device = new Smartphone(name, price, weight, screenSize, cameraResolution);
        } else if (selectedTab.getText().equals("Laptop")) {
            int ramSize = Integer.parseInt(ramSizeField.getText());
            String processorType = processorTypeField.getText();
            device = new Laptop(name, price, weight, ramSize, processorType);
        } else if (selectedTab.getText().equals("Tablet")) {
            double batteryLife = Double.parseDouble(batteryLifeField.getText());
            boolean hasStylus = hasStylusCheckBox.isSelected();
            device = new Tablet(name, price, weight, batteryLife, hasStylus);
        }

        if (device != null) {
            devices.add(device);
        }
    }

    @FXML
    protected void handleRemove() {
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();
        if (selectedDevice != null) {
            devices.remove(selectedDevice);
        }
    }

    @FXML
    protected void onListClicked() {
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();
        if (selectedDevice != null) {
            selectedText.setText(selectedDevice.toString());
        }
    }
}
