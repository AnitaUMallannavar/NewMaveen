package com.xworkz.maven.runnerCls;

import java.time.LocalDate;

import com.xworkz.maven.constant.ShowroomLocation;
import com.xworkz.maven.dto.ShowroomDTO;
import com.xworkz.maven.repository.ShowroomRepository;
import com.xworkz.maven.repository.ShowroomRepositoryImpl;
import com.xworkz.maven.service.ShowroomService;
import com.xworkz.maven.service.ShowroomServiceImpl;

public class ShowroomRunner {

	public static void main(String[] args) {
		ShowroomDTO showroomDTO = new ShowroomDTO(2, "TATA MOTARS", LocalDate.of(2001,9,27), ShowroomLocation.MK,
				810593212L);
		ShowroomRepository showroomRepository = new ShowroomRepositoryImpl();
		ShowroomService showroomService = new ShowroomServiceImpl(showroomRepository);
		boolean saved = showroomService.validateAndThenSave(showroomDTO);
		System.out.println(saved);
	}

}
