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

package com.github.jonathanmerritt.androidscabbard.annotations.support.scope;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Scope;

/**
 * Base dagger scope for android child support fragment children.
 *
 * <p>A simple {@code javax.inject.Scope}, 'intended' to scope an {@code android.support.v4.app.Fragment},
 * that is the child of a {@link ChildFragmentScoped} {@code android.support.v4.app.Fragment}.</p>
 *
 * @see <a href="https://github.com/javax-inject/javax-inject/blob/master/src/javax/inject/Scope.java">Scope</a>
 * @see <a href="https://android.googlesource.com/platform/frameworks/support/+/cef09fe/v4/java/android/support/v4/app/Fragment.java">Fragment</a>
 */
@Scope @Retention(RetentionPolicy.RUNTIME) @Target({ ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER })
public @interface GrandChildFragmentScoped {

}