package com.github.jonathanmerritt.androidscabbard.core.support;

import android.app.Application;
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 *
 * Identical to {androidscabbard.core.IsApplicationModule} Adds nothing.
 **/

@Module public interface IsApplicationModule<A extends Application> {

  @Singleton @Binds Application bindApplication(A application);
}