/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fitnessclub.controller;

import com.example.fitnessclub.exception.ResourceNotFoundException;
import com.example.fitnessclub.model.GymPackages;
import com.example.fitnessclub.repository.PackageRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<GymPackages> getPackageById(@PathVariable(value = "id") Long packageId)
            throws ResourceNotFoundException {
        GymPackages gymPack = packageRepository.findById(packageId)
                .orElseThrow(() -> new ResourceNotFoundException("Package not found for this id :: " + packageId));
        return ResponseEntity.ok().body(gymPack);
    }

    @PostMapping("/packages")
    public GymPackages createPackage(@Valid @RequestBody GymPackages packages) {
        return packageRepository.save(packages);
    }
    
     @DeleteMapping("/packages/{id}")
    public Map<String, Boolean> deletePackage(@PathVariable(value = "id") Long packageId)
         throws ResourceNotFoundException {
        GymPackages packages = packageRepository.findById(packageId)
       .orElseThrow(() -> new ResourceNotFoundException("Package not found for this id :: " + packageId));

        packageRepository.delete(packages);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
