package com.github.jonathanmerritt.androidscabbard.support.common.navigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

final class Utilities {

  static void replace(FragmentManager fragmentManager, Fragment fragment, int id) {
    final Fragment current = fragmentManager.findFragmentById(id);
    fragmentManager.beginTransaction().replace(id, current == null ? fragment : current).commit();
  }
}