/*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.donglenh.Bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class Bai06 {
    public static void main(String [] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "15-02-2001";
        Date NS = df.parse(input);
        Person PR = new Person("Phan Van Sang", 1, NS);
        
        System.out.println("Ho Ten: " + PR.getHoTen() + "; Gioi Tinh: " + PR.getGT() +
                 ";Ngay sinh" + df.format(PR.getNS()));
        
        Student SV = new Student();
        SV.setHoTen("Nguyen Van A");
        SV.setGT(1);
        SV.setNS(df.parse("13-07-2001"));
        SV.setTruonghoc("Dai Hoc Kinh Te Hue");
        System.out.println("Ten Sinh Vien: " + SV.getHoTen() + "; Gioi Tinh: "
         + SV.getGT() + ";Ngay Sinh: " + df.format(SV.getNS()) + ";Truong Hoc: " + SV.getTruonghoc());
        
        System.out.println(SV.calcTax(1200));
        
        Worker CN = new Worker();
        CN.setHoTen("Tran Van Minh");
        CN.setGT(1);
        CN.setNS(df.parse("12-02-2000"));
        CN.setCty("Det May");
        System.out.println("Ten CN: " + CN.getHoTen() + "; Gioi Tinh :" + CN.getGT() +
                "; Ngay Sinh: " + df.format(SV.getNS()) + "; Ten Cty :" + CN.getCty());
        
        System.out.println(CN.calcTax(2000));
        
        
        
    }
}
