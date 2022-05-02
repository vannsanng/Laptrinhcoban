/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong2.employeelogic;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student extends Person implements TaxInterface {
   private String truonghoc;
   private String hoclich;
   private double hocbong;

    public Student() {
    }

    public Student(String truonghoc, String HoTen, int GT, Date NS) {
        super(HoTen, GT, NS);
        this.truonghoc = truonghoc;
    }

    public Student(String truonghoc, String hoclich, String HoTen, int GT, Date NS) {
        super(HoTen, GT, NS);
        this.truonghoc = truonghoc;
        this.hoclich = hoclich;       
    }

    public String getHoclich() {
        return hoclich;
    }

    public void setHoclich(String hoclich) {
        this.hoclich = hoclich;
    }

    public double getHocbong() {
        return hocbong;
    }

    public void setHocbong(double hocbong) {
        this.hocbong = hocbong;
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

    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua += " Student{" + "truonghoc=" + truonghoc + ", hoclich=" + hoclich + ", hocbong=" + hocbong + '}';
        return ketqua;
    }
    
    
    
    
   
    
}
