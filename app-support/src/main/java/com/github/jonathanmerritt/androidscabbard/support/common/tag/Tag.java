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

package com.github.jonathanmerritt.androidscabbard.support.common.tag;

import static java.lang.String.format;

class Tag {

  private final String value;

  Tag(Class<?> qlass) {
    value = qlass.getSimpleName();
  }

  Tag(Class<?> qlass, Tag tag) {
    value = format("%s::%s", tag.full(), qlass.getSimpleName());
  }

  public String full() {
    return value;
  }

  public String simple() {
    final int lastIndexOf = value.lastIndexOf(":");
    return lastIndexOf != -1 ? value.substring(lastIndexOf + 1) : value;
  }
}