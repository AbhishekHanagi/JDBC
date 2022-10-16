package com.xworkz.garage.repository;

import com.xworkz.garage.dto.GarageDTO;

public class GarageRepositoryImpl implements GarageRepository {
	public GarageRepositoryImpl() {
		System.out.println(" Constructor  created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(GarageDTO garageDTO) {
		System.out.println("save the method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("loded the driver files");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return false;
	}

}
