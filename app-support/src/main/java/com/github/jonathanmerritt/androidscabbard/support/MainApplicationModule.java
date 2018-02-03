package com.github.jonathanmerritt.androidscabbard.support;

import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.AppCompatActivityScoped;
import com.github.jonathanmerritt.androidscabbard.core.support.HasApplicationModule;
import com.github.jonathanmerritt.androidscabbard.core.support.IsApplicationModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/** :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018 **/

@Module(includes = HasApplicationModule.class) public interface MainApplicationModule
    extends IsApplicationModule<MainApplication> {

  @AppCompatActivityScoped @ContributesAndroidInjector(modules = { MainActivityModule.class })
  MainActivity contributeMainActivity();
}