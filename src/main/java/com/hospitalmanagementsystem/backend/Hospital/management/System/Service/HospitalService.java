package com.hospitalmanagementsystem.backend.Hospital.management.System.Service;

import com.hospitalmanagementsystem.backend.Hospital.management.System.Model.Patient;
import com.hospitalmanagementsystem.backend.Hospital.management.System.Repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {

    @Autowired
    HospitalRepository hosptalRepo;

    public int getFirstEmptyBedNumber(){
        Patient[] beds = hosptalRepo.getAllBeds();

        for(int i  = 0; i < beds.length; i++){
            if(beds[i] == null){
                return i; // Got First Empty Bed
            }
        }
        return -1; // No Bed is empty
    }

    public void assignPatientABed(int bedNumber, Patient obj){
        hosptalRepo.assignPatientToBedNumber(bedNumber, obj);
    }

    public Patient getPatientFromBedNumber(int bedNumber){
        return hosptalRepo.getPatientAtParticularBedNumber(bedNumber);
    }

    public void deAllocatePatientsFromBed(String pId){
        hosptalRepo.deAllocatePatientFromBed(pId);
    }

    public  int getBedFee(){
        return hosptalRepo.getBedFee();
    }
}