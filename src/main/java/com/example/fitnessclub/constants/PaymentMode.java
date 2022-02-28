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
public enum PaymentMode {
    CD("Credit Card"),
    MP("M-Pesa"),
    BT("Bank Transfer");

    private final String paymentMode;

    private PaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
 
    public String getPaymentMode() {
        return paymentMode;
    }

    

}
