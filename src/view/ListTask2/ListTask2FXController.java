package view.ListTask2;

import controller.IMainController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ListTask2FXController implements Initializable {

    private IMainController controller;

    @FXML
    private ListView<String> listView;

    public ListTask2FXController(IMainController controller) {
        this.controller = controller;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String [] names = controller.getNameTask(1);
        ObservableList<String> values = FXCollections.observableArrayList(names);
        listView.setItems(values);
    }

    @FXML
    private void exit(){
        controller.exit();
    }
}
