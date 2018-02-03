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

package com.github.jonathanmerritt.androidscabbard.core;

import android.app.Fragment;
import android.app.FragmentManager;
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.ChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.ChildFragmentScoped;
import dagger.Module;
import dagger.Provides;

@Module public abstract class HasChildFragmentModule {

  @ChildFragmentScoped @ChildFragmentQualified @Provides
  static Class<?> provideChildFragmentClass(@ChildFragmentQualified Fragment fragment) {
    return fragment.getClass();
  }

  @ChildFragmentScoped @ChildFragmentQualified @Provides
  static FragmentManager provideGrandChildFragmentManager(@ChildFragmentQualified Fragment fragment) {
    return fragment.getChildFragmentManager();
  }
}