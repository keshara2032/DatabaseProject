package sample.Signup;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import sample.Main;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class SignupController {


    @FXML
    private JFXButton homeButton;

    @FXML
    private JFXButton exitButton;


    @FXML
    void backToHome() throws IOException {

        Main.window.setScene(Main.login);
        Main.window.show();


    }

    @FXML
    void createProfile() {

    }

    @FXML
    void exitAction() {

    }






}
