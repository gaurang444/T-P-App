package com.example.muska.tp;

public class CompanyInformation {
    public String companyName;
    public String jobName;
    public String stipend;
    public String jobType;
    public String CGPA;


    public CompanyInformation(){

    }

    public CompanyInformation(String companyName, String jobName, String stipend, String jobType, String CGPA){
        this.companyName = companyName;
        this.jobName = jobName;
        this.stipend = stipend;
        this.jobType = jobType;
        this.CGPA = CGPA;
    }
}
