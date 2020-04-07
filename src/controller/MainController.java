package controller;

import model.IProject;
import model.ITask;
import model.Projects;
import view.Finance.FinanceFXController;
import view.ListTask1.ListTask1FXController;
import view.ListTask2.ListTask2FXController;
import view.MainMenu.MainMenuFXController;
import view.ListProject.ListProjectFXController;
import view.Project.ProjectFXController;
import view.SwitchView;
import view.Task.TaskFXController;
import java.util.HashMap;

public class MainController implements IMainController {

    private SwitchView switchView;
    private HashMap<String, Object> controllers;
    private Projects projects = new Projects();

    public MainController(SwitchView switchView) {
        controllers = new HashMap<>();
        controllers.put("MainMenu", new MainMenuFXController(this));
        controllers.put("ListProject", new ListProjectFXController(this));
        controllers.put("Finance", new FinanceFXController(this));
        controllers.put("Task", new TaskFXController(this));
        controllers.put("Project", new ProjectFXController(this));
        controllers.put("ListTask1", new ListTask1FXController(this));
        controllers.put("ListTask2", new ListTask2FXController(this));

        this.switchView = switchView;
    }

    @Override
    public void switchView(String fileFXML) {
        switchView.loadView(fileFXML,controllers);
    }

    @Override
    public void taskWindow(String fileFXML){
        switchView.taskWindow(fileFXML,controllers);
    }

    @Override
    public void exit() {
        System.exit(0);
    }

    @Override
    public String getNameProject(int index){
        return projects.getNameProject(index);
    }

    @Override
    public String[] getNameTask(int indexProject){ return projects.getNameTask(indexProject);}

    @Override
    public String getClientName(int index){
        return projects.getNameClient(index);
    }

    @Override
    public String[] getNameOfProject(){
        return projects.getNameOfProject();
    }

    @Override
    public String getProjectManager(int index){
        return projects.getProjectManager(index);
    }

    @Override
    public String getStartDate(int index){
        return projects.getStartDate(index);
    }

    @Override
    public String getEndDate(int index){
        return projects.getEndDate(index);
    }

    @Override
    public int calculateRemainingDays(int index){
        return projects.calculateRemainingDays(index);
    }

    @Override
    public void addProject(IProject project){
        projects.addProject(project);
    }

    @Override
    public void addTask(ITask task, int index){
        projects.addTask(task,index);
    }
}
