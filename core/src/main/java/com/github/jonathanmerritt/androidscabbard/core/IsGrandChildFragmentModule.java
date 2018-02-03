package com.github.jonathanmerritt.androidscabbard.core;

import android.app.Fragment;
import com.github.jonathanmerritt.androidscabbard.annotations.qualifier.GrandChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.GrandChildFragmentScoped;
import dagger.Binds;
import dagger.Module;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public interface IsGrandChildFragmentModule<F extends Fragment> {

  @GrandChildFragmentScoped @GrandChildFragmentQualified @Binds Fragment bindGrandChildFragment(F fragment);
}