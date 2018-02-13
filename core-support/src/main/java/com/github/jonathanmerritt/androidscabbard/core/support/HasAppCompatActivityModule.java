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

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.AppCompatActivityQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.AppCompatActivityScoped;
import dagger.Module;
import dagger.Provides;

/**
 * Base dagger module to include in android support appcompat activity modules that implement IsAppCompatActivityModule.
 *
 * <p>A {@code Module} that should be included by an {@link IsAppCompatActivityModule}.</p>
 *
 * Example:
 * <code> @Module(includes = HasAppCompatActivityModule.class) interface SomeAppCompatActivityModule extends IsAppCompatActivityModule{@literal <SomeAppCompatActivity>} {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">dagger.Module</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/support/+/master/v7/appcompat/src/main/java/android/support/v7/app/AppCompatActivity.java">android.support.v7.app.AppCompatActivity</a>
 */
@Module public final class HasAppCompatActivityModule {

  /**
   * This will {@code Provides} an {@code AppCompatActivityScoped} and {@code AppCompatActivityQualified} {@code Class} for the given appcompat activity.
   *
   * @param appCompatActivity that extends AppCompatActivity
   * @return a class
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/scope/AppCompatActivityScoped.java">com.github.jonathanmerritt.androidscabbard.annotations.support.scope.AppCompatActivityScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/qualifier/AppCompatActivityQualified.java">com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.AppCompatActivityQualified</a>
   */
  @AppCompatActivityScoped @AppCompatActivityQualified @Provides static Class<?> provideAppCompatActivityClass(
      AppCompatActivity appCompatActivity) {
    return appCompatActivity.getClass();
  }

  /**
   * This will {@code Provides} an {@code AppCompatActivityScoped} and {@code AppCompatActivityQualified} {@code FragmentManager} for the given appcompat activity.
   *
   * @param appCompatActivity that extends AppCompatActivity
   * @return a FragmentManager
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/scope/AppCompatActivityScoped.java">com.github.jonathanmerritt.androidscabbard.annotations.support.scope.AppCompatActivityScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/qualifier/AppCompatActivityQualified.java">com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.AppCompatActivityQualified</a>
   * @see <a href="https://android.googlesource.com/platform/frameworks/support/+/cef09fe/v4/java/android/support/v4/app/FragmentManager.java">android.support.v4.app.FragmentManager</a>
   */
  @AppCompatActivityScoped @AppCompatActivityQualified @Provides
  static FragmentManager provideSupportFragmentManager(AppCompatActivity appCompatActivity) {
    return appCompatActivity.getSupportFragmentManager();
  }
}