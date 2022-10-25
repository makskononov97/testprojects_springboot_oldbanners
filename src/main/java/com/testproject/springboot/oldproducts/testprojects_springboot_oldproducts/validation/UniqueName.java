package com.testproject.springboot.oldproducts.testprojects_springboot_oldproducts.validation;


import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = UniqueNameValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface UniqueName {

    public String message() default "There is already banner with this name!";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default{};
}
