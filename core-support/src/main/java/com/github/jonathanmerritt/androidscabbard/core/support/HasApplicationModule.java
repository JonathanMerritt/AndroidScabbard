package com.github.jonathanmerritt.androidscabbard.core.support;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.android.support.AndroidSupportInjectionModule;
import javax.inject.Singleton;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module(includes = AndroidSupportInjectionModule.class) public abstract class HasApplicationModule {

  @Singleton @Provides static Class<?> provideApplicationClass(Application application) {
    return application.getClass();
  }

  @Singleton @Provides static Context provideContext(Application application) {
    return application.getBaseContext().getApplicationContext();
  }
}