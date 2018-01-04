package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginPageController implements Initializable {

    @FXML
    private Button LoginButton;
    @FXML
    private TextField EmailTextField;
    @FXML
    private PasswordField PassPasswordField;
    @FXML
    private Button RegisterButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
