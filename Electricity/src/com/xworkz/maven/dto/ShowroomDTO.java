package com.xworkz.maven.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import com.xworkz.maven.constant.ShowroomLocation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class ShowroomDTO implements Serializable, Comparable<ShowroomDTO> {

	@Max(value = 99, message = "id must be lessthan 99")
	@Min(value = 1, message = "id should be greaterthan 1")
	private int id;

	@NotNull
	@NotEmpty
	private String name;

	@Past
	private LocalDate openDate;

	private ShowroomLocation location;
	@Max(value = 999991111)
	@Min(value = 12)
	private long number;

	@Override
	public int compareTo(ShowroomDTO o) {

		return this.name.compareTo(o.getName());
	}
}
