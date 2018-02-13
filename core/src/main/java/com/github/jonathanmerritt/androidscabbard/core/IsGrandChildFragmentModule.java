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
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.GrandChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.GrandChildFragmentScoped;
import dagger.Binds;
import dagger.Module;

/**
 * Base dagger module interface for android grand child fragments.
 *
 * <p>A {@code Module} that should be extended or implemented by a grand child {@code Fragment} {@code Module}.</p>
 *
 * Example:
 * <code> @Module interface SomeGrandChildFragmentModule extends IsGrandChildFragmentModule{@literal <SomeGrandChildFragment>} {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">dagger.Module</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/app/Fragment.java">android.app.Fragment</a>
 */
@Module public interface IsGrandChildFragmentModule<F extends Fragment> {

  /**
   * This will {@code Binds} an {@code GrandChildFragmentScoped} and {@code GrandChildFragmentQualified}
   * {@code Fragment} for the given fragment.
   *
   * @param fragment that extends Fragment
   * @return a base Fragment instance
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Binds.java">dagger.Binds</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/scope/GrandChildFragmentScoped.java">com.github.jonathanmerritt.androidscabbard.annotations.scope.GrandChildFragmentScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/qualifier/GrandChildFragmentQualified.java">com.github.jonathanmerritt.androidscabbard.annotations.qualifier.GrandChildFragmentQualified</a>
   */
  @GrandChildFragmentScoped @GrandChildFragmentQualified @Binds Fragment bindGrandChildFragment(F fragment);
}