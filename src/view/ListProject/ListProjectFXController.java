package view.ListProject;

import controller.IMainController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import java.net.URL;
import java.util.ResourceBundle;

public class ListProjectFXController implements Initializable {

    private IMainController controller;

    @FXML
    private Label nameProject;

    @FXML
    private Label client;

    @FXML
    private Label projectManager;

    @FXML
    private ListView<String> listView;

    @FXML
    private Label message ;

    @FXML
    private Label participant ;

    @FXML
    private Label startDate ;

    @FXML
    private Label endDate ;

    @FXML
    private Label daysRemaining;

    @FXML
    private GridPane gridPaneProject;


    public ListProjectFXController(IMainController controller){
        this.controller = controller;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String [] names = controller.getNameOfProject();
        ObservableList<String> values = FXCollections.observableArrayList(names);
        listView.setItems(values);
        message.setText("Veuillez sélectionné un projet !");
        gridPaneProject.setVisible(false);
    }

    @FXML
    private void loadProject(){

        String [] projects = new String [] {"Projet de Lucas", "Projet de Romain"};

        int index1 = 0;
        int index2 = 1;

        message.setText(" ");
        gridPaneProject.setVisible(true);

        chooseNameProject(projects[index1],projects[index2],index1,index2);
    }

    @FXML
    private void finance(){
        controller.switchView("Finance");
    }

    @FXML
    private void addTask(){
        controller.switchView("Task");
    }

    @FXML
    private void addProject(){
        controller.switchView("Project");
    }

    @FXML
    private void watchTask(){
        if(message.getText().equals("Projet de Lucas sélectionné !")){
            controller.taskWindow("ListTask1");
        }else{
            controller.taskWindow("ListTask2");
        }
    }


    private void chooseNameProject(String project1,String project2,int index1,int index2){
        if(listView.getSelectionModel().getSelectedItem() == null){
            message.setText("Aucun projet sélectionné !");
            gridPaneProject.setVisible(false);
        }else if(listView.getSelectionModel().getSelectedItem().equals(project1)){
            setDataProject(project1, index1);
            setDataProject2(index1);
        }else if(listView.getSelectionModel().getSelectedItem().equals(project2)){
            setDataProject(project2, index2);
            setDataProject2(index2);
        }
    }

    private void setDataProject(String project, int index) {
        setNameProject(index);
        setClient(index);
        setProjectManager(index);
        setMessage(project);
        setDifferenceDates(index);
    }

    private void setDataProject2(int index) {
        setParticipant();
        setStartDate(index);
        setEndDate(index);
        setDifferenceDates(index);
    }


    private void setProjectManager(int index){
        projectManager.setText(controller.getProjectManager(index));
    }

    private void setNameProject(int index){
        nameProject.setText(controller.getNameProject(index));
    }

    private void setClient(int index){
        client.setText(controller.getClientName(index));
    }

    private void setMessage(String project){
        message.setText(project + " sélectionné !");
    }

    private void setParticipant(){
        participant.setText(String.valueOf(controller.getNameOfProject().length));
    }

    private void setStartDate(int index){
        startDate.setText(controller.getStartDate(index));
    }

    private void setEndDate(int index){
        endDate.setText(controller.getEndDate(index));
    }

    private void setDifferenceDates(int index){
        daysRemaining.setText(String.valueOf(controller.calculateRemainingDays(index)));
    }
}
