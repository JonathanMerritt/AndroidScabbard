package com.github.jonathanmerritt.androidscabbard.support.common.tag;

import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.ChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.ChildFragmentScoped;
import javax.inject.Inject;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@ChildFragmentScoped public class ChildFragmentTag extends Tag {

  @Inject ChildFragmentTag(FragmentTag fragmentTag, @ChildFragmentQualified Class<?> childFragmentClass) {
    super(childFragmentClass, fragmentTag);
  }
}