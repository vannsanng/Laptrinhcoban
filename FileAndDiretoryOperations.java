/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong05.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FileAndDiretoryOperations {

    public FileAndDiretoryOperations() {
    }
    
    //Thao tac 1: Liet ke tat ca cac thu muc và tap tin trong thu muc hien tai
    public File[] getDiretoryContent(String folder){
        File diretory = new File(folder);
        if(diretory.isFile())
            return null;
        File[] result = diretory.listFiles();
        return result;
    }
    
    //Thao tac 2 : Xuat ket qua
    public String displayContent (File[] content) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< content.length;i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    //Thao tac 3 : Loc ra cac thu muc
    public File[] getSubDiretories(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i =0 ;i< content.length;i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    //Thao tac 4 : Loc ra tat ca cac tap tin 
    public File[] getFiles(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i =0 ;i< content.length;i++){
            if(content[i].isFile()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    //Thao tac 5 : Duyet De quy xuat tat ca cac tap tin cua thu muc
    public void getContentRecursivaly(String folder) {
        File content = new File(folder);
        //Dieu kien dung
        if(content.isFile()){
            System.out.println(content.getPath()+File.separator+ content.getName());
            return;
        }
        // Cau goi de quy trong stack
        System.out.println("Thu muc " + folder);
        File[] sub = content.listFiles();
        for(int i = 0; i < sub.length; i++){
            getContentRecursivaly(folder +File.separator+ sub[i].getName());
        }
    }
    //Thao tac 6: Doc file van ban
    public String readTextFile(String filename){
        StringBuilder content = new StringBuilder();
        
        try {
            //Mo file
            FileReader fr = new FileReader(filename);
            //Dung bo dem
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
                content.append(line);
                content.append("\n");
            }
            
            //Dong file
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            return "Khong tim thay file " + filename;
        } catch (IOException ex) {
            return "Khong the doc file " + filename;
        }
        
        return content.toString();
    }
    
    //Thao tac 7 : Luu tap tin van ban
    public boolean wirteTextFile(String filename, String content){
        boolean flag = true; // luu thanh cong
        try {
            //Mo file
            FileWriter fw = new FileWriter(filename);
            //Su dung buffer
            BufferedWriter bw = new BufferedWriter(fw);
            // Ghi ra file
            bw.write(content);
            // Dong file 
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            return false;
        }
        return flag;
    }
}
