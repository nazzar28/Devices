package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DeviceApp.fxml"));
            Parent root = loader.load();

            primaryStage.setTitle("Device Manager");

            // Создайте TabPane и добавьте вкладки для каждого типа устройства
            TabPane tabPane = new TabPane();

            // Вкладка для смартфонов
            Tab smartphoneTab = new Tab("Smartphone");
            // Здесь добавьте интерфейс для ввода данных смартфона
            smartphoneTab.setContent(new SmartphoneInputPane());
            smartphoneTab.setClosable(false);

            // Вкладка для ноутбуков
            Tab laptopTab = new Tab("Laptop");
            // Здесь добавьте интерфейс для ввода данных ноутбука
            laptopTab.setContent(new LaptopInputPane());
            laptopTab.setClosable(false);

            // Вкладка для планшетов
            Tab tabletTab = new Tab("Tablet");
            // Здесь добавьте интерфейс для ввода данных планшета
            tabletTab.setContent(new TabletInputPane());
            tabletTab.setClosable(false);

            // Добавляем вкладки в TabPane
            tabPane.getTabs().addAll(smartphoneTab, laptopTab, tabletTab);

            VBox layout = new VBox(tabPane);
            Scene scene = new Scene(layout, 400, 300);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Печатаем стек вызовов исключения
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
