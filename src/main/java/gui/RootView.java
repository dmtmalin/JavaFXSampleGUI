package gui;

import gui.glue.FXMLView;
import javafx.scene.layout.BorderPane;

public class RootView extends FXMLView {

    public RootView() {
        super("gui/Root.fxml");
    }

    @Override
    public BorderPane getView() {
        return (BorderPane)super.getView();
    }

    @Override
    public RootPresenter getPresenter() {
        return (RootPresenter)super.getPresenter();
    }
}
