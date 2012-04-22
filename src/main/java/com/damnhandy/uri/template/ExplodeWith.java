/*
 * 
 */
package com.damnhandy.uri.template;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Types 
 * 
 * @author <a href="ryan@damnhandy.com">Ryan J. McDonough</a>
 * @version $Revision: 1.1 $
 */
@Documented
@Retention(RUNTIME)
@Target({TYPE, METHOD, FIELD})
public @interface ExplodeWith {

   /**
    * FIXME Comment this
    * 
    * @return
    */
   Class<?> value();
}