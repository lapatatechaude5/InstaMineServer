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

        Button btnCreateServer = new Button("Create Server");
        btnCreateServer.setOnAction(e -> {
            CreateServer createServer = new CreateServer();
            createServer.execute();
        });

        StackPane root = new StackPane();
        root.getChildren().add(btnCreateServer);
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}