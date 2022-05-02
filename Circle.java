/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.donglenh.Bai2;

/**
 *
 * @author Admin
 */
public class Circle extends Shape {
    private int radius;
    private int x,y;

    public Circle() {
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public double ChuVi() {
        double result = 2*Math.PI*this.radius;
        return result;
    }
    @Override
    public double Dientich(){
        double result = Math.PI*this.radius*this.radius;
        return result;
    }

    @Override
    public String toString() {
        String output = "Chu vi hinh tron la: " + ChuVi() + "; Dien Tich hinh tron la: "
                     + Dientich();
        return output;
    }
    
    

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
