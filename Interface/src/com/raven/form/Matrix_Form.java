package com.raven.form;

import com.raven.server.IMatrixOperation;
import com.raven.server.TaskScheduler;

import com.raven.component.Form;
import com.raven.event.EventColorChange;
import com.raven.form.*;
import com.raven.theme.ThemeColorChange;
import java.awt.Color;
import java.rmi.Naming;
import java.util.Arrays;
public class Matrix_Form extends Form {

    public Matrix_Form() {
        initComponents();
        
        ThemeColorChange.getInstance().addEventColorChange(new EventColorChange() {
            @Override
            public void colorChange(Color color) {
                jButton1.setBackground(color);
            }
        });
        
           if (ThemeColorChange.getInstance().getMode() == ThemeColorChange.Mode.LIGHT) {
            M42.setForeground(new Color(127,127,127));
            M43.setForeground(new Color(127,127,127));
            M44.setForeground(new Color(127,127,127));
            M45.setForeground(new Color(127,127,127));
            M46.setForeground(new Color(127,127,127));
            M47.setForeground(new Color(127,127,127));
            M48.setForeground(new Color(127,127,127));
            M49.setForeground(new Color(127,127,127));
            M50.setForeground(new Color(127,127,127));
        }
           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        M11 = new javax.swing.JTextField();
        M12 = new javax.swing.JTextField();
        M13 = new javax.swing.JTextField();
        M16 = new javax.swing.JTextField();
        M15 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        M20 = new javax.swing.JTextField();
        M30 = new javax.swing.JTextField();
        M31 = new javax.swing.JTextField();
        M32 = new javax.swing.JTextField();
        M33 = new javax.swing.JTextField();
        M34 = new javax.swing.JTextField();
        M35 = new javax.swing.JTextField();
        M37 = new javax.swing.JTextField();
        M36 = new javax.swing.JTextField();
        M38 = new javax.swing.JTextField();
        M39 = new javax.swing.JTextField();
        M40 = new javax.swing.JTextField();
        M41 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        M42 = new javax.swing.JLabel();
        M43 = new javax.swing.JLabel();
        M44 = new javax.swing.JLabel();
        M45 = new javax.swing.JLabel();
        M46 = new javax.swing.JLabel();
        M47 = new javax.swing.JLabel();
        M48 = new javax.swing.JLabel();
        M49 = new javax.swing.JLabel();
        M50 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton = new javax.swing.JButton();

        jButton1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(128, 41, 238));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Matrix 1");

