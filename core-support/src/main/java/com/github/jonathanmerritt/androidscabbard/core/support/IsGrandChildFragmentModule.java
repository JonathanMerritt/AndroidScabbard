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
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.GrandChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.GrandChildFragmentScoped;
import dagger.Binds;
import dagger.Module;

/**
 * A {@link Module} that should be extended or implemented by an {@link Fragment} {@link Module},
 * that is for the child of a {@link com.github.jonathanmerritt.androidscabbard.annotations.support.scope.ChildFragmentScoped}
 * {@link com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.ChildFragmentQualified}
 * {@link Fragment}.
 *
 * Example:
 * <code> @literal @}Module interface SomeGrandChildFragmentModule extends IsGrandChildFragmentModule<SomeGrandChildFragment> {} </code>
 */
@Module public interface IsGrandChildFragmentModule<F extends Fragment> {

  /**
   * This will bind an {@link GrandChildFragmentScoped} {@link GrandChildFragmentQualified} {@link Fragment} for the given fragment.
   *
   * @param fragment the fragment
   * @return the fragment
   */
  @GrandChildFragmentScoped @GrandChildFragmentQualified @Binds Fragment bindGrandChildFragment(F fragment);
}