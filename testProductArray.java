/*
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong03.donglenh;

import com.mycompany.laptrinhjava.chuong03.coffeelogic.Product;
import com.mycompany.laptrinhjava.chuong03.coffeelogic.ProductComByName;
import com.mycompany.laptrinhjava.chuong03.coffeelogic.ProductCombyPrice;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Tao mang cac san pham
        Product[] sp = new Product[] {new Product("Sua", 12), 
                                      new Product("Nuoc Uong", 10),
                                      new Product("Banh", 7),
                                      new Product("Banh", 10)};
        System.out.println("Mang ban dau la");
        System.out.println(Arrays.toString(sp));
        
//        Product temp;
//        for(int i = 0;i < sp.length - 1; i++)
//            for(int j = i +1;j < sp.length; j++)
//                if(sp[i].getPrice() > sp[j].getPrice()) {
//                    temp = sp[i];
//                    sp[i] = sp[j];
//                    sp[j] = temp;
//                }
        // Sap xep mang theo gia ca tang dan
//        Arrays.sort(sp,new ProductCombyPrice());
//        System.out.println("Mang san xeo tnag dan theo gia ca");
//        System.out.println(Arrays.toString(sp));
        System.out.println("Mang sap xep theo ten san pham");
        Arrays.sort(sp, new ProductComByName());
        System.out.println(Arrays.toString(sp));
        
        int index = Arrays.binarySearch(sp, new Product("Banh", 10), new ProductComByName());
        if(index < 0) {
            System.out.println("Khong tim thay");
        }else{
            System.out.println("Phan tu thu " + index + " chua gia tri can tim");
            System.out.println(sp[index]);
        }
        
    }
    
}
