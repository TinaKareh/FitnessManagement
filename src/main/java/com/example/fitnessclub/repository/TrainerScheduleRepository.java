/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fitnessclub.repository;

import com.example.fitnessclub.model.TrainerSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Futuristic Ltd
 */
public interface TrainerScheduleRepository extends JpaRepository<TrainerSchedule, Long>{
    
}
