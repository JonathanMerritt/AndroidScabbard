package com.github.jonathanmerritt.androidscabbard.core;

import android.app.Activity;
import com.github.jonathanmerritt.androidscabbard.annotations.scope.ActivityScoped;
import dagger.Binds;
import dagger.Module;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public interface IsActivityModule<A extends Activity> {

  @ActivityScoped @Binds Activity bindActivity(A activity);
}