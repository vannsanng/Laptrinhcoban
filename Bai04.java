/*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.donglenh.Bai2;

/**
 *
 * @author Admin
 */
public class Bai04 {
    public static void main(String [] args){
        Shape Hinhtron = new Circle(5,1,2);
//        System.out.println("Chu vi cua hinh tron " + Hinhtron.ChuVi());
//        System.out.println("Dien tich cua hinh tron " + Hinhtron.Dientich());
        System.out.println(Hinhtron.toString());
        
        Shape HCN = new Rectangle(3,15,8,5);
//        System.out.println("Chu vi cua hinh chu nhat " + HCN.ChuVi());
//        System.out.println("Dien tich cua hinh chu nhat " + HCN.Dientich());
        System.out.println(HCN);
    }
}
