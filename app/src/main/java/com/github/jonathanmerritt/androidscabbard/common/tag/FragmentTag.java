package com.github.jonathanmerritt.androidscabbard.common.tag;

import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.FragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.FragmentScoped;
import javax.inject.Inject;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@FragmentScoped public class FragmentTag extends Tag {

  @Inject FragmentTag(ActivityTag activityTag, @FragmentQualified Class<?> fragmentClass) {
    super(fragmentClass, activityTag);
  }
}