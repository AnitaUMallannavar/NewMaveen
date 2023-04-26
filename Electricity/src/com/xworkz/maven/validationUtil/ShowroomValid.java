package com.xworkz.maven.validationUtil;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.maven.dto.ShowroomDTO;

public class ShowroomValid<T> {
         public boolean validte(T t) {
 			ValidatorFactory validate = Validation.buildDefaultValidatorFactory();
 			Validator valid = validate.getValidator();
 			Set<ConstraintViolation<T>> constrints = valid.validate(t);
 			
 			System.out.println("total violation :" + constrints.size());
 			constrints.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
			return constrints.isEmpty();
			
         }
}
