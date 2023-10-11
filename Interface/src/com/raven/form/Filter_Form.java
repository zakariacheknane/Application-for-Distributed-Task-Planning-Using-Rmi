package com.raven.form;

import com.raven.server.FilterInterface;
import com.raven.component.Form;
import com.raven.form.*;
import java.util.Arrays;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Filter_Form extends Form {
 private String selectedImagePath;
    public Filter_Form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Upload Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Grayscale");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sepia");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Negative");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(688, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53)
                        .addComponent(jButton2)
                        .addGap(72, 72, 72)
                        .addComponent(jButton4)
                        .addGap(79, 79, 79)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(292, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File selectedImageFile = browseImageFile.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();
            
            ImageIcon ii = new ImageIcon(selectedImagePath);
            Image image= ii.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
            jLabel1.setIcon(new ImageIcon(image));
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{
            System.out.println(selectedImagePath);		
            Registry myreg;				
            myreg = LocateRegistry.getRegistry("localhost", 2001);
            FilterInterface inter = (FilterInterface)myreg.lookup("remoteObject");
            String clientpath = selectedImagePath;
            String serverpath = "./Sepia.jpg";
            File clientpathfile = new File(clientpath);
            byte [] mydata=new byte[(int) clientpathfile.length()];
            FileInputStream in=new FileInputStream(clientpathfile);	
            System.out.println("uploading to server...");		
            in.read(mydata, 0, mydata.length);					 
            inter.uploadFileToServer(mydata, serverpath, (int) clientpathfile.length());
				 
            in.close();

            inter.Sepia(serverpath,serverpath);

            byte [] mydata2 = inter.downloadFileFromServer(serverpath);
            System.out.println("downloading...");
            File clientpathfile2 = new File(serverpath);
            FileOutputStream out=new FileOutputStream(clientpathfile2);				
            out.write(mydata2);
            out.flush();
            out.close();
            ImageIcon ii = new ImageIcon(serverpath);
            Image image= ii.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
            jLabel1.setIcon(new ImageIcon(image));

        } catch (Exception ex) {
            Logger.getLogger(Filter_Form.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try {
            System.out.println(selectedImagePath);		
            Registry myreg;				
            myreg = LocateRegistry.getRegistry("localhost", 2001);
            FilterInterface inter = (FilterInterface)myreg.lookup("remoteObject");
            String clientpath = selectedImagePath;
            String serverpath = "./grayscale.jpg";
            File clientpathfile = new File(clientpath);
            byte [] mydata=new byte[(int) clientpathfile.length()];
            FileInputStream in=new FileInputStream(clientpathfile);	
            System.out.println("uploading to server...");		
            in.read(mydata, 0, mydata.length);					 
            inter.uploadFileToServer(mydata, serverpath, (int) clientpathfile.length());
				 
            in.close();

            inter.Grayscale(serverpath,serverpath);

            byte [] mydata2 = inter.downloadFileFromServer(serverpath);
            System.out.println("downloading...");
            File clientpathfile2 = new File(serverpath);
            FileOutputStream out=new FileOutputStream(clientpathfile2);				
            out.write(mydata2);
            out.flush();
            out.close();
            ImageIcon ii = new ImageIcon(serverpath);
            Image image= ii.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
            jLabel1.setIcon(new ImageIcon(image));

        } catch (Exception ex) {
            Logger.getLogger(Filter_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
	        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 try {
            System.out.println(selectedImagePath);		
            Registry myreg;				
            myreg = LocateRegistry.getRegistry("localhost", 2001);
            FilterInterface inter = (FilterInterface)myreg.lookup("remoteObject");
            String clientpath = selectedImagePath;
            String serverpath = "./negative.jpg";
            File clientpathfile = new File(clientpath);
            byte [] mydata=new byte[(int) clientpathfile.length()];
            FileInputStream in=new FileInputStream(clientpathfile);	
            System.out.println("uploading to server...");		
            in.read(mydata, 0, mydata.length);					 
            inter.uploadFileToServer(mydata, serverpath, (int) clientpathfile.length());
				 
            in.close();

            inter.Negative(serverpath,serverpath);

            byte [] mydata2 = inter.downloadFileFromServer(serverpath);
            System.out.println("downloading...");
            File clientpathfile2 = new File(serverpath);
            FileOutputStream out=new FileOutputStream(clientpathfile2);				
            out.write(mydata2);
            out.flush();
            out.close();
            ImageIcon ii = new ImageIcon(serverpath);
            Image image= ii.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
            jLabel1.setIcon(new ImageIcon(image));

        } catch (Exception ex) {
            Logger.getLogger(Filter_Form.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
