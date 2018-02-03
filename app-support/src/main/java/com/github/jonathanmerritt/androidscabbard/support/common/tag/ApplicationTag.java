package com.github.jonathanmerritt.androidscabbard.support.common.tag;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Singleton public class ApplicationTag extends Tag {

  @Inject ApplicationTag(Class<?> applicationClass) {
    super(applicationClass);
  }
}