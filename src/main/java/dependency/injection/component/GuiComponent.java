package dependency.injection.component;

import dagger.Component;
import dependency.injection.module.GuiModule;
import dependency.injection.scope.GuiComp;
import gui.App;
import gui.settings.SettingsView;
import javafx.scene.layout.AnchorPane;

@GuiComp
@Component(dependencies = AppComponent.class, modules = {GuiModule.class})
public interface GuiComponent {
    void inject(App app);
    SettingsView getSettingsView();
    AnchorPane getContentPane();
}
