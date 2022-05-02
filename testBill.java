/*
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong03.donglenh;

import com.mycompany.laptrinhjava.chuong03.coffeelogic.Bill;
import com.mycompany.laptrinhjava.chuong03.coffeelogic.Product;

/**
 *
 * @author Admin
 */
public class testBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        Bill HD = new Bill(12, new Product[]{
                           new Product("Dau goi", 12),
                           new Product("Banh", 21)});
        System.out.println("Hoa Don = " + HD);
        
        Bill temp = (Bill) HD.clone();
        temp.setBillID(15);
        
        System.out.println("Hoa Don = " + HD);
        System.out.println("temp = " + temp);
    }
    
}
