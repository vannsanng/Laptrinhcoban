/*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong03.donglenh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class testArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int [] a;
        // khoi tao 
//        a= new int[4];
//        a[0] = 12;
//        a[1] = 15;
//        a[2] = 9;
//        a[3] = 2;
        //xuat du lieu ra man hinh
        //System.out.println(a.toString());
        //System.out.println(Arrays.toString(a));
        
//        int[] b = new int[] {1,5,10,-9,20};
//        System.out.println(Arrays.toString(b));
//        System.out.println("So luong phan tu cua mang la " + b.length);
          
          // Nhap tu ban phim
           Scanner sc = new Scanner(System.in);
           System.out.print("So luong phan tu cua mang n = ");
           String input = sc.nextLine();
           int n = Integer.parseInt(input);
           int[] c = new int[n];
//           for(int i = 0; i< n; i ++) {
//               System.out.print("C [" + i + "] = ");
//               input = sc.nextLine();
//               c[i] = Integer.parseInt(input);
//               
//           }
//           System.out.println("Gia tri cua mang vua nhap la ");
//           //System.out.println(Arrays.toString(c));
//           
//           for(int i = 0; i < c.length; i ++){
//               System.out.print(c[i] + " ");
//           }
          Random rnd = new Random();
          for(int i = 0; i < n; i++){
              c[i] = rnd.nextInt(1000);
          }
          System.out.println(Arrays.toString(c));
          
           // Sap xep mang theo chieu tang dan
          Arrays.sort(c);
          System.out.println("Mang sau khi sap xep tang dan la");
          System.out.println(Arrays.toString(c));
          
          // Tim kiem 
          System.out.print("Nhap gia tri can tim kiem = ");
          input = sc.nextLine();
          int x = Integer.parseInt(input);
          
          // Tim kiem nhi phan
          
          int index = Arrays.binarySearch(c, x);
          if(index < 0) {
              System.out.println("Khong tim thay");
          }else{
              System.out.println("Tim thay tai vi tri thu " + index);
          }
//          int x = Integer.parseInt(input);
//          
//          boolean flag = false;
//          
//          for(int i = 0; i < c.length; i++){
//              if(c[i] == x){
//                  System.out.println("Gia tri can tim kiem co trong mang tai vi tri " + i);
//                  flag = true;
//                  break;
//              }
//          }
//          
//          if(!flag) {
//              System.out.println("Gia tri can tim kiem khong co trong mang");
//          }
          // Săp xep tang dan
//          int temp;
//          for(int i =0; i< n -1; i ++)
//              for(int j = i +1; j< n; j++){
//                  if(c[i] > c[j]){
//                      temp = c[i];
//                      c[i] = c[j];
//                      c[j] = temp;
//                  }
//              }
//          System.out.println(Arrays.toString(c));
           Arrays.sort(c);
           System.out.println(Arrays.toString(c));
    }
    
}
