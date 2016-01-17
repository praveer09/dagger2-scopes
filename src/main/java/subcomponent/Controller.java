package subcomponent;

import application.ApplicationScoped;
import application.GreeterModule;

import javax.inject.Inject;

@ApplicationScoped
public class Controller {
    private final ApplicationComponent applicationComponent;

    @Inject
    public Controller(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    public String handleRequest(String name) {
        RequestComponent requestComponent = applicationComponent
                .requestComponent(new GreeterModule(name));
        return requestComponent.greeter().greet();
    }
}
