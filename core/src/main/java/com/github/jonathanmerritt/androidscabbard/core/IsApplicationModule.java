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

import android.app.Application;
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;

/**
 * Base dagger module interface for android applications.
 *
 * <p>A {@code dagger.Module} that should be extended or implemented by an {@code android.app.Application} {@code dagger.Module}.</p>
 *
 * Example:
 * <code> @Module interface SomeApplicationModule extends IsApplicationModule{@literal <SomeApplication>} {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">Module</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/app/Application.java">Application</a>
 */
@Module public interface IsApplicationModule<A extends Application> {

  /**
   * This will {@code dagger.Binds} an {@code javax.inject.Singleton} {@code android.app.Application} for the given application.
   *
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Binds.java">Binds</a>
   * @see <a href="https://github.com/javax-inject/javax-inject/blob/master/src/javax/inject/Singleton.java">Singleton</a>
   *
   * @param application that extends android.app.Application
   * @return a base android.app.Application instance
   */
  @Singleton @Binds Application bindApplication(A application);
}