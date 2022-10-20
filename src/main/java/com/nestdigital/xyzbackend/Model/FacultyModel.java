package com.nestdigital.xyzbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "faculties")
public class FacultyModel {

@Id
@GeneratedValue
    private int id;
    private String name;
    private String department;
    private String dob;
    private String education;
    private String address;
    private String mobile;
    private String doj;

    public FacultyModel() {
    }

    public FacultyModel(int id, String name, String department, String dob, String education, String address, String mobile, String doj) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.dob = dob;
        this.education = education;
        this.address = address;
        this.mobile = mobile;
        this.doj = doj;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }
}
