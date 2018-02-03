package com.github.jonathanmerritt.androidscabbard.support.common.navigation;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseAppCompatActivity;
import com.github.jonathanmerritt.androidscabbard.support.common.tag.ApplicationTag;
import javax.inject.Inject;
import javax.inject.Singleton;

import static java.lang.String.format;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Singleton public class ApplicationNavigation {

  private final ApplicationTag applicationTag;
  private final Context context;

  @Inject ApplicationNavigation(ApplicationTag applicationTag, Context context) {
    this.applicationTag = applicationTag;
    this.context = context;
  }

  public void start(Class<? extends BaseAppCompatActivity> baseAppCompatActivityClass) {
    Log.i(applicationTag.simple(), format("start(class = %s)", baseAppCompatActivityClass));
    context.startActivity(new Intent(context, baseAppCompatActivityClass));
  }
}