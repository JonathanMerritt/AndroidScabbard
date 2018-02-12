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
import com.github.jonathanmerritt.androidscabbard.annotations.scope.ActivityScoped;
import dagger.Binds;
import dagger.Module;

/**
 * Base dagger module interface for android activities.
 *
 * <p>A {@code dagger.Module} that should be extended or implemented by an {@code android.app.Activity} {@code dagger.Module}.</p>
 *
 * Example:
 * <code> @Module interface SomeActivityModule extends IsActivityModule{@literal <SomeActivity>} {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">Module</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/app/Activity.java">Activity</a>
 */
@Module public interface IsActivityModule<A extends Activity> {

  /**
   * This will {@code dagger.Binds} an {@code com.github.jonathanmerritt.androidscabbard.annotations.scope.ActivityScoped} {@code android.app.Activity} for the given activity.
   *
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Binds.java">Binds</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/scope/ActivityScoped.java">ActivityScoped</a>
   *
   * @param activity that extends android.app.Activity
   * @return a base android.app.Activity instance
   */
  @ActivityScoped @Binds Activity bindActivity(A activity);
}