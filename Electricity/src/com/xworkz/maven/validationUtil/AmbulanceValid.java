package com.xworkz.maven.validationUtil;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.validator.internal.util.Contracts;

public class AmbulanceValid<T> {
	public boolean valid(T t) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<T>> constrints = validator.validate(t);

		System.out.println(" total violations :" + constrints.size());
		constrints.forEach(c -> System.err.println(c.getPropertyPath() + " " + c.getMessage()));
		return constrints.isEmpty();
	}

}
