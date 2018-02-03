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

package com.github.jonathanmerritt.androidscabbard.common;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.jonathanmerritt.androidscabbard.common.navigation.FragmentNavigation;
import com.github.jonathanmerritt.androidscabbard.common.tag.FragmentTag;
import dagger.android.DaggerFragment;
import javax.inject.Inject;

import static java.lang.String.format;

public abstract class BaseFragment extends DaggerFragment implements HasLayout {

  @Inject protected FragmentNavigation fragmentNavigation;
  @Inject protected FragmentTag fragmentTag;

  @Nullable @Override public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup group,
      @Nullable Bundle savedInstanceState) {
    super.onCreateView(inflater, group, savedInstanceState);
    return inflater.inflate(getLayoutId(), group, false);
  }

  @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    Log.i(fragmentTag.full(), format("onViewCreated(view = %s, bundle = %s)", view, savedInstanceState));
  }
}