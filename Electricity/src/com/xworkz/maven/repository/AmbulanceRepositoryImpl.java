package com.xworkz.maven.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.maven.dto.AmbulanceDTO;

public class AmbulanceRepositoryImpl implements AmbulanceRepository {
	Collection<AmbulanceDTO> collection = new ArrayList<AmbulanceDTO>();

	@Override
	public boolean save(AmbulanceDTO dto) {
		System.out.println("Running save in AmbulanceRepositoryImpl:" + dto);
		return this.collection.add(dto);
	}

}
