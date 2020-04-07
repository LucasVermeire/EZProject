package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Project implements IProject{

    private String description;
    private ProjectManager projectManager;
    private String clientName;
    private List<ITask> taskList;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    public Project(String name, String clientName, String description,ProjectManager projectManager,LocalDate startDate,LocalDate endDate,List<ITask> taskList){
        this.name = name;
        this.clientName = clientName;
        this.description = description;
        this.projectManager = projectManager;
        this.endDate = endDate;
        this.startDate = startDate;
        this.taskList=taskList;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public String getClientName(){
        return clientName;
    }

    @Override
    public String getProjectManager(){
        return projectManager.projectManagerToString();
    }

    @Override
    public void addTask(ITask newTask){
        taskList.add(newTask);
    }

    @Override
    public int getStatus(){
        return 0;
    }

    @Override
    public String getEndDate(){
        return endDate.toString();
    }

    @Override
    public String getStartDate(){
        return startDate.toString();
    }

    @Override
    public int calculateRemainingDays(){
        LocalDate now = LocalDate.now();
        return Integer.parseInt(String.format("%s", now.until(endDate, ChronoUnit.DAYS)));
    }

    @Override
    public List<ITask> getTask(){
        return taskList;
    }
}
