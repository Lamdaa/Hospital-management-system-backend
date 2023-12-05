package com.hospitalmanagementsystem.backend.Hospital.management.System.Controller;

import com.hospitalmanagementsystem.backend.Hospital.management.System.Model.Bill;
import com.hospitalmanagementsystem.backend.Hospital.management.System.Model.Doctor;
import com.hospitalmanagementsystem.backend.Hospital.management.System.Model.Patient;
import com.hospitalmanagementsystem.backend.Hospital.management.System.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @DeleteMapping("/api/patient/discharge")
    public Bill disChargePatient(@RequestParam String patientId, @RequestParam String dischargeDate){
        return patientService.dischargePatient(patientId, dischargeDate);
    }

    @GetMapping("/api/patient")
    public Patient getPatientByID(@RequestParam String patientID){
        return patientService.getPatientById(patientID);
    }

    @PostMapping("/api/patient/addpatient")
    public String addPatientToDatabase(@RequestBody Patient obj){
        patientService.addPatientToDatabase(obj);
        return "Patient with pId: "+obj.getpId()+" and name: "+obj.getPatientName()+" have been added successfully into database";
    }


    @GetMapping("/api/patient/getdoctor/{pID}")
    public Doctor getPatientsDoctor(@PathVariable String pID){
        // Which doctor is handeling the particular patient
        return patientService.getPatientsDoctor(pID);
    }


    // user (pID) ->
}
