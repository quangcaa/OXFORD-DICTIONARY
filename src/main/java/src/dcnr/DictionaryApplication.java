package src.dcnr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class DictionaryApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(DictionaryApplication.class.getResource("mainScene.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 920, 770);
            Image favicon = new Image("file:src/main/resources/src/images/logo.png");
            stage.getIcons().add(favicon);
            stage.setTitle("Oxford Dictionary");
            stage.setResizable(false); // Make the app's size cannot change
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}