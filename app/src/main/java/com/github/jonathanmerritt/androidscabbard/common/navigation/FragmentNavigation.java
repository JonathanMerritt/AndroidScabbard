package com.github.jonathanmerritt.androidscabbard.common.navigation;

import android.app.FragmentManager;
import android.util.Log;
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.FragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.FragmentScoped;
import com.github.jonathanmerritt.androidscabbard.common.BaseActivity;
import com.github.jonathanmerritt.androidscabbard.common.BaseChildFragment;
import com.github.jonathanmerritt.androidscabbard.common.BaseFragment;
import com.github.jonathanmerritt.androidscabbard.common.tag.FragmentTag;
import javax.inject.Inject;

import static com.github.jonathanmerritt.androidscabbard.common.navigation.Utilities.replace;
import static java.lang.String.format;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@FragmentScoped public class FragmentNavigation {

  private final ActivityNavigation activityNavigation;
  private final FragmentTag fragmentTag;
  private final FragmentManager fragmentManager;

  @Inject FragmentNavigation(ActivityNavigation activityNavigation, FragmentTag fragmentTag,
      @FragmentQualified FragmentManager fragmentManager) {
    this.activityNavigation = activityNavigation;
    this.fragmentTag = fragmentTag;
    this.fragmentManager = fragmentManager;
  }

  public void start(Class<? extends BaseActivity> baseActivityClass) {
    activityNavigation.start(baseActivityClass);
  }

  public void start(BaseFragment baseFragment, int id) {
    activityNavigation.start(baseFragment, id);
  }

  public void start(BaseChildFragment baseChildFragment, int id) {
    Log.i(fragmentTag.simple(), format("start(baseChildFragment = %s, int = %s)", baseChildFragment, id));
    replace(fragmentManager, baseChildFragment, id);
  }
}