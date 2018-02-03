package com.github.jonathanmerritt.androidscabbard.support.common;

import com.github.jonathanmerritt.androidscabbard.support.R;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

public interface HasLayout {

  default int getLayoutId() {
    return R.layout.empty;
  }
}