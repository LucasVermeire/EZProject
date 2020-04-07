package view.Project;

import controller.IMainController;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.ITask;
import model.Project;
import model.ProjectManager;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProjectFXController {

    private IMainController controller;

    @FXML
    private DatePicker endDate;

    @FXML
    private DatePicker startDate;

    @FXML
    private TextField projectManager;

    @FXML
    private TextField description;

    @FXML
    private TextField clientName;

    @FXML
    private TextField projectName;

    public ProjectFXController(IMainController controller){
        this.controller = controller;
    }

    @FXML
    private void backToProject(){
        controller.switchView("ListProject");
    }

    @FXML
    private void addProject(){
        String firstNameProjectManager = projectManager.getText(0,projectManager.getText().indexOf(" "));
        String lastNameProjectManager = projectManager.getText(projectManager.getText().indexOf(" ")+1,projectManager.getText().length());

        controller.addProject(new Project(projectName.getText(),clientName.getText(),description.getText(),
                new ProjectManager(firstNameProjectManager,lastNameProjectManager)
                ,startDate.getValue(),endDate.getValue(),new ArrayList<ITask>()));
    }
}
