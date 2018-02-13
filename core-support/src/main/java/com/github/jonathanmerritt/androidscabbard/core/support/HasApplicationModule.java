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

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.android.support.AndroidSupportInjectionModule;
import javax.inject.Singleton;

/**
 * @see <a href="https://github.com/JonathanMerritt/AndroidScabbard/blob/master/core/src/main/java/com/github/jonathanmerritt/androidscabbard/core/HasApplicationModule.java">com.github.jonathanmerritt.androidscabbard.core.HasApplicationModule</a>
 * @see <a href="https://github.com/google/dagger/blob/master/java/dagger/android/support/AndroidSupportInjectionModule.java">dagger.android.support.AndroidSupportInjectionModule</a>
 */
@Module(includes = AndroidSupportInjectionModule.class) public final class HasApplicationModule {

  /**
   * @param application that extends Application
   * @return a class
   * @see <a href="hhttps://github.com/JonathanMerritt/AndroidScabbard/blob/master/core/src/main/java/com/github/jonathanmerritt/androidscabbard/core/HasApplicationModule.java">com.github.jonathanmerritt.androidscabbard.core.HasApplicationModule#provideApplicationClass</a>
   */
  @Singleton @Provides static Class<?> provideApplicationClass(Application application) {
    return application.getClass();
  }

  /**
   * @param application that extends Application
   * @return the context
   * @see <a href="hhttps://github.com/JonathanMerritt/AndroidScabbard/blob/master/core/src/main/java/com/github/jonathanmerritt/androidscabbard/core/HasApplicationModule.java">com.github.jonathanmerritt.androidscabbard.core.HasApplicationModule#provideContext</a>
   */
  @Singleton @Provides static Context provideContext(Application application) {
    return application.getBaseContext().getApplicationContext();
  }
}