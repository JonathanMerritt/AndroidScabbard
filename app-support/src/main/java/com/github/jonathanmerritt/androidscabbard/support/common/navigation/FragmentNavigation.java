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
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.FragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.FragmentScoped;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseAppCompatActivity;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseChildFragment;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseFragment;
import com.github.jonathanmerritt.androidscabbard.support.common.tag.FragmentTag;
import javax.inject.Inject;

import static com.github.jonathanmerritt.androidscabbard.support.common.navigation.Utilities.replace;
import static java.lang.String.format;

@FragmentScoped public class FragmentNavigation {

  private final AppCompatActivityNavigation appCompatActivityNavigation;
  private final FragmentTag fragmentTag;
  private final FragmentManager fragmentManager;

  @Inject FragmentNavigation(AppCompatActivityNavigation appCompatActivityNavigation, FragmentTag fragmentTag,
      @FragmentQualified FragmentManager fragmentManager) {
    this.appCompatActivityNavigation = appCompatActivityNavigation;
    this.fragmentTag = fragmentTag;
    this.fragmentManager = fragmentManager;
  }

  public void start(Class<? extends BaseAppCompatActivity> baseAppCompatActivityClass) {
    appCompatActivityNavigation.start(baseAppCompatActivityClass);
  }

  public void start(BaseFragment baseFragment, int id) {
    appCompatActivityNavigation.start(baseFragment, id);
  }

  public void start(BaseChildFragment baseChildFragment, int id) {
    Log.i(fragmentTag.simple(), format("start(baseChildFragment = %s, int = %s)", baseChildFragment, id));
    replace(fragmentManager, baseChildFragment, id);
  }
}