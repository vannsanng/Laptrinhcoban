/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong05.donglenh;

import com.mycompany.laptrinhjava.chuong05.logic.FileAndDiretoryOperations;
import java.io.File;

/**
 *
 * @author Admin
 */
public class testFileAndDiretory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDiretoryOperations fo = new FileAndDiretoryOperations();
        //File[] content = fo.getDiretoryContent("D:\\du lieu c\\Documents");
        //System.out.println(fo.displayContent(content));
//        File[] thumuc = fo.getSubDiretories(content);
//        System.out.println("Danh sach cac thu muc co la");
//        System.out.println(fo.displayContent(thumuc));
//        File[] taptin = fo.getFiles(content);
//        System.out.println("Danh sach cac tap tin");
//        System.out.println(fo.displayContent(taptin));
         fo.getContentRecursivaly("D:\\du lieu c");
    }
    
}
