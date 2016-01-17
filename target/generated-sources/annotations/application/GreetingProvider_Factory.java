package application;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum GreetingProvider_Factory implements Factory<GreetingProvider> {
INSTANCE;

  @Override
  public GreetingProvider get() {  
    return new GreetingProvider();
  }

  public static Factory<GreetingProvider> create() {  
    return INSTANCE;
  }
}

