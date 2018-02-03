/*
 *     Copyright 2018 Jonathan Merritt 11R00TT00R11@GMAIL.COM
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

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