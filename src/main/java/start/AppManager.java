package start;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.User;
import util.NotificationUtil;

public class AppManager extends Application{

    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        final User byEmail = userDao.getByEmail("joyukr@ukr.net");
        System.out.println(byEmail);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(""));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("");
        primaryStage.setScene(scene);
        primaryStage.setTitle("MiracleIT");
//        primaryStage.show();
    }
}
