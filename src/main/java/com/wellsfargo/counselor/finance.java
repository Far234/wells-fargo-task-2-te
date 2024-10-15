package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class FinancialAdvisor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    private String name;
    private String email;
    private String phoneNumber;
    private String businessHours;

    public FinancialAdvisor(String name, String email, String phoneNumber, String businessHours) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.businessHours = businessHours;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }
}
