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

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.ChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.ChildFragmentScoped;
import dagger.Module;
import dagger.Provides;

/**
 * Base dagger module to include in android support child fragment modules that implement IsChildFragmentModule.
 *
 * <p>A {@code Module} that should be included by an {@link IsChildFragmentModule}.</p>
 *
 * Example:
 * <code> @Module(includes = HasChildFragmentModule.class) interface SomeChildFragmentModule extends IsChildFragmentModule{@literal <SomeChildFragment>} {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">dagger.Module</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/support/+/cef09fe/v4/java/android/support/v4/app/Fragment.java">android.support.v4.app.Fragment</a>
 */
@Module public abstract class HasChildFragmentModule {

  /**
   * This will {@code Provides} an {@code ChildFragmentScoped} and {@code ChildFragmentQualified} {@code Class} for the given fragment.
   *
   * @param fragment that extends support Fragment and is ChildFragmentQualified
   * @return a class
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/scope/ChildFragmentScoped.java">com.github.jonathanmerritt.androidscabbard.annotations.support.scope.ChildFragmentScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/qualifier/ChildFragmentQualified.java">com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.ChildFragmentQualified</a>
   */
  @ChildFragmentScoped @ChildFragmentQualified @Provides static Class<?> provideChildFragmentClass(
      @ChildFragmentQualified Fragment fragment) {
    return fragment.getClass();
  }

  /**
   * This will {@code Provides} an {@code ChildFragmentScoped} and {@code ChildFragmentQualified} {@code FragmentManager} for the given fragment.
   *
   * @param fragment that extends support Fragment and is ChildFragmentQualified
   * @return a FragmentManager
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/scope/ChildFragmentScoped.java">com.github.jonathanmerritt.androidscabbard.annotations.support.scope.ChildFragmentScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/qualifier/ChildFragmentQualified.java">com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.ChildFragmentQualified</a>
   * @see <a href="https://android.googlesource.com/platform/frameworks/support/+/cef09fe/v4/java/android/support/v4/app/FragmentManager.java">android.support.v4.app.FragmentManager</a>
   */
  @ChildFragmentScoped @ChildFragmentQualified @Provides static FragmentManager provideGrandChildFragmentManager(
      @ChildFragmentQualified Fragment fragment) {
    return fragment.getChildFragmentManager();
  }
}