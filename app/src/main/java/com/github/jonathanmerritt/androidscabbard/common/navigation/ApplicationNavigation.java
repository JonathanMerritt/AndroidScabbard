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

package com.github.jonathanmerritt.androidscabbard.common.navigation;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.github.jonathanmerritt.androidscabbard.common.BaseActivity;
import com.github.jonathanmerritt.androidscabbard.common.tag.ApplicationTag;
import javax.inject.Inject;
import javax.inject.Singleton;

import static java.lang.String.format;

@Singleton public class ApplicationNavigation {

  private final ApplicationTag applicationTag;
  private final Context context;

  @Inject ApplicationNavigation(ApplicationTag applicationTag, Context context) {
    this.applicationTag = applicationTag;
    this.context = context;
  }

  public void start(Class<? extends BaseActivity> baseActivityClass) {
    Log.i(applicationTag.simple(), format("start(class = %s)", baseActivityClass));
    context.startActivity(new Intent(context, baseActivityClass));
  }
}