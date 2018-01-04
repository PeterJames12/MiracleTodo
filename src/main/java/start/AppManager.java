package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppManager extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(""));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("");
        primaryStage.setScene(scene);
        primaryStage.setTitle("MiracleIT");
        primaryStage.show();
    }
}
