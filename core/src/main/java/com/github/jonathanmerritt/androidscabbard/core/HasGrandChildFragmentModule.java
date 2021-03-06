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
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.GrandChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.GrandChildFragmentScoped;
import dagger.Module;
import dagger.Provides;

/**
 * Base dagger module to include in android grand child fragment modules that implement IsGrandChildFragmentModule.
 *
 * <p>A {@code Module} that should be included by an {@link IsGrandChildFragmentModule}.</p>
 *
 * Example:
 * <code> @Module(includes = HasGrandChildFragmentModule.class) interface SomeGrandChildFragmentModule extends IsGrandChildFragmentModule{@literal <SomeGrandChildFragment>} {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">dagger.Module</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/app/Fragment.java">android.app.Fragment</a>
 */
@Module public final class HasGrandChildFragmentModule {

  /**
   * This will {@code Provides} an {@code GrandChildFragmentScoped} and {@code GrandChildFragmentQualified} {@code Class} for the given fragment.
   *
   * @param fragment that extends Fragment and is GrandChildFragmentQualified
   * @return a class
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/scope/GrandChildFragmentScoped.java">com.github.jonathanmerritt.androidscabbard.annotations.scope.GrandChildFragmentScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/qualifier/GrandChildFragmentQualified.java">com.github.jonathanmerritt.androidscabbard.annotations.qualifier.GrandChildFragmentQualified</a>
   */
  @GrandChildFragmentScoped @GrandChildFragmentQualified @Provides static Class<?> provideGrandChildFragmentClass(
      @GrandChildFragmentQualified Fragment fragment) {
    return fragment.getClass();
  }

  /**
   * This will {@code Provides} an {@code GrandChildFragmentScoped} and {@code GrandChildFragmentQualified} {@code FragmentManager} for the given fragment.
   *
   * @param fragment that extends Fragment and is GrandChildFragmentQualified
   * @return a FragmentManager
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/scope/GrandChildFragmentScoped.java">com.github.jonathanmerritt.androidscabbard.annotations.scope.GrandChildFragmentScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/qualifier/GrandChildFragmentQualified.java">com.github.jonathanmerritt.androidscabbard.annotations.qualifier.GrandChildFragmentQualified</a>
   * @see <a href="https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/app/FragmentManager.java">android.app.FragmentManager</a>
   */
  @GrandChildFragmentScoped @GrandChildFragmentQualified @Provides
  static FragmentManager provideGreatGrandChildFragmentManager(@GrandChildFragmentQualified Fragment fragment) {
    return fragment.getChildFragmentManager();
  }
}