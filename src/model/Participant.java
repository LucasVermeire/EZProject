package model;

public class Participant extends User implements IParticipant{

    private double cost;
    private Role role;

    public Participant(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public double getCost(){
        return cost;
    }

    @Override
    public void setCost(double cost){
        this.cost = cost;
    }

    @Override
    public Role getRole(){
        return role;
    }

    @Override
    public void setRole(Role role){
        this.role = role;
    }

}
