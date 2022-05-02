/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhjava.chuong05.logic;

import java.io.File;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Admin
 */
public class FileTreeModel implements TreeModel {
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;
    
    public FileTreeModel(String rootDir){
        //Khoi tao nut goc
        rootNode = new DefaultMutableTreeNode(new File(rootDir));
        
        //Khoi tao cay
        buildDirectoyTree(rootNode, rootDir);
        tree = new DefaultTreeModel(rootNode);
    }
    
    //Tao cay thu muc
     public void buildDirectoyTree (DefaultMutableTreeNode node,
                                    String rootDir) {
         File curtir = new File(rootDir);
         if(!curtir.isDirectory()){
             return;
          }
          File[] list = curtir.listFiles();
          for (int i = 0; i < list.length; i++) {
          DefaultMutableTreeNode child = new DefaultMutableTreeNode(list[i]);
          node.add(child);
          buildDirectoyTree(child, rootDir +File.separator+ list[i].getName());
        }
    }

    @Override
    public Object getRoot() {
         return this.rootNode;
    }

    @Override
    public Object getChild(Object parent, int index) {
           return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
        return tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
        return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
         tree.removeTreeModelListener(l);
    }
    
}
