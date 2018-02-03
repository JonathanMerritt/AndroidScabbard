package com.github.jonathanmerritt.androidscabbard.core.support;

import android.support.v4.app.Fragment;
import com.github.jonathanmerritt.androidscabbard.annotations.support.qualifier.ChildFragmentQualified;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.ChildFragmentScoped;
import dagger.Binds;
import dagger.Module;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public interface IsChildFragmentModule<F extends Fragment> {

  @ChildFragmentScoped @ChildFragmentQualified @Binds Fragment bindChildFragment(F fragment);
}