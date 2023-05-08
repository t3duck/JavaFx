package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaUsuarioApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label();

        TextField textField = new TextField();
        Button button = new Button("Saludar");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String nombre = textField.getText();
                if (!nombre.isEmpty()) {
                    label.setText("Hola " + nombre);
                }
            }
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(textField, button, label);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Hola Usuario App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
