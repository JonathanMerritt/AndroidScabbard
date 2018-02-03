package com.github.jonathanmerritt.androidscabbard.support.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import com.github.jonathanmerritt.androidscabbard.support.common.navigation.AppCompatActivityNavigation;
import com.github.jonathanmerritt.androidscabbard.support.common.tag.AppCompatActivityTag;
import dagger.android.support.DaggerAppCompatActivity;
import javax.inject.Inject;

import static java.lang.String.format;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 */

public abstract class BaseAppCompatActivity extends DaggerAppCompatActivity implements HasLayout {

  @Inject protected AppCompatActivityNavigation appCompatActivityNavigation;
  @Inject protected AppCompatActivityTag appCompatActivityTag;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutId());
  }

  @Override protected void onPostCreate(@Nullable Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    Log.i(appCompatActivityTag.full(), format("onPostCreate(bundle = %s)", savedInstanceState));
  }
}