package com.example.muska.tp;


public class Contact {

    String name,email,uname,pass;
    String jname,cname,stipend,jtype,skill1,skill2,cgpa;
    int jid;
    int id;

    //constructor
    Contact(){}

    public void setName(String name)
    {
        this.name=name;

    }
    public String getName()
    {
        return this.name;
    }
    public void setEmail(String email)
    {
        this.email=email;

    }
    public String  getEmail()
    {
        return this.email;
    }

    public void setUname(String uname)
    {
        this.uname=uname;

    }
    public String getUname()
    {
        return this.uname;
    }
    public void setPass(String pass)
    {
        this.pass=pass;

    }
    public String getCgpa()
    {
        return this.cgpa;
    }
    public int getJid() { return this.jid;}
    public String getPass()
    {
        return this.pass;
    }
    public String getJname()
    {
        return this.jname;
    }
    public String getCname()
    {
        return this.cname;
    }
    public String getStipend()
    {
        return this.stipend;
    }
    public String getJType()
    {
        return this.jtype;
    }
    public String getSkill1()
    {
        return this.skill1;
    }
    public String getSkill2()
    {
        return this.skill2;
    }
}
