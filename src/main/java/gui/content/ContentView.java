package gui.content;

import gui.glue.FXMLView;
import javafx.scene.layout.AnchorPane;

public class ContentView extends FXMLView {

    public ContentView() {
        super("gui/Content.fxml");
    }

    @Override
    public AnchorPane getView() {
        return (AnchorPane)super.getView();
    }

    @Override
    public  ContentPresenter getPresenter(){
        return (ContentPresenter)super.getPresenter();
    }
}
