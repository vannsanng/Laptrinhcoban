/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong03.coffeelogic;

/**
 *
 * @author Admin
 */
public class Bill implements Cloneable {
    private int BillID;
    private Product[] SanPham;

    public Bill() {
    }

    public Bill(int BillID, Product[] SanPham) {
        this.BillID = BillID;
        this.SanPham = SanPham;
    }

    public int getBillID() {
        return BillID;
    }

    public void setBillID(int BillID) {
        this.BillID = BillID;
    }

    public Product[] getSanPham() {
        return SanPham;
    }

    public void setSanPham(Product[] SanPham) {
        this.SanPham = SanPham;
    }

    @Override
    public String toString() {
        String Ketqua = "Bill " + this.BillID + "\n";
        for(int i =0; i < SanPham.length; i ++){
            Ketqua += "\t" + SanPham[i].toString() + "\n";
        }
        return Ketqua;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Bill temp = (Bill) super.clone();
        temp.setBillID(this.BillID);
        temp.SanPham = new Product[this.SanPham.length];
        for(int i = 0; i < this.SanPham.length; i ++){
            temp.SanPham[i] = new Product(this.SanPham[i].getName(), this.SanPham[i].getPrice());
        }
        return temp;
    }
    
    
    
    
    
}
