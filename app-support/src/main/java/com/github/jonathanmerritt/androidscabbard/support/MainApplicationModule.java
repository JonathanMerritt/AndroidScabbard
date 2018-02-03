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

package com.github.jonathanmerritt.androidscabbard.support;

import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.AppCompatActivityScoped;
import com.github.jonathanmerritt.androidscabbard.core.support.HasApplicationModule;
import com.github.jonathanmerritt.androidscabbard.core.support.IsApplicationModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = HasApplicationModule.class) public interface MainApplicationModule
    extends IsApplicationModule<MainApplication> {

  @AppCompatActivityScoped @ContributesAndroidInjector(modules = { MainActivityModule.class })
  MainActivity contributeMainActivity();
}