        M11.setBackground(new java.awt.Color(0, 0, 0));
        M11.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M11.setForeground(new java.awt.Color(255, 255, 255));
        M11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M11ActionPerformed(evt);
            }
        });

        M12.setBackground(new java.awt.Color(0, 0, 0));
        M12.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M12.setForeground(new java.awt.Color(255, 255, 255));

        M13.setBackground(new java.awt.Color(0, 0, 0));
        M13.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M13.setForeground(new java.awt.Color(255, 255, 255));
        M13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M13ActionPerformed(evt);
            }
        });

        M16.setBackground(new java.awt.Color(0, 0, 0));
        M16.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M16.setForeground(new java.awt.Color(255, 255, 255));

        M15.setBackground(new java.awt.Color(0, 0, 0));
        M15.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M15.setForeground(new java.awt.Color(255, 255, 255));
        M15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M15ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(128, 41, 238));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Result");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 0, 242));
        jLabel6.setText("Addition && Multiplication Of Two Matrix");

        M20.setBackground(new java.awt.Color(0, 0, 0));
        M20.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M20.setForeground(new java.awt.Color(255, 255, 255));
        M20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M20ActionPerformed(evt);
            }
        });

        M30.setBackground(new java.awt.Color(0, 0, 0));
        M30.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M30.setForeground(new java.awt.Color(255, 255, 255));

        M31.setBackground(new java.awt.Color(0, 0, 0));
        M31.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M31.setForeground(new java.awt.Color(255, 255, 255));

        M32.setBackground(new java.awt.Color(0, 0, 0));
        M32.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M32.setForeground(new java.awt.Color(255, 255, 255));

        M33.setBackground(new java.awt.Color(0, 0, 0));
        M33.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M33.setForeground(new java.awt.Color(255, 255, 255));

        M34.setBackground(new java.awt.Color(0, 0, 0));
        M34.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M34.setForeground(new java.awt.Color(255, 255, 255));

        M35.setBackground(new java.awt.Color(0, 0, 0));
        M35.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M35.setForeground(new java.awt.Color(255, 255, 255));

        M37.setBackground(new java.awt.Color(0, 0, 0));
        M37.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M37.setForeground(new java.awt.Color(255, 255, 255));

        M36.setBackground(new java.awt.Color(0, 0, 0));
        M36.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M36.setForeground(new java.awt.Color(255, 255, 255));

        M38.setBackground(new java.awt.Color(0, 0, 0));
        M38.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M38.setForeground(new java.awt.Color(255, 255, 255));

        M39.setBackground(new java.awt.Color(0, 0, 0));
        M39.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M39.setForeground(new java.awt.Color(255, 255, 255));

        M40.setBackground(new java.awt.Color(0, 0, 0));
        M40.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M40.setForeground(new java.awt.Color(255, 255, 255));

        M41.setBackground(new java.awt.Color(0, 0, 0));
        M41.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        M41.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jButton2.setText("Multiplication");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        M42.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        M42.setForeground(new java.awt.Color(255, 255, 255));

        M43.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        M43.setForeground(new java.awt.Color(255, 255, 255));

        M44.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        M44.setForeground(new java.awt.Color(255, 255, 255));

        M45.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        M45.setForeground(new java.awt.Color(255, 255, 255));

        M46.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        M46.setForeground(new java.awt.Color(255, 255, 255));

        M47.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        M47.setForeground(new java.awt.Color(255, 255, 255));

        M48.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        M48.setForeground(new java.awt.Color(255, 255, 255));

        M49.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        M49.setForeground(new java.awt.Color(255, 255, 255));

        M50.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        M50.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(128, 41, 238));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Matrix 2");

        jButton.setBackground(new java.awt.Color(0, 153, 255));
        jButton.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jButton.setText("Addition");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(M11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(M12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(M13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(M16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(M32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(M30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(M31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(M15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(M20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(M39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(M40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(M41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(M33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(M34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(M35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(M36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(M37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(M38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(M46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(M47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(M48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton2)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(245, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(M30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(M31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(M50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(M45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(M48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(M49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(M44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(M47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(M42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(M43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(M46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(144, 144, 144)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void M11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jButton1ActionPerformed

    private void M13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M13ActionPerformed

    private void M15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M15ActionPerformed

    private void M20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M20ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
             try{
                 
       
        TaskScheduler taskScheduler = (TaskScheduler)Naming.lookup("rmi://localhost:2001/TaskScheduler1");
        
        
        IMatrixOperation mo = (IMatrixOperation)Naming.lookup("rmi://localhost:2001/TaskScheduler2");
        
        float M1[][]=new float[3][3];
        float M2[][]=new float[3][3];
        float M3[][]=new float[3][3];
        
        
     M1[0][0] = Float.parseFloat(M11.getText());
        M1[0][1] = Float.parseFloat(M12.getText());
        M1[0][2] = Float.parseFloat(M13.getText());
        M1[1][0] = Float.parseFloat(M16.getText());
        M1[1][1] = Float.parseFloat(M15.getText());
        M1[1][2] = Float.parseFloat(M20.getText());
        M1[2][0] = Float.parseFloat(M32.getText());
        M1[2][1] = Float.parseFloat(M30.getText());
        M1[2][2] = Float.parseFloat(M31.getText());

        M2[0][0] = Float.parseFloat(M33.getText());
        M2[0][1] = Float.parseFloat(M34.getText());
        M2[0][2] = Float.parseFloat(M35.getText());
        M2[1][0] = Float.parseFloat(M36.getText());
        M2[1][1] = Float.parseFloat(M37.getText());
        M2[1][2] = Float.parseFloat(M38.getText());
        M2[2][0] = Float.parseFloat(M39.getText());
        M2[2][1] = Float.parseFloat(M40.getText());
        M2[2][2] = Float.parseFloat(M41.getText());
        
       
        
        
        IMatrixOperation mo1=mo.MatrixOperationS(M1,M2);
        taskScheduler.submitTask(mo);
        mo1.executeMul();
        M3=(float[][]) taskScheduler.getResult(mo1);
         M42.setText(M3[0][0]+"");
            M49.setText(M3[0][1]+"");
            M50.setText(M3[0][2]+"");
            M43.setText(M3[1][0]+"");
            M44.setText(M3[1][1]+"");
            M45.setText(M3[1][2]+"");
            M46.setText(M3[2][0]+"");
            M47.setText(M3[2][1]+"");
            M48.setText(M3[2][2]+"");
        
        }catch(Exception e){
            System.err.println("Error"+e);
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
         try{
  
        TaskScheduler taskScheduler = (TaskScheduler)Naming.lookup("rmi://localhost:2001/TaskScheduler1");
        
        
        IMatrixOperation mo = (IMatrixOperation)Naming.lookup("rmi://localhost:2001/TaskScheduler2");
        
        float M1[][]=new float[3][3];
        float M2[][]=new float[3][3];
        float M3[][]=new float[3][3];
        
        
        M1[0][0] = Float.parseFloat(M11.getText());
        M1[0][1] = Float.parseFloat(M12.getText());
        M1[0][2] = Float.parseFloat(M13.getText());
        M1[1][0] = Float.parseFloat(M16.getText());
        M1[1][1] = Float.parseFloat(M15.getText());
        M1[1][2] = Float.parseFloat(M20.getText());
        M1[2][0] = Float.parseFloat(M32.getText());
        M1[2][1] = Float.parseFloat(M30.getText());
        M1[2][2] = Float.parseFloat(M31.getText());

        M2[0][0] = Float.parseFloat(M33.getText());
        M2[0][1] = Float.parseFloat(M34.getText());
        M2[0][2] = Float.parseFloat(M35.getText());
        M2[1][0] = Float.parseFloat(M36.getText());
        M2[1][1] = Float.parseFloat(M37.getText());
        M2[1][2] = Float.parseFloat(M38.getText());
        M2[2][0] = Float.parseFloat(M39.getText());
        M2[2][1] = Float.parseFloat(M40.getText());
        M2[2][2] = Float.parseFloat(M41.getText());
        
       
        
        
        IMatrixOperation mo1=mo.MatrixOperationS(M1,M2);
        taskScheduler.submitTask(mo);
        mo1.executeaddM();
        M3=(float[][]) taskScheduler.getResult(mo1);
            M42.setText(M3[0][0]+"");
            M49.setText(M3[0][1]+"");
            M50.setText(M3[0][2]+"");
            M43.setText(M3[1][0]+"");
            M44.setText(M3[1][1]+"");
            M45.setText(M3[1][2]+"");
            M46.setText(M3[2][0]+"");
            M47.setText(M3[2][1]+"");
            M48.setText(M3[2][2]+"");
        
        }catch(Exception e){
            System.err.println("Error"+e);
        }    
                // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField M11;
    private javax.swing.JTextField M12;
    private javax.swing.JTextField M13;
    private javax.swing.JTextField M15;
    private javax.swing.JTextField M16;
    private javax.swing.JTextField M20;
    private javax.swing.JTextField M30;
    private javax.swing.JTextField M31;
    private javax.swing.JTextField M32;
    private javax.swing.JTextField M33;
    private javax.swing.JTextField M34;
    private javax.swing.JTextField M35;
    private javax.swing.JTextField M36;
    private javax.swing.JTextField M37;
    private javax.swing.JTextField M38;
    private javax.swing.JTextField M39;
    private javax.swing.JTextField M40;
    private javax.swing.JTextField M41;
    private javax.swing.JLabel M42;
    private javax.swing.JLabel M43;
    private javax.swing.JLabel M44;
    private javax.swing.JLabel M45;
    private javax.swing.JLabel M46;
    private javax.swing.JLabel M47;
    private javax.swing.JLabel M48;
    private javax.swing.JLabel M49;
    private javax.swing.JLabel M50;
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
