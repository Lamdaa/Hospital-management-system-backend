package com.hospitalmanagementsystem.backend.Hospital.management.System.Service;

import com.hospitalmanagementsystem.backend.Hospital.management.System.Model.Patient;
import com.hospitalmanagementsystem.backend.Hospital.management.System.Repository.patientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class patientServiceLayer {
    @Autowired
    patientRepository patientRepo;

    public Patient getPatientDetailsById(String patientId){
        return patientRepo.getPatientDetailsById(patientId);
    }

    public void addPatientToDB(Patient obj){
        String pId = "Patient"+patientRepo.getOverAllPatients()+1;
        obj.setPatientId(pId);
        patientRepo.addPatient(obj);
    }

}
