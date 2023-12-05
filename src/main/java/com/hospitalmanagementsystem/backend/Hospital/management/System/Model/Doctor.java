package com.hospitalmanagementsystem.backend.Hospital.management.System.Model;

public class Doctor {
    private String docID;
    private String docName;
    private String docDegree;
    private String docGender;

    private int docFee;

    public Doctor(String docID, String docName, String docDegree, String docGender, int docFee) {
        this.docID = docID;
        this.docName = docName;
        this.docDegree = docDegree;
        this.docGender = docGender;
        this.docFee = docFee;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocDegree() {
        return docDegree;
    }

    public void setDocDegree(String docDegree) {
        this.docDegree = docDegree;
    }

    public String getDocGender() {
        return docGender;
    }

    public void setDocGender(String docGender) {
        this.docGender = docGender;
    }

    public int getDocFee(){
        return docFee;
    }
}
