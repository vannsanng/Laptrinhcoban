/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong03.donglenh;

import com.mycompany.laptrinhjava.chuong03.coffeelogic.CoffeeShop;
import com.mycompany.laptrinhjava.chuong03.coffeelogic.Manager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class testCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        
        CoffeeShop[] a = new CoffeeShop[]{new CoffeeShop("Gong cha", "Nguyen Hue"),
                                          new CoffeeShop("Tan Coffee", "Nguyen Thi Minh Khai")};
        Manager[] QuanLy = new Manager[]{ new Manager(a, 1000, "Nguyen Van B", 0, df.parse("12-10-2001")),
                           new Manager(new CoffeeShop[]{
                                      new CoffeeShop("Ca Map Con", "To Huu")}, 0, "Phan Van A", 0, df.parse("20-12-2001"))
                                   
                              };
        System.out.println(Arrays.toString(QuanLy));
    }
    
}
