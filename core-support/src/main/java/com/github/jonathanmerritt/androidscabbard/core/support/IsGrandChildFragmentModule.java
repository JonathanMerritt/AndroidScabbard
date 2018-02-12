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

package com.github.jonathanmerritt.androidscabbard.core.support;

import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.GrandChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.GrandChildFragmentScoped;
import dagger.Binds;
import dagger.Module;

/**
 * Base dagger module interface for android support fragments that are the child of an android support fragment
 * that is a child of an android support fragment.
 *
 * <p>A {@code dagger.Module} that should be extended or implemented by a grand child {@code android.support.v4.app.Fragment} {@code dagger.Module}.</p>
 *
 * Example:
 * <code> @Module interface SomeGrandChildFragmentModule extends IsGrandChildFragmentModule<SomeGrandChildFragment> {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">Module</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/support/+/cef09fe/v4/java/android/support/v4/app/Fragment.java">Fragment</a>
 */
@Module public interface IsGrandChildFragmentModule<F extends android.app.Fragment> {

  /**
   * This will {@code dagger.Binds} an
   * {@code com.github.jonathanmerritt.androidscabbard.annotations.scope.GrandChildFragmentScoped} and
   * {@code com.github.jonathanmerritt.androidscabbard.annotations.qualifier.GrandChildFragmentQualified}
   * {@code android.support.v4.app.Fragment} for the given support fragment.
   *
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Binds.java">Binds</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/scope/GrandChildFragmentScoped.java">GrandChildFragmentScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/qualifier/GrandChildFragmentQualified.java">GrandChildFragmentQualified</a>
   */
  @GrandChildFragmentScoped @GrandChildFragmentQualified @Binds android.app.Fragment bindGrandChildFragment(
      F fragment);
}