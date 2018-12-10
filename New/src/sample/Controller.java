package sample;


import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Controller {

    Scene scene;


    @FXML
    private TextField usernameText;

    @FXML
    private PasswordField passwordText;

    @FXML
    private JFXButton loginButton;

    @FXML
    private AnchorPane loginAnchorPane;

    public void handleLogin() throws IOException {

        AnchorPane secondPane = FXMLLoader.load(getClass().getResource("Signup/signup.fxml"));

        Main.signup = new Scene(secondPane, 965, 645);
        Main.window.setScene(Main.signup);
        Main.window.show();


//        loginAnchorPane.getChildren().setAll(secondPane);


    }


}
