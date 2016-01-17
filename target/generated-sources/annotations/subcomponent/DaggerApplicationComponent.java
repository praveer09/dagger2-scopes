package subcomponent;

import application.Greeter;
import application.GreeterModule;
import application.GreeterModule_ProvideVisitorFactory;
import application.Greeter_Factory;
import application.GreetingProvider;
import application.GreetingProvider_Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<ApplicationComponent> applicationComponentProvider;
  private Provider<Controller> controllerProvider;
  private Provider<GreetingProvider> greetingProvider;

  private DaggerApplicationComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static ApplicationComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.applicationComponentProvider = InstanceFactory.<ApplicationComponent>create(this);
    this.controllerProvider = ScopedProvider.create(Controller_Factory.create(applicationComponentProvider));
    this.greetingProvider = ScopedProvider.create(GreetingProvider_Factory.create());
  }

  @Override
  public Controller controller() {  
    return controllerProvider.get();
  }

  @Override
  public RequestComponent requestComponent(GreeterModule greeterModule) {  
    return new RequestComponentImpl(greeterModule);
  }

  public static final class Builder {
    private Builder() {  
    }
  
    public ApplicationComponent build() {  
      return new DaggerApplicationComponent(this);
    }
  }

  private final class RequestComponentImpl implements RequestComponent {
    private final GreeterModule greeterModule;
    private Provider<String> provideVisitorProvider;
    private Provider<Greeter> greeterProvider;
  
    private RequestComponentImpl(GreeterModule greeterModule) {  
      if (greeterModule == null) {
        throw new NullPointerException();
      }
      this.greeterModule = greeterModule;
      initialize();
    }
  
    private void initialize() {  
      this.provideVisitorProvider = ScopedProvider.create(GreeterModule_ProvideVisitorFactory.create(greeterModule));
      this.greeterProvider = ScopedProvider.create(Greeter_Factory.create(DaggerApplicationComponent.this.greetingProvider, provideVisitorProvider));
    }
  
    @Override
    public Greeter greeter() {  
      return greeterProvider.get();
    }
  }
}

