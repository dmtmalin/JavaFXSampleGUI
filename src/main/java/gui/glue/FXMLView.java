package gui.glue;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;

public class FXMLView {
    private Parent view;
    private Object presenter;

    public FXMLView(String templateName) {
        try {
            URL location = this
                    .getClass()
                    .getClassLoader()
                    .getResource(templateName);
            FXMLLoader loader = new FXMLLoader(location);
            view = loader.load();
            presenter = loader.getController();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object getPresenter() {
        return presenter;
    }

    public Parent getView() {
        return view;
    }
}
