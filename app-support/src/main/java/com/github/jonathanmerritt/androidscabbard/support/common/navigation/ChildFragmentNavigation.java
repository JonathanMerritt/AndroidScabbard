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

import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.ChildFragmentScoped;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseAppCompatActivity;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseChildFragment;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseFragment;
import javax.inject.Inject;

@ChildFragmentScoped public class ChildFragmentNavigation {

  private final FragmentNavigation fragmentNavigation;
  // private final ChildFragmentTag childFragmentTag;
  // private final FragmentManager fragmentManager;

  @Inject ChildFragmentNavigation(FragmentNavigation fragmentNavigation
      // , ChildFragmentTag childFragmentTag
      // , @ChildFragmentQualified FragmentManager fragmentManager
  ) {
    this.fragmentNavigation = fragmentNavigation;
    // this.childFragmentTag = childFragmentTag;
    // this.fragmentManager = fragmentManager;
  }

  public void start(Class<? extends BaseAppCompatActivity> baseAppCompatActivityClass) {
    fragmentNavigation.start(baseAppCompatActivityClass);
  }

  public void start(BaseFragment baseFragment, int id) {
    fragmentNavigation.start(baseFragment, id);
  }

  public void start(BaseChildFragment baseChildFragment, int id) {
    fragmentNavigation.start(baseChildFragment, id);
  }

  /*
  public void start(BaseGrandChildFragment baseGrandChildFragment, int id) {
    Log.i(childFragmentTag.simple(), String.format("start(baseGrandChildFragment = %s, int = %s)", baseGrandChildFragment, id));
    Utilities.replace(fragmentManager, baseGrandChildFragment, id);
  }
  */
}