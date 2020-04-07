package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task implements ITask{

    private String commentary;
    private int completion;
    private String name;
    private String description;
    private int estimatedEffort;
    private IParticipant participant;
    private Dependencies dependency;
    private LocalDate startDate;
    private LocalDate endDate;

    public Task(String name,IParticipant participant,String description,int estimatedEffort, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.description = description;
        this.estimatedEffort =estimatedEffort;
        this.participant = participant;
        this.endDate = endDate;
        this.startDate = startDate;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void setDescription(String description){
       this.description = description;
    }

    @Override
    public void setEstimatedEffort(int estimatedEffort){
        this.estimatedEffort = estimatedEffort;
    }

    @Override
    public void setParticipant(IParticipant participant){
        this.participant = participant;
    }

    @Override
    public void setCompletion (int completion){
        this.completion = completion;
    }

    @Override
    public void setCommentary(String commentary){
        this.commentary = commentary;
    }

    @Override
    public int calculateDays(){
        LocalDate now = LocalDate.now();
        return Integer.parseInt(String.format("%s", now.until(endDate, ChronoUnit.DAYS)));
    }

    @Override
    public boolean verifyTask(){
        int nbrDays = calculateDays();
        return nbrDays >= 1 && nbrDays <= 30;
    }

    @Override
    public boolean verifyEstimatedEffort(){
        return estimatedEffort >=4 && estimatedEffort <= 160;
    }

}
