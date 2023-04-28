package com.xworkz.maven.service;

import com.xworkz.maven.dto.AmbulanceDTO;
import com.xworkz.maven.repository.AmbulanceRepository;
import com.xworkz.maven.validationUtil.AmbulanceValid;

public class AmbulanceServiceImpl implements AmbulanceService {
	private AmbulanceRepository ambulanceRepository;
	private AmbulanceValid<AmbulanceDTO> ambulanceDTO = new AmbulanceValid<AmbulanceDTO>();

	public AmbulanceServiceImpl(AmbulanceRepository ambulanceRepository) {
		this.ambulanceRepository = ambulanceRepository;
	}

	@Override
	public boolean validateAndThenSave(AmbulanceDTO dto) {
		System.out.println("Running validateAndThenSave in AmbulanceServiceImpl:" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			if (ambulanceDTO.valid(dto)) {
				System.out.println("no violation in dto");
				return this.ambulanceRepository.save(dto);
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
