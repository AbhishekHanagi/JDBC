package com.xworkz.garage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class GarageDTO {
	
	
	private String name;
	private String ownerName;
	private boolean service;
	private String location;
	private String type;
	

}
