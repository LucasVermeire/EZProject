package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Projects implements IProjects {

    private List<IProject> projectList;


    public Projects(){
        projectList = new ArrayList<IProject>();

        List<ITask> arrayTask1 = new ArrayList<>();
        List<ITask> arrayTask2 = new ArrayList<>();

        createListITask(arrayTask1,arrayTask2);

        projectList.add(new Project("Projet de Lucas",
                "Ville de Mons",
                "Ceci est une description",
                new ProjectManager("Lucas","Vermeire"), LocalDate.of(2019,12,9), LocalDate.of(2020, 1, 1)
                ,arrayTask1));

        projectList.add(new Project("Projet de Romain",
                "Ville de Liège",
                "Ceci est une description",
                new ProjectManager("Romain","Demaret"), LocalDate.of(2020,1,21), LocalDate.of(2020, 4, 30),
                arrayTask2));
    }

    private void createListITask( List<ITask> arrayTask1, List<ITask> arrayTask2){
        arrayTask1.add(new Task("Tache 1 de Lucas",
                new Participant("Lucas","Vermeire"),
                "ceci est une description",12,LocalDate.of(2019,12,9),
                LocalDate.of(2020, 1, 1)));

        arrayTask1.add(new Task("Tache 2 de Lucas",
                new Participant("Lucas","Vermeire"),
                "ceci est une description",9,LocalDate.of(2019,12,9),
                LocalDate.of(2020, 1, 1)));

        arrayTask2.add(new Task("Tache 1 de Romain",
                new Participant("Lucas","Vermeire"),
                "ceci est une description",12,LocalDate.of(2019,12,9),
                LocalDate.of(2020, 1, 1)));

        arrayTask2.add(new Task("Tache 2 de Romain",
                new Participant("Lucas","Vermeire"),
                "ceci est une description",9,LocalDate.of(2019,12,9),
                LocalDate.of(2020, 1, 1)));
    }

    @Override
    public String getNameProject(int index){
        IProject project = projectList.get(index);
        return project.getName();
    }

    @Override
    public String [] getNameTask(int indexProject){
        String [] arrayProjects = new String[projectList.get(indexProject).getTask().size()];
        int i = 0;

        for(ITask item : projectList.get(indexProject).getTask()){
            arrayProjects[i] = item.getName();
            i++;
        }
        return arrayProjects;
    }

    @Override
    public String getNameClient(int index){
        IProject project = projectList.get(index);
        return project.getClientName();
    }

    @Override
    public String getProjectManager(int index){
        IProject project = projectList.get(index);
        return project.getProjectManager();
    }

    @Override
    public String [] getNameOfProject(){
        String [] arrayProjects = new String[projectList.size()];
        int i = 0;

        for(IProject item : projectList){
            arrayProjects[i] = item.getName();
            i++;
        }
        return arrayProjects;
    }

    @Override
    public String getStartDate(int index){
        IProject project = projectList.get(index);
        return project.getStartDate();
    }

    @Override
    public String getEndDate(int index){
        IProject project = projectList.get(index);
        return project.getEndDate();
    }

    @Override
    public int calculateRemainingDays(int index){
        IProject project = projectList.get(index);
        return project.calculateRemainingDays();
    }

    @Override
    public void addProject(IProject project){
        projectList.add(project);
    }

    @Override
    public void addTask(ITask task, int index){
        IProject project = projectList.get(index);
        project.addTask(task);
    }
}
