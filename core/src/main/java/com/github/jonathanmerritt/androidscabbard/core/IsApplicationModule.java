package com.github.jonathanmerritt.androidscabbard.core;

import android.app.Application;
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public interface IsApplicationModule<A extends Application> {

  @Singleton @Binds Application bindApplication(A application);
}