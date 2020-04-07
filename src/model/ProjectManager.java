package model;

public class ProjectManager extends Participant {

    public ProjectManager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String projectManagerToString(){
        return getFirstName() + " " + getLastName();
    }
}
