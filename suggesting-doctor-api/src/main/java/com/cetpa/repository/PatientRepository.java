package com.cetpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.entity.Patient;

public interface PatientRepository  extends JpaRepository<Patient,Integer>
{
	

}
