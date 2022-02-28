/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fitnessclub.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Futuristic Ltd
 */
@Entity
@Table(name="medical_conditions")
public class MedicalConditions implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "medical_condition_id")
    private Long medical_condition_Id;
    private String medicalName;

    public MedicalConditions() {
    }

    public Long getMedical_condition_Id() {
        return medical_condition_Id;
    }

    public void setMedical_condition_Id(Long medical_condition_Id) {
        this.medical_condition_Id = medical_condition_Id;
    }

    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName;
    }

    @Override
    public String toString() {
        return "MedicalConditions{" + "medical_condition_Id=" + medical_condition_Id + ", medicalName=" + medicalName + '}';
    }
  
}
