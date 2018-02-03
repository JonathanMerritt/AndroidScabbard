package com.github.jonathanmerritt.androidscabbard;

import com.github.jonathanmerritt.androidscabbard.core.HasActivityModule;
import com.github.jonathanmerritt.androidscabbard.core.IsActivityModule;
import dagger.Module;

/** :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018 **/

@Module(includes = HasActivityModule.class) public interface MainActivityModule
    extends IsActivityModule<MainActivity> {

}