package com.hospitalmanagementsystem.backend.Hospital.management.System.Model;

public class Patient {
    private String patientName;
    private String patientId;
    private String patientAddress;
    private int patientAge;
    private String patientGender;
    private String patientDisease;
    private String patientAdmitDate;

    public Patient(String patientName, String patientId, String patientAddress, int patientAge, String patientGender, String patientDisease, String patientAdmitDate) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.patientAddress = patientAddress;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
        this.patientDisease = patientDisease;
        this.patientAdmitDate = patientAdmitDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientAdmitDate() {
        return patientAdmitDate;
    }

    public void setPatientAdmitDate(String patientAdmitDate) {
        this.patientAdmitDate = patientAdmitDate;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }
}
