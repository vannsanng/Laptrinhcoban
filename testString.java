/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong03.donglenh;

/**
 *
 * @author Admin
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = "Long lanh day nuoc in troi \n Thanh xay khoi biec non phoi bong vang";
        System.out.println(content);
        // Thao tac 1 : Tim vi tri cua 1 ki tu
        System.out.println("Vi tri cua ki tu a trong chuoi la: " + content.indexOf('a'));
        System.out.println("Vi Tri cua tu nuoc trong chuoi la: " + content.indexOf("nuoc"));
        // Thao tac 2 : Kiem tra khoi dau va ket thuc
        System.out.println("Chuoi mo dau bang cum tu Long: "+ content.startsWith("Long"));
        System.out.println("Chuoi ket thuc bang cum tu Troi: "+ content.endsWith("troi"));
        // Thao tac 3 : cat chuoi theo vi tri 
        String temp = content.substring(21, 26);
        System.out.println("Chuoi con la : " + temp);
        //Thao tac 4 : Phân tách chuoi theo kí tư đặc biệt
        String [] result = content.split("\n");
        for(int i = 0;i<result.length; i++){
            System.out.println(result[i]);
        }
        //Thao tac 5 : loai bo khoang trang dau - cuoi chuoi
         for(int i = 0;i<result.length; i++){
            System.out.println(result[i].trim());
        }
         //Thao tac 6 : Thay the ki tu
         temp = content.replace("a", "z");
         System.out.println(temp);
         //Thao tac 7 : Chuyen kieu
         temp = content.toUpperCase();
         System.out.println(temp);
         temp = content.toLowerCase();
         System.out.println(temp);
         
         //Thao tac 8 : So sanh chuoi
         temp = "Nguyen";
         if(temp.compareToIgnoreCase("nguyen") ==0){
             System.out.println("2 chuoi bang nhau");
         }else{
             System.out.println("2 chuoi khong ban nhau");
         }
         
         //Thao tac 9 : Noi chuoi
         temp = temp.concat(" Van A");
         System.out.println(temp);
         
         //Thao tac 10 : truy xuat bang chi so
         for(int i = 0;i< temp.length(); i++){
             System.out.print(temp.charAt(i));
         }
         System.out.println();
         
         //Thao tac 11 : Chuyen kieu
         temp = "155";
         int n = Integer.parseInt(temp);
         System.out.println("n = " + n);
         
         //Thao tac 12 : Su dung StringBuilder
         StringBuilder sb = new StringBuilder();
         sb.append("Long lanh day nuoc in troi\n");
         sb.append("Thanh xay khoi biec non phoi bong vang");
         temp = sb.toString();
         System.out.println(sb);
    }
    
}
