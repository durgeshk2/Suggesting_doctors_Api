package com.cetpa.service;

import java.util.List;

import com.cetpa.entity.Doctor;
import com.cetpa.entity.Patient;

public interface PatientService {

	void savePatient(Patient patient);

	List<Doctor> findDoctorListByPatientSymptom(int pid);

	

}
