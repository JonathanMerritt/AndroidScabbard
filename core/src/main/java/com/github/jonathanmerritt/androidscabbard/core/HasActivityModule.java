package com.github.jonathanmerritt.androidscabbard.core;

import android.app.Activity;
import android.app.FragmentManager;
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.ActivityQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.ActivityScoped;
import dagger.Module;
import dagger.Provides;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public abstract class HasActivityModule {

  @ActivityScoped @ActivityQualified @Provides static Class<?> provideActivityClass(Activity activity) {
    return activity.getClass();
  }

  @ActivityScoped @ActivityQualified @Provides static FragmentManager provideFragmentManager(Activity activity) {
    return activity.getFragmentManager();
  }
}