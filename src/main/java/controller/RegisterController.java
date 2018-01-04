package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {
    @FXML
    private Button RegisterButton;
    @FXML
    private TextField EmailTextField;
    @FXML
    private TextField NameTextField;
    @FXML
    private PasswordField PassPasswordField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
