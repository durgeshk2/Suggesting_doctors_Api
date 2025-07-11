package com.cetpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.entity.Doctor;
import com.cetpa.entity.Patient;
import com.cetpa.service.PatientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("patient")
public class PatientController 
{
	@Autowired
	private PatientService patientService;
	@PostMapping("add")
	//http://localhost:8080/patient/add
	public ResponseEntity<Patient> addPatient(@Valid @RequestBody Patient patient)
	{
		patientService.savePatient(patient);
		return ResponseEntity.status(HttpStatus.CREATED).body(patient);
	}
	//http://localhost:8080/patient/doctor-list/bypid?pid=1003
	@GetMapping("doctor-list/bypid")
	public ResponseEntity<List<Doctor>> getDoctorListByPatientId(@RequestParam int pid)
	{
		List<Doctor> doctorList=patientService.findDoctorListByPatientSymptom(pid);
		return ResponseEntity.ok(doctorList);
	}

}
