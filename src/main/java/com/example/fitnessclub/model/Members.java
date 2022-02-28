/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fitnessclub.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Futuristic Ltd
 */
@Entity
@Table(name = "members")
public class Members implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long memberId;
    private String emergencyContact;
    private String medicalNotes;

    @OneToOne
    @JoinColumn(name = "user_id")
    private AuthUser user;

    @OneToMany
    @JoinTable(name = "member_medical_condition_mapping", joinColumns = @JoinColumn(name = "member_id"), inverseJoinColumns = @JoinColumn(name = "medical_condition_id"))
    private List<MedicalConditions> condition;

    public Members() {
    }

    public List<MedicalConditions> getCondition() {
        return condition;
    }

    public void setCondition(List<MedicalConditions> condition) {
        this.condition = condition;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getMedicalNotes() {
        return medicalNotes;
    }

    public void setMedicalNotes(String medicalNotes) {
        this.medicalNotes = medicalNotes;
    }

    public AuthUser getUser() {
        return user;
    }

    public void setUser(AuthUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Members{" + "memberId=" + memberId + ", emergencyContact=" + emergencyContact + ", medicalNotes=" + medicalNotes + ", user=" + user + '}';
    }

}
