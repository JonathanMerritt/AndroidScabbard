package com.github.jonathanmerritt.androidscabbard.support.common.tag;

import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.AppCompatActivityQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.AppCompatActivityScoped;
import javax.inject.Inject;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@AppCompatActivityScoped public class AppCompatActivityTag extends Tag {

  @Inject AppCompatActivityTag(@AppCompatActivityQualified Class<?> activityClass, ApplicationTag applicationTag) {
    super(activityClass, applicationTag);
  }
}