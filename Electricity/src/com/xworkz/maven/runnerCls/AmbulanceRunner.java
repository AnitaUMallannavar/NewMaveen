package com.xworkz.maven.runnerCls;

import java.time.LocalDate;

import com.xworkz.maven.dto.AmbulanceDTO;
import com.xworkz.maven.repository.AmbulanceRepository;
import com.xworkz.maven.repository.AmbulanceRepositoryImpl;
import com.xworkz.maven.service.AmbulanceService;
import com.xworkz.maven.service.AmbulanceServiceImpl;

public class AmbulanceRunner {

	public static void main(String[] args) {
		AmbulanceDTO ambulanceDTO = new AmbulanceDTO(11, 12, "sai", false, "asual", LocalDate.of(2003, 4, 5));
		AmbulanceRepository ambulanceRepository = new AmbulanceRepositoryImpl();
		AmbulanceService ambulanceService = new AmbulanceServiceImpl(ambulanceRepository);
		boolean saved = ambulanceService.validateAndThenSave(ambulanceDTO);
		System.out.println(saved);
	}

}
