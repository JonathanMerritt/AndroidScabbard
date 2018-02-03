package com.github.jonathanmerritt.androidscabbard.support.common.navigation;

import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.ChildFragmentScoped;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseAppCompatActivity;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseChildFragment;
import com.github.jonathanmerritt.androidscabbard.support.common.BaseFragment;
import javax.inject.Inject;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

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