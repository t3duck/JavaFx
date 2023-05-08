package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HolaMundoConBotonApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label();

        Button button = new Button("Pulsar para saludar");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText("Hola mundo");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().addAll(button, label);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Hola Mundo con Botón App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

