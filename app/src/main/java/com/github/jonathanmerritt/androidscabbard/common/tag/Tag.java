package com.github.jonathanmerritt.androidscabbard.common.tag;

import static java.lang.String.format;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

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