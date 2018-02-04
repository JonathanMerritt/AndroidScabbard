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
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;

/**
 * A {@link Module} that should be extended or implemented by an {@link Application} {@link Module}.
 *
 * Example:
 * <code> @literal @}Module interface SomeApplicationModule extends IsApplicationModule<SomeApplication> {} </code>
 */
@Module public interface IsApplicationModule<A extends Application> {

  /**
   * This will bind an {@link Singleton} {@link Application} for the given application.
   *
   * @param application the application
   * @return the application
   */
  @Singleton @Binds Application bindApplication(A application);
}