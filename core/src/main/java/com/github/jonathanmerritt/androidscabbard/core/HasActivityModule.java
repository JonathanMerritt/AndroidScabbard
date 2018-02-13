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

import android.app.Activity;
import android.app.FragmentManager;
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.ActivityQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.ActivityScoped;
import dagger.Module;
import dagger.Provides;

/**
 * Base dagger module to include in android activity modules that implement IsActivityModule.
 *
 * <p>A {@code Module} that should be included by an {@link IsActivityModule}.</p>
 *
 * Example:
 * <code> @Module(includes = HasActivityModule.class) interface SomeActivityModule extends IsActivityModule{@literal <SomeActivity>} {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">dagger.Module</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/app/Activity.java">android.app.Activity</a>
 */
@Module public final class HasActivityModule {

  /**
   * This will {@code Provides} an {@code ActivityScoped} and {@code ActivityQualified} {@code Class} for the given activity.
   *
   * @param activity that extends Activity
   * @return a class
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/scope/ActivityScoped.java">com.github.jonathanmerritt.androidscabbard.annotations.scope.ActivityScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/qualifier/ActivityQualified.java">com.github.jonathanmerritt.androidscabbard.annotations.qualifier.ActivityQualified</a>
   */
  @ActivityScoped @ActivityQualified @Provides static Class<?> provideActivityClass(Activity activity) {
    return activity.getClass();
  }

  /**
   * This will {@code Provides} an {@code ActivityScoped} and {@code ActivityQualified} {@code FragmentManager} for the given activity.
   *
   * @param activity that extends Activity
   * @return a FragmentManager
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/scope/ActivityScoped.java">com.github.jonathanmerritt.androidscabbard.annotations.scope.ActivityScoped</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/qualifier/ActivityQualified.java">com.github.jonathanmerritt.androidscabbard.annotations.qualifier.ActivityQualified</a>
   * @see <a href="https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/app/FragmentManager.java">android.app.FragmentManager</a>
   */
  @ActivityScoped @ActivityQualified @Provides static FragmentManager provideFragmentManager(Activity activity) {
    return activity.getFragmentManager();
  }
}