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
public class Student extends Person implements TaxInterface {
   private String truonghoc;

    public Student() {
    }

    public Student(String truonghoc, String HoTen, int GT, Date NS) {
        super(HoTen, GT, NS);
        this.truonghoc = truonghoc;
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcTax(double income) {
        double tax;
        tax = 0.01 * income;
        return tax;
    }
    
    
   
    
}
