/**
 * @author Harivansh Thakur
 */
package com.library.aj_pract_1;


public class Calculator extends javax.swing.JFrame {
    
    
    private double firstNum;
    private double secondNum;
    private char op;
    private double result;
    
    public Calculator() {
        initComponents();
    }
    
    

    // Displaying the number on the label on every click
    private void handleClickNumber(javax.swing.JButton b) {
        String t = b.getText();
        String r = resultLabel.getText();
        resultLabel.setText(r + t);
    }

    // Save the firstNum and operator
    private void handleClickOperator(char c) {

        String num = resultLabel.getText();
        if (!num.equals("")) {
            firstNum = Double.parseDouble(num);
        }
        op = c;
        resultLabel.setText("");

    }
    // Save the Second number and calulate the result
    private void handleClickEqual() {
        String num = resultLabel.getText();
        secondNum = Double.parseDouble(num);

        switch (op) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            case '%':
                result = firstNum % secondNum;
                break;
            default:
                break;
        }
        resultLabel.setText(result + "");
    }

    // GUI implemented, IDLE Generated
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        resultLabel = new javax.swing.JTextArea();
        numBut1 = new javax.swing.JButton();
        numBut2 = new javax.swing.JButton();
        addBut = new javax.swing.JButton();
        numBut3 = new javax.swing.JButton();
        numBut4 = new javax.swing.JButton();
        numBut5 = new javax.swing.JButton();
        numBut6 = new javax.swing.JButton();
        mulBut = new javax.swing.JButton();
        numBut7 = new javax.swing.JButton();
        numBut8 = new javax.swing.JButton();
        numBut9 = new javax.swing.JButton();
        numBut0 = new javax.swing.JButton();
        eqlBut = new javax.swing.JButton();
        divBut = new javax.swing.JButton();
        subBut = new javax.swing.JButton();
        backBut = new javax.swing.JButton();
        clearBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultLabel.setEditable(false);
        resultLabel.setColumns(20);
        resultLabel.setRows(5);
        jScrollPane1.setViewportView(resultLabel);

        numBut1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numBut1.setText("1");
        numBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBut1ActionPerformed(evt);
            }
        });

        numBut2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numBut2.setText("2");
        numBut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBut2ActionPerformed(evt);
            }
        });

        addBut.setBackground(new java.awt.Color(0, 204, 255));
        addBut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addBut.setText("+");
        addBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButActionPerformed(evt);
            }
        });

        numBut3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numBut3.setText("3");
        numBut3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBut3ActionPerformed(evt);
            }
        });

        numBut4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numBut4.setText("4");
        numBut4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBut4ActionPerformed(evt);
            }
        });

        numBut5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numBut5.setText("5");
        numBut5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBut5ActionPerformed(evt);
            }
        });

        numBut6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numBut6.setText("6");
        numBut6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBut6ActionPerformed(evt);
            }
        });

        mulBut.setBackground(new java.awt.Color(0, 204, 255));
        mulBut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mulBut.setText("*");
        mulBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulButActionPerformed(evt);
            }
        });

        numBut7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numBut7.setText("7");
        numBut7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBut7ActionPerformed(evt);
            }
        });

        numBut8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numBut8.setText("8");
        numBut8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBut8ActionPerformed(evt);
            }
        });

        numBut9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numBut9.setText("9");
        numBut9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBut9ActionPerformed(evt);
            }
        });

        numBut0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numBut0.setText("0");
        numBut0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numBut0ActionPerformed(evt);
            }
        });

        eqlBut.setBackground(new java.awt.Color(255, 102, 102));
        eqlBut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eqlBut.setText("=");
        eqlBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqlButActionPerformed(evt);
            }
        });

        divBut.setBackground(new java.awt.Color(0, 204, 255));
        divBut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        divBut.setText("/");
        divBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButActionPerformed(evt);
            }
        });

        subBut.setBackground(new java.awt.Color(0, 204, 255));
        subBut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subBut.setText("-");
        subBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subButActionPerformed(evt);
            }
        });

        backBut.setBackground(new java.awt.Color(255, 102, 102));
        backBut.setText("Back space");
        backBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButActionPerformed(evt);
            }
        });

        clearBut.setText("Clear");
        clearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBut)
                        .addGap(158, 158, 158)
                        .addComponent(clearBut))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numBut4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(numBut5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(numBut6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mulBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(numBut2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(numBut3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(divBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(numBut7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numBut8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numBut9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numBut0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eqlBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numBut2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numBut3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numBut4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mulBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numBut6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numBut5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numBut7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numBut8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numBut9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numBut0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eqlBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBut)
                    .addComponent(clearBut))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }
    
    //Buttons implementation

    private void addButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButActionPerformed
        // TODO add your handling code here:
        handleClickOperator('+');
    }//GEN-LAST:event_addButActionPerformed

    private void numBut6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBut6ActionPerformed
        // TODO add your handling code here:
        handleClickNumber(numBut6);
    }//GEN-LAST:event_numBut6ActionPerformed

    private void subButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subButActionPerformed
        // TODO add your handling code here:
        handleClickOperator('-');
    }//GEN-LAST:event_subButActionPerformed

    private void numBut4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBut4ActionPerformed
        // TODO add your handling code here:
        handleClickNumber(numBut4);
    }//GEN-LAST:event_numBut4ActionPerformed

    private void numBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBut1ActionPerformed
        // TODO add your handling code here:
        handleClickNumber(numBut1);
    }//GEN-LAST:event_numBut1ActionPerformed

    private void numBut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBut2ActionPerformed
        // TODO add your handling code here:
        handleClickNumber(numBut2);
    }//GEN-LAST:event_numBut2ActionPerformed

    private void numBut3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBut3ActionPerformed
        // TODO add your handling code here:
        handleClickNumber(numBut3);
    }//GEN-LAST:event_numBut3ActionPerformed

    private void numBut5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBut5ActionPerformed
        // TODO add your handling code here:
        handleClickNumber(numBut5);
    }//GEN-LAST:event_numBut5ActionPerformed

    private void numBut7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBut7ActionPerformed
        // TODO add your handling code here:
        handleClickNumber(numBut7);
    }//GEN-LAST:event_numBut7ActionPerformed

    private void numBut8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBut8ActionPerformed
        // TODO add your handling code here:
        handleClickNumber(numBut8);
    }//GEN-LAST:event_numBut8ActionPerformed

    private void numBut9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBut9ActionPerformed
        // TODO add your handling code here:
        handleClickNumber(numBut9);
    }//GEN-LAST:event_numBut9ActionPerformed

    private void numBut0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numBut0ActionPerformed
        // TODO add your handling code here:
        handleClickNumber(numBut0);
    }//GEN-LAST:event_numBut0ActionPerformed

    private void mulButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulButActionPerformed
        // TODO add your handling code here:
        handleClickOperator('*');
    }//GEN-LAST:event_mulButActionPerformed

    private void divButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButActionPerformed
        // TODO add your handling code here:
        handleClickOperator('/');
    }//GEN-LAST:event_divButActionPerformed

    private void eqlButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqlButActionPerformed
        // TODO add your handling code here:
        handleClickEqual();
        firstNum = 0;
        secondNum = 0;
    }//GEN-LAST:event_eqlButActionPerformed

    private void backButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButActionPerformed
        // TODO add your handling code here:
        String r = resultLabel.getText();
        r = r.substring(0, r.length() - 1);
        resultLabel.setText(r);
    }//GEN-LAST:event_backButActionPerformed

    private void clearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButActionPerformed
        // TODO add your handling code here:
        firstNum = 0;
        secondNum = 0;
        result = 0;
        resultLabel.setText("");
    }//GEN-LAST:event_clearButActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBut;
    private javax.swing.JButton backBut;
    private javax.swing.JButton clearBut;
    private javax.swing.JButton divBut;
    private javax.swing.JButton eqlBut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mulBut;
    private javax.swing.JButton numBut0;
    private javax.swing.JButton numBut1;
    private javax.swing.JButton numBut2;
    private javax.swing.JButton numBut3;
    private javax.swing.JButton numBut4;
    private javax.swing.JButton numBut5;
    private javax.swing.JButton numBut6;
    private javax.swing.JButton numBut7;
    private javax.swing.JButton numBut8;
    private javax.swing.JButton numBut9;
    private javax.swing.JTextArea resultLabel;
    private javax.swing.JButton subBut;
    // End of variables declaration//GEN-END:variables
}
