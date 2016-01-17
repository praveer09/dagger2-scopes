package componentdependency;

import application.ApplicationScoped;
import application.GreetingProvider;
import componentdependency.Controller;
import dagger.Component;

@ApplicationScoped
@Component
public interface ApplicationComponent {
    Controller controller();
    GreetingProvider greetingProvider();
}
