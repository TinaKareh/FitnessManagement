/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fitnessclub.constants;

/**
 *
 * @author Futuristic Ltd
 */
public enum UserType {
    AD("Administrator"),
    TR("Trainer"),
    ME("Member");
    
    private final String uType;

     private UserType(String uType) {
        this.uType = uType;
    }
    public String getuType() {
        return uType;
    }
    
    
    
}
