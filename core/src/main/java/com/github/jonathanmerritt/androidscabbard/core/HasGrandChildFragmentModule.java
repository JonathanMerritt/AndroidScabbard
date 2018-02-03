package com.github.jonathanmerritt.androidscabbard.core;

import android.app.Fragment;
import android.app.FragmentManager;
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.GrandChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.GrandChildFragmentScoped;
import dagger.Module;
import dagger.Provides;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public abstract class HasGrandChildFragmentModule {

  @GrandChildFragmentScoped @GrandChildFragmentQualified @Provides
  static Class<?> provideGrandChildFragmentClass(@GrandChildFragmentQualified Fragment fragment) {
    return fragment.getClass();
  }

  @GrandChildFragmentScoped @GrandChildFragmentQualified @Provides
  static FragmentManager provideGreatGrandChildFragmentManager(@GrandChildFragmentQualified Fragment fragment) {
    return fragment.getChildFragmentManager();
  }
}