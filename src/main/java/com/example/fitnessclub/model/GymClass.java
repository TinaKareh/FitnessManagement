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
import javax.persistence.Table;

/**
 *
 * @author Futuristic Ltd
 */
@Entity
@Table(name = "gym_class")
public class GymClass implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "class_id")
    private Long classId;
    private String className;

    @OneToMany
    @JoinTable(name = "trainer_class_mapping", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "trainer_id"))
    private List<Trainer> trainer;

    public GymClass() {
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Trainer> getTrainer() {
        return trainer;
    }

    public void setTrainer(List<Trainer> trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "GymClass{" + "classId=" + classId + ", className=" + className + ", trainer=" + trainer + '}';
    }

}
