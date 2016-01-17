package subcomponent;

import application.ApplicationScoped;
import dagger.Component;
import application.GreeterModule;

@ApplicationScoped
@Component
public interface ApplicationComponent {
    Controller controller();
    RequestComponent requestComponent(GreeterModule greeterModule);
}
