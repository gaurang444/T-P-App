package com.example.muska.tp;

public class experience {
    String expid;
    String exp;
    String nameofs;
    String company;
    String batch;


    public experience() {
    }

    public experience(String exp, String nameofs, String company, String batch) {

        this.exp = exp;
        this.nameofs = nameofs;
        this.company = company;
        this.batch = batch;
    }

    public String getExpid() {
        return expid;
    }

    public void setExpid(String expid) {
        this.expid = expid;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getNameofs() {
        return nameofs;
    }

    public void setNameofs(String nameofs) {
        this.nameofs = nameofs;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
