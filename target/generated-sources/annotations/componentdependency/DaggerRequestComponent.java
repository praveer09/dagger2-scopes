package componentdependency;

import application.Greeter;
import application.GreeterModule;
import application.GreeterModule_ProvideVisitorFactory;
import application.Greeter_Factory;
import application.GreetingProvider;
import dagger.internal.Factory;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerRequestComponent implements RequestComponent {
  private Provider<GreetingProvider> greetingProvider;
  private Provider<String> provideVisitorProvider;
  private Provider<Greeter> greeterProvider;

  private DaggerRequestComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.greetingProvider = new Factory<GreetingProvider>() {
      @Override public GreetingProvider get() {
        GreetingProvider provided = builder.applicationComponent.greetingProvider();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.provideVisitorProvider = ScopedProvider.create(GreeterModule_ProvideVisitorFactory.create(builder.greeterModule));
    this.greeterProvider = ScopedProvider.create(Greeter_Factory.create(greetingProvider, provideVisitorProvider));
  }

  @Override
  public Greeter greeter() {  
    return greeterProvider.get();
  }

  public static final class Builder {
    private GreeterModule greeterModule;
    private ApplicationComponent applicationComponent;
  
    private Builder() {  
    }
  
    public RequestComponent build() {  
      if (greeterModule == null) {
        throw new IllegalStateException("greeterModule must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException("applicationComponent must be set");
      }
      return new DaggerRequestComponent(this);
    }
  
    public Builder greeterModule(GreeterModule greeterModule) {  
      if (greeterModule == null) {
        throw new NullPointerException("greeterModule");
      }
      this.greeterModule = greeterModule;
      return this;
    }
  
    public Builder applicationComponent(ApplicationComponent applicationComponent) {  
      if (applicationComponent == null) {
        throw new NullPointerException("applicationComponent");
      }
      this.applicationComponent = applicationComponent;
      return this;
    }
  }
}

