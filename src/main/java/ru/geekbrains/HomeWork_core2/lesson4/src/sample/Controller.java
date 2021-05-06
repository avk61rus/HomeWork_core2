package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Controller {
    public ListView onLineUsers;
    public TextArea chatArea;
    public TextField inputField;
    public Button btnSendMessage;
    
    public void myProfile(ActionEvent actionEvent) {
    }
    
    public void Setings(ActionEvent actionEvent) {
    }
    
    public void exit(ActionEvent actionEvent) {
        Platform.exit();
    }
    
    public void manual(ActionEvent actionEvent) throws URISyntaxException, IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI("https://faq.whatsapp.com/"));
    }
    
    public void about(ActionEvent actionEvent) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("about.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("О программе");
            stage.setScene(scene);
            stage.show();
    }
    
    public void teme(ActionEvent actionEvent) {
    }
    
    public void sendMessage(ActionEvent actionEvent) {
        appendTxtFromTF();
    }
    
    private void appendTxtFromTF() {
        String msg = inputField.getText();
        if(msg.isEmpty()) return;
        chatArea.appendText("Я: " + msg + System.lineSeparator());
//        chatArea.textFormatterProperty();
        inputField.clear();
    }
    
//    public void sendMessage(InputMethodEvent inputMethodEvent) {
//        appendTxtFromTF();
//    }
}

