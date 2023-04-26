package com.xworkz.maven.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.maven.dto.ShowroomDTO;

public class ShowroomRepositoryImpl implements ShowroomRepository{

	
	Collection<ShowroomDTO> dtos=new ArrayList<ShowroomDTO>();
	
	@Override
	public boolean save(ShowroomDTO dto) {
	
		return this.dtos.add(dto);
	}

}
