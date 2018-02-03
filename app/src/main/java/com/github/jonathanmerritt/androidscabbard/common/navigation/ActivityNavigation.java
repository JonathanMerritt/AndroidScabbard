package com.github.jonathanmerritt.androidscabbard.common.navigation;

import android.app.FragmentManager;
import android.util.Log;
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.ActivityQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.ActivityScoped;
import com.github.jonathanmerritt.androidscabbard.common.BaseActivity;
import com.github.jonathanmerritt.androidscabbard.common.BaseFragment;
import com.github.jonathanmerritt.androidscabbard.common.tag.ActivityTag;
import javax.inject.Inject;

import static com.github.jonathanmerritt.androidscabbard.common.navigation.Utilities.replace;
import static java.lang.String.format;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@ActivityScoped public class ActivityNavigation {

  private final ApplicationNavigation applicationNavigation;
  private final ActivityTag activityTag;
  private final FragmentManager fragmentManager;

  @Inject ActivityNavigation(ApplicationNavigation applicationNavigation, ActivityTag activityTag,
      @ActivityQualified FragmentManager fragmentManager) {
    this.applicationNavigation = applicationNavigation;
    this.activityTag = activityTag;
    this.fragmentManager = fragmentManager;
  }

  public void start(Class<? extends BaseActivity> baseActivityClass) {
    applicationNavigation.start(baseActivityClass);
  }

  public void start(BaseFragment baseFragment, int id) {
    Log.i(activityTag.simple(), format("start(baseFragment = %s, int = %s)", baseFragment, id));
    replace(fragmentManager, baseFragment, id);
  }
}