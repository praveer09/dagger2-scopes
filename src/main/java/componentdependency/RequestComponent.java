package componentdependency;

import dagger.Component;
import application.Greeter;
import application.GreeterModule;
import application.RequestScoped;

@RequestScoped
@Component(
        dependencies = ApplicationComponent.class,
        modules = GreeterModule.class)
public interface RequestComponent {
    Greeter greeter();
}
