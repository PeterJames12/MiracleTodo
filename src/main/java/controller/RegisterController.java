package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.User;
import service.UserService;
import service.impl.UserServiceImpl;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {
    @FXML
    private AnchorPane root;
    @FXML
    private Button registerButton;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private PasswordField passPasswordField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       registerButton.setOnAction(event -> register());
    }

    private void register() {
        UserService userService = new UserServiceImpl();
        User user = new User();
        user.setName(nameTextField.getText());
        user.setEmail(emailTextField.getText());
        user.setPassword(passPasswordField.getText());
        try {
            userService.save(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        root.getScene().getWindow().hide();
    }
}
