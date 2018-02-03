package com.github.jonathanmerritt.androidscabbard.core.support;

import android.support.v7.app.AppCompatActivity;
import com.github.jonathanmerritt.androidscabbard.annotations.support.scope.AppCompatActivityScoped;
import dagger.Binds;
import dagger.Module;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 **/

@Module public interface IsAppCompatActivityModule<A extends AppCompatActivity> {

  @AppCompatActivityScoped @Binds AppCompatActivity bindAppCompatActivity(A appCompatActivity);
}