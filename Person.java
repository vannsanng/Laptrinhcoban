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
public class Person {
    private String HoTen;
    private int GT;
    private Date NS;

    public Person() {
    }

    public Person(String HoTen, int GT, Date NS) {
        this.HoTen = HoTen;
        this.GT = GT;
        this.NS = NS;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getGT() {
        return GT;
    }

    public void setGT(int GT) {
        this.GT = GT;
    }

    public Date getNS() {
        return NS;
    }

    public void setNS(Date NS) {
        this.NS = NS;
    }

    @Override
    public String toString() {
        return "Person{" + "HoTen=" + HoTen + ", GT=" + GT + ", NS=" + NS + '}';
    }
    
    
    
    
}
