package com.xworkz.maven.service;

import com.xworkz.maven.dto.AmbulanceDTO;

public interface AmbulanceService {
    boolean validateAndThenSave(AmbulanceDTO dto);
}
