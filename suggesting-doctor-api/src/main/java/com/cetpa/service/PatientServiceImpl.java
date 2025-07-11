package com.cetpa.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entity.Doctor;
import com.cetpa.entity.Patient;
import com.cetpa.exception.PatientNotFoundException;
import com.cetpa.repository.DoctorRepository;
import com.cetpa.repository.PatientRepository;
import com.cetpa.utility.Symptom;

@Service
public class PatientServiceImpl  implements PatientService
{
	@Autowired
    private PatientRepository patientRepository;
	@Autowired
	private DoctorRepository doctorRepository;
	public void savePatient(Patient patient)
	{
	patientRepository.save(patient);
		
	}

	public List<Doctor> findDoctorListByPatientSymptom(int pid) 
	{
		
		Patient patient=patientRepository.findById(pid).orElse(null);
		if(patient==null)
		{
			throw new PatientNotFoundException("Patient with pid " +pid+ " doesnot exits");
		}
		//return doctorRepository.findAll();
		String city=patient.getCity();
		if(!(city.equals("Delhi")||city.equals("Noida")||city.equals("Faridabad")))
		{
			throw new RuntimeException("We are Still waiting to expand to your location:");
			//RuntimeException is already a predDefine class so no need to create class of RuntimeException like PatientNotFoundException
		}
		String symptom=patient.getSymptom();
		String speciality=Symptom.map.get(symptom);
		List<Doctor> doctorList=doctorRepository.getDoctorListByCityAndSpeciality(city,speciality);
		if(doctorList.isEmpty())
		{
			throw new RuntimeException("There is not any doctor present at your location for your symptom");
		}
		return doctorList;
	}	
}
