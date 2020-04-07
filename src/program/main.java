package program;

import controller.IMainController;
import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import view.MainMenu.MainMenuFXController;
import view.SwitchView;
import java.io.IOException;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root;
        try {
            FXMLLoader chargerFXML = new FXMLLoader (getClass().getResource("/view/MainMenu/MainMenu.fxml"));
            IMainController control = new MainController(new SwitchView(primaryStage));
            MainMenuFXController FXMLControl = new MainMenuFXController(control);

            chargerFXML.setController(FXMLControl);
            root = chargerFXML.load();

            primaryStage.setTitle("EZ Project");
            primaryStage.getIcons().add(new Image("@../../img/logo.png"));
            Scene scene = new Scene(root,800,600);
            primaryStage.setScene(scene);
            primaryStage.show();

        }catch(IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void main(String[]args) {
        launch(args);
    }
}
