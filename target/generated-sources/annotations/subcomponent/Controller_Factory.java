package subcomponent;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Controller_Factory implements Factory<Controller> {
  private final Provider<ApplicationComponent> applicationComponentProvider;

  public Controller_Factory(Provider<ApplicationComponent> applicationComponentProvider) {  
    assert applicationComponentProvider != null;
    this.applicationComponentProvider = applicationComponentProvider;
  }

  @Override
  public Controller get() {  
    return new Controller(applicationComponentProvider.get());
  }

  public static Factory<Controller> create(Provider<ApplicationComponent> applicationComponentProvider) {  
    return new Controller_Factory(applicationComponentProvider);
  }
}

