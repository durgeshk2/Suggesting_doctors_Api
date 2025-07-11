package com.cetpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entity.Doctor;
import com.cetpa.repository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService 
{
	@Autowired
private DoctorRepository doctorRepository;

	public void saveDoctor(Doctor doctor)
	{
		
		doctorRepository.save(doctor);
	}
	

}
