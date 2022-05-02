/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong04.donglenh;

import com.mycompany.laptrinhjava.chuong04.logic.FibonacciNumber;

/**
 *
 * @author Admin
 */
public class testFibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println("So Fionacci tai vi tri n = 15 la " + fn.calcFibo(15));
        for(int i = 1; i<=20; i++){
            System.out.print(fn.calcFibo(i) + ", ");
        }
    }
    
}
