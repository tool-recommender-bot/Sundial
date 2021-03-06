package org.knowm.sundial.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CronTrigger {

  String cron() default "";

  String timeZone() default "";

  boolean isConcurrencyAllowed() default false;

  String[] jobDataMap() default {};
}
