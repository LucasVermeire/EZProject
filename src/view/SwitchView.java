package view;

import controller.IMainController;
import controller.MainController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import view.MainMenu.MainMenuFXController;

import java.io.IOException;
import java.util.HashMap;

public class SwitchView {

    private Stage stage;

    public SwitchView(Stage stage) {
        this.stage = stage;
    }

    public void loadView(String pathFXML, HashMap<String, Object> controllers) {
        Parent root;
        try {
            Object controller = controllers.get(pathFXML);
            FXMLLoader chargerFXML = new FXMLLoader(getClass().getResource("../view/" + pathFXML +"/" + pathFXML + ".fxml"));
            chargerFXML.setController(controller);
            root = chargerFXML.load();
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void taskWindow(String pathFXML, HashMap<String, Object> controllers){
        Parent root;
        try {
            Object controller = controllers.get(pathFXML);
            FXMLLoader chargerFXML = new FXMLLoader(getClass().getResource("../view/" + pathFXML +"/" + pathFXML + ".fxml"));
            chargerFXML.setController(controller);
            root = chargerFXML.load();

            Stage stage = new Stage();
            stage.setTitle("List of Tasks");
            Scene scene = new Scene(root,300,500);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
