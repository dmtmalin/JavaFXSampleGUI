package gui;

import gui.content.ContentPresenter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class RootPresenter implements Initializable {

    @FXML
    private AnchorPane content;

    @FXML
    private ContentPresenter contentController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public ContentPresenter getContentPresenter() {
        return contentController;
    }
}
