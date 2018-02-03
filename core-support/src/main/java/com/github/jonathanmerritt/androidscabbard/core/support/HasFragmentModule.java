package com.github.jonathanmerritt.androidscabbard.core.support;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.FragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.FragmentScoped;
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
  static FragmentManager provideSupportChildFragmentManager(@FragmentQualified Fragment fragment) {
    return fragment.getChildFragmentManager();
  }
}