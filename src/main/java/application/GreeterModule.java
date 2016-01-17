package application;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class GreeterModule {

    private final String visitor;

    public GreeterModule(String visitor) {
        this.visitor = visitor;
    }

    @Provides
    @RequestScoped
    @Named("Visitor")
    public String provideVisitor() {
        return visitor;
    }
}
