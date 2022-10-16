package com.xworkz.garage;

import com.xworkz.garage.dto.GarageDTO;
import com.xworkz.garage.service.GarageService;
import com.xworkz.garage.service.GarageServiceImpl;

public class GarageCreate {
	public static void main(String[] args) {

		GarageDTO dto = new GarageDTO("RaghavendraShop", "Abhishek", true, "Btm Layout ", "4 wheeler ");
		System.out.println(dto);

		GarageService garageService = new GarageServiceImpl();
		garageService.validAndSave(dto);
	}

}
