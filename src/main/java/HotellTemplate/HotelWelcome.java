package HotellTemplate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HotelWelcome extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println(this.getClass().getResource("/HotelWelcome.fxml").getPath());

        Parent root = FXMLLoader.load(this.getClass().getResource("/HotelWelcome.fxml"));
        primaryStage.setTitle("Hotel welcome page");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

