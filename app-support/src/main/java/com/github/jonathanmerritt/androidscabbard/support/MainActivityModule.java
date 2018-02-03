package com.github.jonathanmerritt.androidscabbard.support;

import com.github.jonathanmerritt.androidscabbard.core.support.HasAppCompatActivityModule;
import com.github.jonathanmerritt.androidscabbard.core.support.IsAppCompatActivityModule;
import dagger.Module;

/** :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018 **/

@Module(includes = HasAppCompatActivityModule.class) public interface MainActivityModule
    extends IsAppCompatActivityModule<MainActivity> {

}