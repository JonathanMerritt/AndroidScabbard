package com.github.jonathanmerritt.androidscabbard.core.support;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.ChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.ChildFragmentScoped;
import dagger.Module;
import dagger.Provides;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public abstract class HasChildFragmentModule {

  @ChildFragmentScoped @ChildFragmentQualified @Provides
  static Class<?> provideChildFragmentClass(@ChildFragmentQualified Fragment fragment) {
    return fragment.getClass();
  }

  @ChildFragmentScoped @ChildFragmentQualified @Provides
  static FragmentManager provideGrandChildFragmentManager(@ChildFragmentQualified Fragment fragment) {
    return fragment.getChildFragmentManager();
  }
}