package com.hospitalmanagementsystem.backend.Hospital.management.System.Repository;

import com.hospitalmanagementsystem.backend.Hospital.management.System.Model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class patientRepository {
    private HashMap<String, Patient> patientDB;
    private int patientsTillNow;

    public patientRepository() {
        this.patientDB = new HashMap<>();
        this.patientsTillNow = 0;
    }
    public void addPatient(Patient obj){
        this.patientsTillNow+=1;
        patientDB.put(obj.getPatientId(),obj);
    }
    public Patient getPatientDetailsById(String patientId){
        return patientDB.get(patientId);
    }
    public int getOverAllPatients(){
        return patientsTillNow;
    }
}
