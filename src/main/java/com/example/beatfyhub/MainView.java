package com.example.beatfyhub;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainView extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainView.class.getResource("main-scene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 810, 545);
        stage.setTitle("Beat.fy HUB");
        Image icon = new Image("Logo_Reverse.png");
        stage.setResizable(false);
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}