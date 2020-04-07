package controller;

import model.IProject;
import model.ITask;

public interface IMainController {
    void switchView(String fileFXML);
    void exit();
    String getNameProject(int index);
    String[] getNameOfProject();
    String getClientName(int index);
    String getProjectManager(int index);
    String getStartDate(int index);
    String getEndDate(int index);
    int calculateRemainingDays(int index);
    void addProject(IProject project);
    void addTask(ITask task, int index);
    void taskWindow(String fileFXML);
    String[] getNameTask(int indexProject);
}
