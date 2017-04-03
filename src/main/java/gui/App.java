package gui;

import dependency.injection.component.AppComponent;
import dependency.injection.component.DaggerAppComponent;
import dependency.injection.component.DaggerGuiComponent;
import dependency.injection.component.GuiComponent;
import dependency.injection.module.GuiModule;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.inject.Inject;

public class App extends Application {
    private static GuiComponent guiComponent;
    private static AppComponent appComponent;

    @Inject
    RootView rootView;

    public static void main(String[] args) {
        launch(args);
    }

    private void dependencyInjection() {
        appComponent = DaggerAppComponent.builder()
                .build();
        guiComponent = DaggerGuiComponent.builder()
                .appComponent(appComponent)
                .guiModule(new GuiModule())
                .build();
        guiComponent.inject(this);
    }

    @Override
    public void start(Stage primaryStage) {
        dependencyInjection();
        BorderPane view = rootView.getView();
        primaryStage.setScene(new Scene(view));
        primaryStage.show();
    }

    public static GuiComponent getGuiComponent() {
        return guiComponent;
    }
}
