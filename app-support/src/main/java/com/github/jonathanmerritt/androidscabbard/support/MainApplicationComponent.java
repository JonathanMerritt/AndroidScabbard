package com.github.jonathanmerritt.androidscabbard.support;

import dagger.Component;
import dagger.android.AndroidInjector;
import javax.inject.Singleton;

/** :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018 **/

@Singleton @Component(modules = { MainApplicationModule.class }) public interface MainApplicationComponent
    extends AndroidInjector<MainApplication> {
  @Component.Builder abstract class Builder extends AndroidInjector.Builder<MainApplication> {
  }
}