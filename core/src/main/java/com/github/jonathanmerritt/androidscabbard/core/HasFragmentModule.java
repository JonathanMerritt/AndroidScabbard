package com.github.jonathanmerritt.androidscabbard.core;

import android.app.Fragment;
import android.app.FragmentManager;
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.FragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.FragmentScoped;
import dagger.Module;
import dagger.Provides;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public abstract class HasFragmentModule {

  @FragmentScoped @FragmentQualified @Provides
  static Class<?> provideFragmentClass(@FragmentQualified Fragment fragment) {
    return fragment.getClass();
  }

  @FragmentScoped @FragmentQualified @Provides
  static FragmentManager provideChildFragmentManager(@FragmentQualified Fragment fragment) {
    return fragment.getChildFragmentManager();
  }
}