/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong05.dohoa;

import com.mycompany.laptrinhjava.chuong05.logic.FileAndDiretoryOperations;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Admin
 */
public class MyTestDemo extends javax.swing.JFrame {

    /**
     * Creates new form MyTestDemo
     */
    public MyTestDemo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        jTextField = new javax.swing.JTextField();
        butOpen = new javax.swing.JButton();
        butSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKetQua = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trinh xử lý văn bản");

        butOpen.setText("Open");
        butOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOpenActionPerformed(evt);
            }
        });

        butSave.setText("Save");
        butSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSaveActionPerformed(evt);
            }
        });

        txtKetQua.setColumns(20);
        txtKetQua.setRows(5);
        jScrollPane1.setViewportView(txtKetQua);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butOpen, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(butSave, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butOpen)
                    .addComponent(butSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOpenActionPerformed
        // TODO add your handling code here:
        int value = jFileChooser.showOpenDialog(this);
        if(value == JFileChooser.APPROVE_OPTION){
            File file = jFileChooser.getSelectedFile();
            this.jTextField.setText(file.getAbsolutePath());
            //Mo file 
            FileAndDiretoryOperations fo = new FileAndDiretoryOperations();
            this.txtKetQua.setText(fo.readTextFile(file.getAbsolutePath()));
        }
    }//GEN-LAST:event_butOpenActionPerformed

    private void butSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSaveActionPerformed
        // TODO add your handling code here:
        int value = jFileChooser.showSaveDialog(this);
        if(value == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            //Luu File
            FileAndDiretoryOperations fo = new FileAndDiretoryOperations();
            boolean result = fo.wirteTextFile(file.getAbsolutePath(), this.txtKetQua.getText());
            if(result){
                jTextField.setText("Luu thanh cong");
                
            }else{
                jTextField.setText("Khong luu duoc file");
            }
        }
    }//GEN-LAST:event_butSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyTestDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyTestDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyTestDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyTestDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyTestDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butOpen;
    private javax.swing.JButton butSave;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField;
    private javax.swing.JTextArea txtKetQua;
    // End of variables declaration//GEN-END:variables
}