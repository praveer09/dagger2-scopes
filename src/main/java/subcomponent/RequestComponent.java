package subcomponent;

import dagger.Subcomponent;
import application.Greeter;
import application.GreeterModule;
import application.RequestScoped;

@RequestScoped
@Subcomponent(modules = GreeterModule.class)
public interface RequestComponent {
    Greeter greeter();
}
