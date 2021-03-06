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

package com.github.jonathanmerritt.androidscabbard.support.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import com.github.jonathanmerritt.androidscabbard.support.common.navigation.AppCompatActivityNavigation;
import com.github.jonathanmerritt.androidscabbard.support.common.tag.AppCompatActivityTag;
import dagger.android.support.DaggerAppCompatActivity;
import javax.inject.Inject;

import static java.lang.String.format;

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