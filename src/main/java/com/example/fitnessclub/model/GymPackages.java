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
@Table(name = "gym_packages")
public class GymPackages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "package_id")
    private Long packageId;
    private String packageName;
    private String commitmentLength;
    private String price;

    @OneToMany
    @JoinTable(name = "package_class_mapping", joinColumns = @JoinColumn(name = "package_id"), inverseJoinColumns = @JoinColumn(name = "class_id"))
    private List<GymClass> gymClass;
    
    @OneToMany
    @JoinTable(name = "package_level_mapping", joinColumns = @JoinColumn(name = "package_id"), inverseJoinColumns = @JoinColumn(name = "level_id"))
    private List<GymLevels> gymLevel;

    public GymPackages() {
    }

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getCommitmentLength() {
        return commitmentLength;
    }

    public void setCommitmentLength(String commitmentLength) {
        this.commitmentLength = commitmentLength;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<GymClass> getGymClass() {
        return gymClass;
    }

    public void setGymClass(List<GymClass> gymClass) {
        this.gymClass = gymClass;
    }

    public List<GymLevels> getGymLevel() {
        return gymLevel;
    }

    public void setGymLevel(List<GymLevels> gymLevel) {
        this.gymLevel = gymLevel;
    }

    @Override
    public String toString() {
        return "Package{" + "packageId=" + packageId + ", packageName=" + packageName + ", commitmentLength=" + commitmentLength + ", price=" + price + ", gymClass=" + gymClass + ", gymLevel=" + gymLevel + '}';
    }

    
}
