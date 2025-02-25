package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainLauncher extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btnPhysicsService = new Button("Launch Physics Service");
        btnPhysicsService.setOnAction(e -> launchPhysicsService());

        VBox root = new VBox(10, btnPhysicsService);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Main Launcher");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void launchPhysicsService() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PhysicsCalculatorGUI.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Physics Calculator");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}