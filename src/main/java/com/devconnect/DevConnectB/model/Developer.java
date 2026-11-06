package com.devconnect.DevConnectB.model;

import java.util.*;

public class Developer {
    private Long id;
    private String  firstName;
    private String lastName;
    private String email;
    private String phone;
    private String bio;
    private String city;
    private String linkdlnURL;
    private String gitHubURL;
    private List<String>skills;
    private String organization;

    public Developer(){}

    public Developer(Long id,String firstName,String lastName,String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

}
