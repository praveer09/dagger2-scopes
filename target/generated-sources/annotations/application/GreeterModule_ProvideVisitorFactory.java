package application;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GreeterModule_ProvideVisitorFactory implements Factory<String> {
  private final GreeterModule module;

  public GreeterModule_ProvideVisitorFactory(GreeterModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {  
    String provided = module.provideVisitor();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<String> create(GreeterModule module) {  
    return new GreeterModule_ProvideVisitorFactory(module);
  }
}

