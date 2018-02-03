package com.github.jonathanmerritt.androidscabbard.common;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.jonathanmerritt.androidscabbard.common.navigation.ChildFragmentNavigation;
import com.github.jonathanmerritt.androidscabbard.common.tag.ChildFragmentTag;
import dagger.android.DaggerFragment;
import javax.inject.Inject;

import static java.lang.String.format;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 */

public abstract class BaseChildFragment extends DaggerFragment implements HasLayout {

  @Inject protected ChildFragmentNavigation childFragmentNavigation;
  @Inject protected ChildFragmentTag childFragmentTag;

  @Nullable @Override public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup group,
      @Nullable Bundle savedInstanceState) {
    super.onCreateView(inflater, group, savedInstanceState);
    return inflater.inflate(getLayoutId(), group, false);
  }

  @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    Log.i(childFragmentTag.full(), format("onViewCreated(view = %s, bundle = %s)", view, savedInstanceState));
  }
}