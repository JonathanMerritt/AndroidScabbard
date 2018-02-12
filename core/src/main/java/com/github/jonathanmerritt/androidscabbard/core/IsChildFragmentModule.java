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
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.ChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.ChildFragmentScoped;
import dagger.Binds;
import dagger.Module;

/**
 * Base dagger module interface for android fragments that are the child of an android fragment.
 *
 * <p>A {@code dagger.Module} that should be extended or implemented by a child {@code android.app.Fragment} {@code dagger.Module}.</p>
 *
 * Example:
 * <code> @Module interface SomeChildFragmentModule extends IsChildFragmentModule{@literal <SomeChildFragment>} {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">Module</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/app/Fragment.java">Fragment</a>
 */
@Module public interface IsChildFragmentModule<F extends Fragment> {

  /**
   * This will {@code dagger.Binds} an
   * {@code com.github.jonathanmerritt.androidscabbard.annotations.scope.ChildFragmentScoped} and
   * {@code com.github.jonathanmerritt.androidscabbard.annotations.qualifier.ChildFragmentQualified}
   * {@code android.app.Fragment} for the given fragment.
   *
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Binds.java">Binds</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/scope/ChildFragmentScoped.java">ChildFragmentScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/qualifier/ChildFragmentQualified.java">ChildFragmentQualified</a>
   *
   * @param fragment that extends android.app.Fragment
   * @return a base android.app.Fragment instance
   */
  @ChildFragmentScoped @ChildFragmentQualified @Binds Fragment bindChildFragment(F fragment);
}