package com.hospitalmanagementsystem.backend.Hospital.management.System.Controller;

import com.hospitalmanagementsystem.backend.Hospital.management.System.Model.Patient;
import com.hospitalmanagementsystem.backend.Hospital.management.System.Service.patientServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class patientController {
    @Autowired
    patientServiceLayer patientService;

    @GetMapping("/api/getPatientDetailsById/{pId}")
    public Patient getPatientDetailsById(@PathVariable String pId){
        return patientService.getPatientDetailsById(pId);
    }
    @PostMapping("/api/patient/addPatient")
    public String addPatient(@RequestBody Patient obj){
        patientService.addPatientToDB(obj);
        return "Patient with patientId: "+obj.getPatientId()+", name: "+obj.getPatientName()+" has been successfully added to the DB";
    }
}
