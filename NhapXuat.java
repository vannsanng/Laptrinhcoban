/*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.donglenh.Bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhapXuat {
    public static void main(String [] args){
        boolean flag = true;
        int a = 13;
        byte b = 2;
        double c = 12.6;
        float d = 4.5f;
        String S = "Hello World";
        char ch =  'A';
        
        Scanner as = new Scanner(System.in);
        System.out.print("Hay Nhap Thong Tin");
        String HoTen = as.nextLine();
        System.out.println("Ban Da Nhap Ho Ten La : " + HoTen);
        
        
        System.out.print("Hay Nhap So Nguyen ");
        String Input = as.nextLine();
        a = Integer.parseInt(Input);
        System.out.println("So Nguyen Ban da nhap " + a);
        
        System.out.print("Hay Nhap So Thuc ");
        Input = as.nextLine();
        c = Double.parseDouble(Input);
        System.out.println("So Thuc Ban da nhap " + c);
        
    }
        
}
