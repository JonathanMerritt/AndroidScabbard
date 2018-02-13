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
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;
import javax.inject.Singleton;

/**
 * Base dagger module to include in android application modules that implement IsApplicationModule.
 *
 * <p>A {@code Module} that includes {@code AndroidInjectionModule} and should be included by an {@link IsApplicationModule},</p>
 *
 * Example:
 * <code> @Module(includes = HasApplicationModule.class) interface SomeApplicationModule extends IsApplicationModule{@literal <SomeApplication>} {} </code>
 *
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Module.java">dagger.Module</a>
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/android/AndroidInjectionModule.java">dagger.android.AndroidInjectionModule</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/app/Application.java">android.app.Application</a>
 */
@Module(includes = AndroidInjectionModule.class) public final class HasApplicationModule {

  /**
   * This will {@code Provides} an {@code Singleton} {@code Class} for the given application.
   *
   * @param application that extends Application
   * @return a class
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/javax-inject/javax-inject/blob/master/src/javax/inject/Singleton.java">javax.inject.Singleton</a>
   */
  @Singleton @Provides static Class<?> provideApplicationClass(Application application) {
    return application.getClass();
  }

  /**
   * This will {@code Provides} an {@code Singleton} {@code Context} for the given application.
   *
   * @param application that extends Application
   * @return the context
   * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/Provides.java">dagger.Provides</a>
   * @see <a href="https://github.com/javax-inject/javax-inject/blob/master/src/javax/inject/Singleton.java">javax.inject.Singleton</a>
   * @see <a href="https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/content/Context.java">android.content.Context</a>
   */
  @Singleton @Provides static Context provideContext(Application application) {
    return application.getBaseContext().getApplicationContext();
  }
}