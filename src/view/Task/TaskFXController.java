package view.Task;

import controller.IMainController;
import javafx.fxml.FXML;

public class TaskFXController {

    private IMainController controller;

    public TaskFXController(IMainController controller){
        this.controller = controller;
    }

    @FXML
    private void backToProject(){
        controller.switchView("ListProject");
    }

    @FXML
    private void addTask(){

    }
}
