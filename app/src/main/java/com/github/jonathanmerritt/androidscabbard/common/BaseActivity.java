package com.github.jonathanmerritt.androidscabbard.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import com.github.jonathanmerritt.androidscabbard.common.navigation.ActivityNavigation;
import com.github.jonathanmerritt.androidscabbard.common.tag.ActivityTag;
import dagger.android.DaggerActivity;
import javax.inject.Inject;

import static java.lang.String.format;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 */

public abstract class BaseActivity extends DaggerActivity implements HasLayout {

  @Inject protected ActivityNavigation activityNavigation;
  @Inject protected ActivityTag activityTag;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutId());
  }

  @Override protected void onPostCreate(@Nullable Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    Log.i(activityTag.full(), format("onPostCreate(bundle = %s)", savedInstanceState));
  }
}