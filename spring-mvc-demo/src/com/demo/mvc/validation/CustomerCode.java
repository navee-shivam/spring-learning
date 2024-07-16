package com.demo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//Constraint Which business logic file we need to give
//@Target for which type this annotation will work
//@Retention How long does annotation will be stored


@Constraint(validatedBy = CustomerCodeConstraintValidator.class)
@Target({ ElementType.METHOD , ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerCode {

	//for 2 attribute values
	public String value() default "ED";

	public String message() default "starts with ED";


	//Additional
	public Class<?>[] groups() default {};

	//payload provide more information about the error
	public Class<? extends Payload>[] payload() default {};
}
