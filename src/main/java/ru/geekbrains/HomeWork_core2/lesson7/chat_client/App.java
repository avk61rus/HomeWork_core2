package ru.geekbrains.HomeWork_core2.lesson7.chat_client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.Stage;
import javax.swing.*;
import java.util.Objects;

public class App extends Application{
    
    public static JInternalFrame stage1;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/My/scene.fxml")));
        primaryStage.setTitle("WhoWhere");
        primaryStage.setScene(new Scene(root, 700, 800, Color.LIGHTGOLDENRODYELLOW));
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
   
}

