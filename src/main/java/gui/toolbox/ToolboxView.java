package gui.toolbox;

import gui.glue.FXMLView;
import javafx.scene.layout.GridPane;

public class ToolboxView extends FXMLView {
    public ToolboxView() {
        super("gui/Toolbox.fxml");
    }

    @Override
    public GridPane getView() {
        return (GridPane)super.getView();
    }
}
