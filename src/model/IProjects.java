package model;

public interface IProjects {
    String getNameProject(int index);
    String [] getNameOfProject();
    String getNameClient(int index);
    String getProjectManager(int index);
    String getStartDate(int index);
    String getEndDate(int index);
    int calculateRemainingDays(int index);
    void addProject(IProject project);
    void addTask(ITask task, int index);
    String []getNameTask(int indexProject);
}
