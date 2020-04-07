package model;

public interface ITask {
    void setDescription(String description);
    void setEstimatedEffort(int estimatedEffort);
    void setParticipant(IParticipant participant);
    void setCompletion (int completion);
    void setCommentary(String commentary);
    int calculateDays();
    boolean verifyTask();
    boolean verifyEstimatedEffort();
    void setName(String name);
    String getName();
}
