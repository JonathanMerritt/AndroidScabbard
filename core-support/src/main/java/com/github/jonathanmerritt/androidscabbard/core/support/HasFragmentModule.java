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
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.FragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.FragmentScoped;
import dagger.Module;
import dagger.Provides;

/**
 * Base dagger module to include in android support fragment modules that implement IsFragmentModule.
 *
 * <p>A {@code Module} that should be included by an {@link IsFragmentModule}.</p>
 *
 * Example:
 * <code> @Module(includes = HasFragmentModule.class) interface SomeFragmentModule extends IsFragmentModule{@literal <SomeFragment>} {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">dagger.Module</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/support/+/cef09fe/v4/java/android/support/v4/app/Fragment.java">android.support.v4.app.Fragment</a>
 */
@Module public abstract class HasFragmentModule {

  /**
   * This will {@code Provides} an {@code FragmentScoped} and {@code FragmentQualified} {@code Class} for the given fragment.
   *
   * @param fragment that extends support Fragment and is FragmentQualified
   * @return a class
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/scope/FragmentScoped.java">com.github.jonathanmerritt.androidscabbard.annotations.support.scope.FragmentScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/qualifier/FragmentQualified.java">com.github.jonathanmerritt.androidscabbard.annotations.qualifier.FragmentQualified</a>
   */
  @FragmentScoped @FragmentQualified @Provides static Class<?> provideFragmentClass(
      @FragmentQualified Fragment fragment) {
    return fragment.getClass();
  }

  /**
   * This will {@code Provides} an {@code FragmentScoped} and {@code FragmentQualified} {@code FragmentManager} for the given fragment.
   *
   * @param fragment that extends support Fragment and is FragmentQualified
   * @return a FragmentManager
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/scope/FragmentScoped.java">com.github.jonathanmerritt.androidscabbard.annotations.support.scope.FragmentScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/qualifier/FragmentQualified.java">com.github.jonathanmerritt.androidscabbard.annotations.qualifier.FragmentQualified</a>
   * @see <a href="https://android.googlesource.com/platform/frameworks/support/+/cef09fe/v4/java/android/support/v4/app/FragmentManager.java">android.support.v4.app.FragmentManager</a>
   */
  @FragmentScoped @FragmentQualified @Provides static FragmentManager provideSupportChildFragmentManager(
      @FragmentQualified Fragment fragment) {
    return fragment.getChildFragmentManager();
  }
}