package com.cetpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.entity.Doctor;
import com.cetpa.service.DoctorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("doctor")
public class DoctorController 
{
	@Autowired
	private DoctorService doctorService;
	//http://localhost:8080/doctor/add
	@PostMapping("add")
	public ResponseEntity<Doctor> addDoctor(@Valid @RequestBody Doctor doctor)
	{
		doctorService.saveDoctor(doctor);
		return ResponseEntity.status(HttpStatus.CREATED).body(doctor);
		//System.out.println("Controller classes");
		//return ResponseEntity.status(HttpStatus.CREATED).body(doctor);
	}

}
