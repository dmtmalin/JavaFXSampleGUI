package gui.settings;

import gui.glue.FXMLView;
import javafx.scene.layout.GridPane;

public class SettingsView extends FXMLView {
    public SettingsView() {
        super("gui/Settings.fxml");
    }

    @Override
    public GridPane getView() {
        return (GridPane)super.getView();
    }
}
