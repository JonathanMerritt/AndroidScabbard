package com.github.jonathanmerritt.androidscabbard.core.support;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.GrandChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.GrandChildFragmentScoped;
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
  static FragmentManager provideSupportGreatGrandChildFragmentManager(
      @GrandChildFragmentQualified Fragment fragment) {
    return fragment.getChildFragmentManager();
  }
}