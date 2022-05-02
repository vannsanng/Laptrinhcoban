/*
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong03.coffeelogic;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Manager extends Person {
    private CoffeeShop[] shopcf;
    private double income;

    public Manager() {
        super();
    }

    public Manager(CoffeeShop[] shopcf, double income, String HoTen, int GT, Date NS) {
        super(HoTen, GT, NS);
        this.shopcf = shopcf;
        this.income = income;
    }

    public CoffeeShop[] getShopcf() {
        return shopcf;
    }

    public void setShopcf(CoffeeShop[] shopcf) {
        this.shopcf = shopcf;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        String Ketqua = super.toString();
        Ketqua += "Manager{" + "shopcf=" + Arrays.deepToString(shopcf) + ", income=" + income + '}';
        return Ketqua;
    }
    
    
    
    
    
    
}
