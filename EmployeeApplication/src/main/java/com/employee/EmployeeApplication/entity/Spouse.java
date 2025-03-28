package com.employee.EmployeeApplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name="spouse")
public class Spouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mobileNo;
    private String age;

    @OneToOne(mappedBy = "spouse")
    private Employee employee;

    public Spouse(String name, String mobileNo, String age) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.age = age;
    }

    public Spouse() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
