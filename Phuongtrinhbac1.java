/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong2.logicdayer;

/**
 *
 * @author Admin
 */
public class Phuongtrinhbac1 implements PhuongTrinhInterface {
    private double a;
    private double b;
    private double nghiem_x;
    private String KetQua;

    public Phuongtrinhbac1() {
    }

    public Phuongtrinhbac1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void GiaiPhuongTrinh() {
       if(a !=0) {
           nghiem_x = -b/a;
           KetQua = "Phuong Trinh Bac 1 co nghiem la: " + nghiem_x;
       }else{
           if(b != 0) {
               KetQua = "Phuong Trinh bac 1 vo nghiem";
           } else {
               KetQua = "Phuong Trinh bac 1 co vo so nghiem";
           }
       }
    }

    @Override
    public String toString() {
       if(KetQua == null || KetQua.isEmpty()) {
           GiaiPhuongTrinh();
       }
       return KetQua;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getNghiem_x() {
        return nghiem_x;
    }

    public void setNghiem_x(double nghiem_x) {
        this.nghiem_x = nghiem_x;
    }

    public String getKetQua() {
        return KetQua;
    }

    public void setKetQua(String KetQua) {
        this.KetQua = KetQua;
    }
    
    
    
    
    
    
}
