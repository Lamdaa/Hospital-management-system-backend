package com.hospitalmanagementsystem.backend.Hospital.management.System.Controller;

import com.hospitalmanagementsystem.backend.Hospital.management.System.Model.Patient;
import com.hospitalmanagementsystem.backend.Hospital.management.System.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {
    @Autowired
    HospitalService hospitalService;
    @GetMapping("/api/hospital/getpatient")
    public String getPatientByBedNumber(@RequestParam int bedNumber){
        Patient obj = hospitalService.getPatientFromBedNumber(bedNumber);
        return "********** LAMDA TRUST ORGANIZATION **********\n********** PATIENT's DETAIL's CORNER **********\n  Name of the Patient: "+obj.getPatientName()+"\n Patient Id: "+obj.getpId()+"\n Gender: "+obj.getPatientGender()+"\n Patient Age: "+obj.getPatientAge()+"\n Patient Address: "+obj.getPatientAddress()+"\n Patient Disease: "+obj.getPatientDisease()+"\n Patient Admit Date: "+obj.getAdmitDate();
    }
}
