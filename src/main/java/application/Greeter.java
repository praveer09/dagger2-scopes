package application;

import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
public class Greeter {
    private final String visitor;
    private final GreetingProvider greetingProvider;

    @Inject
    public Greeter(GreetingProvider greetingProvider, @Named("Visitor") String visitor) {
        this.visitor = visitor;
        this.greetingProvider = greetingProvider;
    }

    public String greet() {
        return greetingProvider.get() + " " + visitor;
    }
}
