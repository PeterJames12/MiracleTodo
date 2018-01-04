package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import model.Todo;
import model.User;
import service.TodoService;
import service.impl.TodoServiceImple;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class MainPageController implements Initializable {

    @FXML
    private Button addButton;
    @FXML
    private Button closeButton;
    @FXML
    private TableView<Todo> tableView;
    @FXML
    private TableColumn<Todo, Integer> idTableColumn;
    @FXML
    private TableColumn<Todo, String> nameTableColumn;
    @FXML
    private TableColumn<Todo, String> statusTableColumn;
    @FXML
    private TableColumn<Todo, String> creationDateTableColumn;

    private ObservableList<Todo> todoList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        init();
        addButton.setOnAction(this::add);
    }

    private void add(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/view/AddPage.fxml"));
        Parent parent = null;
        final Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        Window window = ((Node) event.getSource()).getScene().getWindow();
        stage.initOwner(window);
        stage.show();

        stage.setOnHiding(e -> load());
    }

    private void init() {
        idTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        creationDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("creationDate"));
        load();
    }

    private void load() {
        todoList.clear();
        List<Todo> todoByUserId = null;
        TodoService todoService = new TodoServiceImple();
        try {
            todoByUserId = todoService.getTodoByUserId();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        todoList.addAll(todoByUserId);
        tableView.setItems(todoList);
    }
}
