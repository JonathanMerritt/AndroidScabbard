package com.github.jonathanmerritt.androidscabbard.core.support;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.AppCompatActivityQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.AppCompatActivityScoped;
import dagger.Module;
import dagger.Provides;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public abstract class HasAppCompatActivityModule {

  @AppCompatActivityScoped @AppCompatActivityQualified @Provides
  static Class<?> provideAppCompatActivityClass(AppCompatActivity appCompatActivity) {
    return appCompatActivity.getClass();
  }

  @AppCompatActivityScoped @AppCompatActivityQualified @Provides
  static FragmentManager provideSupportFragmentManager(AppCompatActivity appCompatActivity) {
    return appCompatActivity.getSupportFragmentManager();
  }
}