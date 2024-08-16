package com.site999.Server;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VersionServerSelector extends Application {

    private String selectedVersion;

    public void show() {
        Stage stage = new Stage();
        stage.setTitle("Select Minecraft Server Version");

        ComboBox<String> versionComboBox = new ComboBox<>();
        versionComboBox.setItems(FXCollections.observableArrayList(
                "Spigot", "Bukkit", "BungeeCord", "Waterfall"
        ));

        Button btnConfirm = new Button("Confirm");
        btnConfirm.setOnAction(e -> {
            selectedVersion = versionComboBox.getValue();
            if (selectedVersion != null) {
                // Logique pour utiliser la version sélectionnée
                System.out.println("Selected version: " + selectedVersion);
                stage.close();
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(versionComboBox, btnConfirm);

        Scene scene = new Scene(layout, 300, 150);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void start(Stage primaryStage) {
        show();
    }

    public String getSelectedVersion() {
        return selectedVersion;
    }
}