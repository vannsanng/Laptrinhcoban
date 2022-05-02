/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.donglenh.Bai2;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Worker extends Person implements TaxInterface {
    private String Cty;

    public Worker() {
    }

    public Worker(String Cty, String HoTen, int GT, Date NS) {
        super(HoTen, GT, NS);
        this.Cty = Cty;
    }

    public String getCty() {
        return Cty;
    }

    public void setCty(String Cty) {
        this.Cty = Cty;
    }

    @Override
    public double calcTax(double income) {
        return (0.04 * income);
    }
    
    
    
    
}
