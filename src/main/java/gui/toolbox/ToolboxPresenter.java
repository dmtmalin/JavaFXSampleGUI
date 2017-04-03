package gui.toolbox;

import gui.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ToolboxPresenter implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleButtonBillboardAction(ActionEvent event) {
        GridPane settingsView =  App.getGuiComponent()
                .getSettingsView()
                .getView();
        AnchorPane contentPane = App.getGuiComponent()
                .getContentPane();
        contentPane.getChildren().clear();
        contentPane.getChildren().add(settingsView);
    }
}
