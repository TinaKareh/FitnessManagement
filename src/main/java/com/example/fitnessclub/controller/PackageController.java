/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fitnessclub.controller;

import com.example.fitnessclub.model.GymPackages;
import com.example.fitnessclub.repository.PackageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Futuristic Ltd
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class PackageController {

    @Autowired
    private PackageRepository packageRepository;

    @GetMapping("/packages")
    public List<GymPackages> getAllPackages() {
        return packageRepository.findAll();
    }
    
    @GetMapping("/packages/{id}")
    public ResponseEntity<GymPackages>getPackageDetails(@PathVariable(value ="id") Long packageId) {
        return null;
    }
}
