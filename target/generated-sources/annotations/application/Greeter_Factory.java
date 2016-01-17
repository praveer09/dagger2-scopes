package application;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Greeter_Factory implements Factory<Greeter> {
  private final Provider<GreetingProvider> greetingProvider;
  private final Provider<String> visitorProvider;

  public Greeter_Factory(Provider<GreetingProvider> greetingProvider, Provider<String> visitorProvider) {  
    assert greetingProvider != null;
    this.greetingProvider = greetingProvider;
    assert visitorProvider != null;
    this.visitorProvider = visitorProvider;
  }

  @Override
  public Greeter get() {  
    return new Greeter(greetingProvider.get(), visitorProvider.get());
  }

  public static Factory<Greeter> create(Provider<GreetingProvider> greetingProvider, Provider<String> visitorProvider) {  
    return new Greeter_Factory(greetingProvider, visitorProvider);
  }
}

