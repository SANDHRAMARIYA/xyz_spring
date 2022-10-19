package com.nestdigital.xyzbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int rollnum;
    private int admnnum;
    private String collegename;
    private String department;
    private String blood;
    private String dob;
    private String parentname;
    private String pemail;
    private String gname;
    private String gaddress;

    public StudentModel() {
    }

    public StudentModel(int id, String name, int rollnum, int admnnum, String collegename, String department, String blood, String dob, String parentname, String pemail, String gname, String gaddress) {
        this.id = id;
        this.name = name;
        this.rollnum = rollnum;
        this.admnnum = admnnum;
        this.collegename = collegename;
        this.department = department;
        this.blood = blood;
        this.dob = dob;
        this.parentname = parentname;
        this.pemail = pemail;
        this.gname = gname;
        this.gaddress = gaddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollnum() {
        return rollnum;
    }

    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }

    public int getAdmnnum() {
        return admnnum;
    }

    public void setAdmnnum(int admnnum) {
        this.admnnum = admnnum;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGaddress() {
        return gaddress;
    }

    public void setGaddress(String gaddress) {
        this.gaddress = gaddress;
    }
}
