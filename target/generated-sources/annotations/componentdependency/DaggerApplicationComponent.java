package componentdependency;

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
  public GreetingProvider greetingProvider() {  
    return greetingProvider.get();
  }

  public static final class Builder {
    private Builder() {  
    }
  
    public ApplicationComponent build() {  
      return new DaggerApplicationComponent(this);
    }
  }
}

