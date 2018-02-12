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

import android.support.v7.app.AppCompatActivity;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.AppCompatActivityScoped;
import dagger.Binds;
import dagger.Module;

/**
 * Base dagger module interface for android support appcompat activities.
 *
 * <p>A {@code dagger.Module} that should be extended or implemented by an {@code android.support.v7.app.AppCompatActivity} {@code dagger.Module}.</p>
 *
 * Example:
 * <code> @Module interface SomeAppCompatActivityModule extends IsAppCompatActivityModule<SomeAppCompatActivity> {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">Module</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/support/+/master/v7/appcompat/src/main/java/android/support/v7/app/AppCompatActivity.java">AppCompatActivity</a>
 */
@Module public interface IsAppCompatActivityModule<A extends AppCompatActivity> {

  /**
   * This will {@code dagger.Binds} an
   * {@code com.github.jonathanmerritt.androidscabbard.annotations.support.scope.AppCompatActivityScoped}
   * {@code android.support.v7.app.AppCompatActivity} for the given appcompat activity.
   *
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Binds.java">Binds</a>
   * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/annotations-support/src/main/java/com/github/jonathanmerritt/androidscabbard/annotations/support/scope/AppCompatActivityScoped.java">AppCompatActivityScoped</a>
   */
  @AppCompatActivityScoped @Binds AppCompatActivity bindAppCompatActivity(A appCompatActivity);
}