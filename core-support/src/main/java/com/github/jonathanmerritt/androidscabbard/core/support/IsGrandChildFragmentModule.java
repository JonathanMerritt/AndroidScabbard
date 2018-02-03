package com.github.jonathanmerritt.androidscabbard.core.support;

import android.support.v4.app.Fragment;
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.GrandChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.GrandChildFragmentScoped;
import dagger.Binds;
import dagger.Module;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public interface IsGrandChildFragmentModule<F extends Fragment> {

  @GrandChildFragmentScoped @GrandChildFragmentQualified @Binds Fragment bindGrandChildFragment(F fragment);
}