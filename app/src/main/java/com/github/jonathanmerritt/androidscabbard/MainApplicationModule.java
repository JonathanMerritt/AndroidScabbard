package com.github.jonathanmerritt.androidscabbard;

import com.github.jonathanmerritt.androidscabbard.annotations.scope.ActivityScoped;
import com.github.jonathanmerritt.androidscabbard.core.HasApplicationModule;
import com.github.jonathanmerritt.androidscabbard.core.IsApplicationModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/** :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018 **/

@Module(includes = HasApplicationModule.class) public interface MainApplicationModule
    extends IsApplicationModule<MainApplication> {

  @ActivityScoped @ContributesAndroidInjector(modules = { MainActivityModule.class })
  MainActivity contributeMainActivity();
}