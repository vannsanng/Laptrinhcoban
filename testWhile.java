/*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong2.donglenh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class testWhile {
    public static void main(String [] args) {
        int n = 0;
        int i;
        
//        // Ki thuat cong don
//        double s1= 0;
//        n = 100;
//        i = 1;
//        while(i<=n){
//            s1 = s1 + (double) i/1;
//            i = i+1;
//        }
//        System.out.println("Tong thu nhat la =" + s1);
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(!flag){
            System.out.print("Nhap so nguyen duong le n = ");
            String input = sc.nextLine();
            n = Integer.parseInt(input);
//            if((n > 0) && (n%2 !=0)){
//                flag = true;               
//            } else {
//                flag = false;
//            }
            flag = ((n > 0) && (n % 2 != 0))?true:false;
        }
        
        // ki thuat thay doi buoc nhay
        
       int s2= 0;
       i =1 ;
       //n = 99;
       while(i <=n){
           s2 = s2 +i;
           i = i + 2;
       }
       System.out.println("Tong thu hai la s2 = " + s2);
    }
}
