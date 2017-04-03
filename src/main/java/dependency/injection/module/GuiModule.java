package dependency.injection.module;

import dagger.Module;
import dagger.Provides;
import dependency.injection.scope.GuiComp;
import gui.RootView;
import gui.settings.SettingsView;
import javafx.scene.layout.AnchorPane;

@Module
public class GuiModule {
    @Provides
    @GuiComp
    RootView provideRootView() {
        return new RootView();
    }

    @Provides
    @GuiComp
    AnchorPane provideContentPane(RootView rootView) {
        return rootView
                .getPresenter()
                .getContentPresenter()
                .getContentPane();
    }

    @Provides
    SettingsView provideSettingsView() {
        return new SettingsView();
    }
}
