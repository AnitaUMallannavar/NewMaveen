package com.xworkz.maven.service;

import com.xworkz.maven.dto.ShowroomDTO;

public interface ShowroomService {
    boolean validateAndThenSave(ShowroomDTO dto);
}
