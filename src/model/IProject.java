package model;


import java.util.List;

public interface IProject {
    String getName();
    String getDescription();
    String getClientName();
    void addTask(ITask newTask);
    int getStatus();
    String getProjectManager();
    String getStartDate();
    String getEndDate();
    int calculateRemainingDays();
    List<ITask> getTask();
}
