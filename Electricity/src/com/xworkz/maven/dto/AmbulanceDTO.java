package com.xworkz.maven.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class AmbulanceDTO implements Serializable, Comparable<AmbulanceDTO> {

	@Max(value = 20)
	@Min(value = 1)
	private int id;

	@Max(value = 200)
	@Min(value = 1)
	private int regNo;

	@NotEmpty
	@NotNull
	@Size(max = 200, min = 4)
	private String ownerName;
	private boolean insuranceExpired;

	@NotEmpty
	@NotNull
	@Size(max = 200, min = 2)
	private String driverName;
	@Past
	private LocalDate taxStartDate;

	@Override
	public int compareTo(AmbulanceDTO o) {

		return this.ownerName.compareTo(o.getOwnerName());
	}
}
