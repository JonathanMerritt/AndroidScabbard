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