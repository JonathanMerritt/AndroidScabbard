package com.github.jonathanmerritt.androidscabbard.support.common.tag;

import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.FragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.FragmentScoped;
import javax.inject.Inject;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@FragmentScoped public class FragmentTag extends Tag {

  @Inject FragmentTag(AppCompatActivityTag appCompatActivityTag, @FragmentQualified Class<?> fragmentClass) {
    super(fragmentClass, appCompatActivityTag);
  }
}