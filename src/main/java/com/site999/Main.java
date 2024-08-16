package com.site999;

import com.site999.Server.CreateServer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("InstaMineServer");

        Button createserveracceuil = new Button();
        createserveracceuil.setText("Créer un serveur");
        createserveracceuil.setOnAction(event -> {
            CreateServer.create();
        });

        // Layout de base
        StackPane root = new StackPane();
        root.getChildren().add(createserveracceuil);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
