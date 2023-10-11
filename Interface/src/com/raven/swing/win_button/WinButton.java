package com.raven.swing.win_button;

import com.raven.form.*;
import com.raven.main.*;

import com.raven.form.InternalChat;
import com.raven.swing.PanelBackground;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WinButton extends javax.swing.JPanel {

    public WinButton() {
        initComponents();
        setOpaque(false);
    }

    public void initEvent(JFrame fram, PanelBackground panel) {
        cmdClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             
                    
                     if(Main.f!=null){
                        InternalChat ch = Main.f.ch;
                    try {
                        if(Main.f.ch!=null){
                       ch.server.removeClient(ch.name);
                     }
                         System.exit(0);
                   
                    } catch (RemoteException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }catch(Exception e){
                    System.err.println("No chat initialized");
                    }
                    }
                
               
                
                if(Main.f == null){
                    System.exit(0);
                }
            }
        });
        cmdMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                fram.setState(JFrame.ICONIFIED);
            }
        });
        cmdRe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (fram.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                    panel.setRound(20);
                    fram.setExtendedState(JFrame.NORMAL);
                } else {
                    panel.setRound(0);
                    fram.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdClose = new com.raven.swing.win_button.Button();
        cmdMi = new com.raven.swing.win_button.Button();
        cmdRe = new com.raven.swing.win_button.Button();

        cmdClose.setBackground(new java.awt.Color(240, 61, 61));
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        cmdMi.setBackground(new java.awt.Color(227, 226, 68));
        cmdMi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMiActionPerformed(evt);
            }
        });

        cmdRe.setBackground(new java.awt.Color(67, 199, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdMiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdMiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.win_button.Button cmdClose;
    private com.raven.swing.win_button.Button cmdMi;
    private com.raven.swing.win_button.Button cmdRe;
    // End of variables declaration//GEN-END:variables
}
