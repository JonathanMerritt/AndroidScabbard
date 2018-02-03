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
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.ActivityQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.ActivityScoped;
import com.github.jonathanmerritt.androidscabbard.common.BaseActivity;
import com.github.jonathanmerritt.androidscabbard.common.BaseFragment;
import com.github.jonathanmerritt.androidscabbard.common.tag.ActivityTag;
import javax.inject.Inject;

import static com.github.jonathanmerritt.androidscabbard.common.navigation.Utilities.replace;
import static java.lang.String.format;

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