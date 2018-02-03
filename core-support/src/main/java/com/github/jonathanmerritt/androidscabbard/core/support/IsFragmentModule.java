package com.github.jonathanmerritt.androidscabbard.core.support;

import android.support.v4.app.Fragment;
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.FragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.FragmentScoped;
import dagger.Binds;
import dagger.Module;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public interface IsFragmentModule<F extends Fragment> {

  @FragmentScoped @FragmentQualified @Binds Fragment bindFragment(F fragment);
}