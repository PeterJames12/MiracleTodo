package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPageController implements Initializable {
    @FXML
    private Button AddButton;
    @FXML
    private Button CloseButton;
    @FXML
    private TableView<User> TableView;
    @FXML
    private TableColumn<User, Integer> IDTableColumn;
    @FXML
    private TableColumn<User, String> NameTableColumn;
    @FXML
    private TableColumn<User, String> StatusTableColumn;
    @FXML
    private TableColumn<User, String> CreationDateTableColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
