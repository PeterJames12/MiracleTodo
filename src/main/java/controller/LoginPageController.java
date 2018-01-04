package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import service.UserService;
import service.impl.UserServiceImpl;
import start.AppManager;
import util.NotificationUtil;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginPageController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField passPasswordField;
    @FXML
    private Button registerButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginButton.setOnAction(event -> checkLogAndPass());
        registerButton.setOnAction(event -> newRegister());
    }

    private void checkLogAndPass() {
        UserService userService = new UserServiceImpl();
        boolean checkPass = userService.checkPass(emailTextField.getText(), passPasswordField.getText());
        if (checkPass) {
            try {
                AppManager.getStage().setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/MainPage.fxml"))));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            NotificationUtil.notification("Error", "Could not enter", "Try again");
        }
    }

    private void newRegister() {
        try {
            AppManager.getStage().setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/RegisterPage.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
