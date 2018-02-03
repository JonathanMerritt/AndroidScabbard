package com.github.jonathanmerritt.androidscabbard.support;

import android.util.Log;
import com.github.jonathanmerritt.androidscabbard.support.common.navigation.ApplicationNavigation;
import com.github.jonathanmerritt.androidscabbard.support.common.tag.ApplicationTag;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import javax.inject.Inject;

/** :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018 **/

public class MainApplication extends DaggerApplication {
  @Inject ApplicationNavigation applicationNavigation;
  @Inject ApplicationTag applicationTag;

  @Override public void onCreate() {
    super.onCreate();
    Log.i(applicationTag.full(), "onCreate()");
  }

  @Override protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
    return DaggerMainApplicationComponent.builder().create(this);
  }
}