package view.Finance;

import controller.IMainController;
import javafx.fxml.FXML;

public class FinanceFXController {

    private IMainController controller;

    public FinanceFXController(IMainController controller) {
        this.controller = controller;
    }

    @FXML
    private void backToProject(){
        controller.switchView("ListProject");
    }
}
