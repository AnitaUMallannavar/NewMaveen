package com.xworkz.maven.service;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.maven.dto.ShowroomDTO;
import com.xworkz.maven.repository.ShowroomRepository;
import com.xworkz.maven.validationUtil.ShowroomValid;

public class ShowroomServiceImpl implements ShowroomService {
	private ShowroomRepository showroomRepository;
	private ShowroomValid<ShowroomDTO> valid=new ShowroomValid<ShowroomDTO>();

	public ShowroomServiceImpl(ShowroomRepository showroomRepository) {
		this.showroomRepository = showroomRepository;
	}

	@Override
	public boolean validateAndThenSave(ShowroomDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			//ValidatorFactory validate = Validation.buildDefaultValidatorFactory();
			//Validator valid = validate.getValidator();
			//Set<ConstraintViolation<ShowroomDTO>> constrints = valid.validate(dto);
		//	System.out.println("total violation :" + constrints.size());
		//	constrints.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));

			if (valid.validte(dto)) {
				System.out.println("no violation in dto");
                
				return this.showroomRepository.save(dto);

			}


		} else {
			System.err.println("Dto is null");
		}
		return false;
	}

}
