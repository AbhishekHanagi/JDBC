package com.xworkz.garage.service;

import com.xworkz.garage.dto.GarageDTO;
import com.xworkz.garage.repository.GarageRepository;
import com.xworkz.garage.repository.GarageRepositoryImpl;

public class GarageServiceImpl implements GarageService {

	public GarageServiceImpl() {
System.out.println("CREATED "+this.getClass().getSimpleName());	
}
	
	
	@Override
	public boolean validAndSave(GarageDTO garageDTO) {

		 String name=garageDTO.getName();
		 String ownerName=garageDTO.getOwnerName();
		 boolean service=garageDTO.isService();
		 String location=garageDTO.getLocation();
		 String type=garageDTO.getType();
		 
		 if(name !=null && name.length()>5 &&name.length()<300) {
			 System.out.println("name is valid");
			 if(ownerName !=null && ownerName.length()>4 && ownerName.length()<300) {
				 System.out.println("ownerName is valid");
				 if(service ==true) {
					 System.out.println("service is valid");
				 if(location !=null&& location.length()>5 && location.length()<300){
					 System.out.println("location is valid");
					 if(type !=null && type.length()>5 && type.length()<100) {
						 System.out.println("type is valid");
						
						 
						 GarageRepository garageRepository=new GarageRepositoryImpl();
						garageRepository.save(garageDTO);
						 
					 }
					 else {
						 System.err.println("type is invalid");
					 }
				 }
				 else {
					 System.err.println("location is not valid ");
				 }
				 }
				 else {
					 System.err.println("service is invalid");
				 }
			 }
			 else {
				 System.err.println("ownerName is invalid");
			 }
		 }
		 else {
			 System.err.println("name is invalid");
		 }
		
		
		return false;
	}

}
