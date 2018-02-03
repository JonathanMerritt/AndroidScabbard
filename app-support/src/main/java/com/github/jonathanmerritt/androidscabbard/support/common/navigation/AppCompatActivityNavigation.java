package com.github.jonathanmerritt.androidscabbard.support.common.navigation;

import android.support.v4.app.FragmentManager;
import android.util.Log;
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.AppCompatActivityQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.AppCompatActivityScoped;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseAppCompatActivity;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseFragment;
import com.github.jonathanmerritt.androidscabbard.support.common.tag.AppCompatActivityTag;
import javax.inject.Inject;

import static com.github.jonathanmerritt.androidscabbard.support.common.navigation.Utilities.replace;
import static java.lang.String.format;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@AppCompatActivityScoped public class AppCompatActivityNavigation {

  private final ApplicationNavigation applicationNavigation;
  private final AppCompatActivityTag appCompatActivityTag;
  private final FragmentManager fragmentManager;

  @Inject AppCompatActivityNavigation(ApplicationNavigation applicationNavigation,
      AppCompatActivityTag appCompatActivityTag, @AppCompatActivityQualified FragmentManager fragmentManager) {
    this.applicationNavigation = applicationNavigation;
    this.appCompatActivityTag = appCompatActivityTag;
    this.fragmentManager = fragmentManager;
  }

  public void start(Class<? extends BaseAppCompatActivity> baseActivityClass) {
    applicationNavigation.start(baseActivityClass);
  }

  public void start(BaseFragment baseFragment, int id) {
    Log.i(appCompatActivityTag.simple(), format("start(baseFragment = %s, int = %s)", baseFragment, id));
    replace(fragmentManager, baseFragment, id);
  }
}