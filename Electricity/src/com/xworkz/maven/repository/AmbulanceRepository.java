package com.xworkz.maven.repository;

import com.xworkz.maven.dto.AmbulanceDTO;

public interface AmbulanceRepository {
	boolean save(AmbulanceDTO dto);
}
