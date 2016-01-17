package application;

import javax.inject.Inject;

@ApplicationScoped
public class GreetingProvider {
    @Inject
    public GreetingProvider() {
    }

    public String get() {
        return "Hello";
    }
}
