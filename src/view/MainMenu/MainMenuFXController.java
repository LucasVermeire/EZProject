package view.MainMenu;

import controller.IMainController;

public class MainMenuFXController {

    private IMainController controller;

    public MainMenuFXController(IMainController controller){
        this.controller = controller;
    }

    public void start(){
        controller.switchView("ListProject");
    }

    public void exit(){
        controller.exit();
    }

}
