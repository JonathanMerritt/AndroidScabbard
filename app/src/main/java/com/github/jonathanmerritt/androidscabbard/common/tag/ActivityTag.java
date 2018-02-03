package com.github.jonathanmerritt.androidscabbard.common.tag;

import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.ActivityQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.ActivityScoped;
import javax.inject.Inject;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@ActivityScoped public class ActivityTag extends Tag {

  @Inject ActivityTag(ApplicationTag applicationTag, @ActivityQualified Class<?> activityClass) {
    super(activityClass, applicationTag);
  }
}