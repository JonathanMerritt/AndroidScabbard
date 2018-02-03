package com.github.jonathanmerritt.androidscabbard.annotations.support.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.inject.Scope;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * :JONATHAN MERRITT :11R00TT00RR11@GMAIL.COM :2018
 */

@Scope @Retention(RUNTIME) @Target({ METHOD, TYPE, PARAMETER }) public @interface GrandChildFragmentScoped {

}