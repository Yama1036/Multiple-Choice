/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayyam8774
 */
public class FrmMultiple extends javax.swing.JFrame {

    /**
     * Creates new form FrmMultiple
     */
    public FrmMultiple() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblInstruction = new javax.swing.JLabel();
        lblQuestion1 = new javax.swing.JLabel();
        lblQuestion2 = new javax.swing.JLabel();
        lblChoice2A = new javax.swing.JLabel();
        lblChoice2B = new javax.swing.JLabel();
        lblChoice2C = new javax.swing.JLabel();
        lblChoice2D = new javax.swing.JLabel();
        lblQuestion3 = new javax.swing.JLabel();
        lblChoice3A = new javax.swing.JLabel();
        lblChoice3B = new javax.swing.JLabel();
        lblChoice3C = new javax.swing.JLabel();
        lblChoice3D = new javax.swing.JLabel();
        lblQuestion4 = new javax.swing.JLabel();
        lblChoice4A = new javax.swing.JLabel();
        lblChoice4B = new javax.swing.JLabel();
        lblChoice4C = new javax.swing.JLabel();
        lblChoice4D = new javax.swing.JLabel();
        lblQuestion5 = new javax.swing.JLabel();
        lblChoice5A = new javax.swing.JLabel();
        lblChoice5B = new javax.swing.JLabel();
        lblChoice5C = new javax.swing.JLabel();
        lblChoice5D = new javax.swing.JLabel();
        lblChoice1A = new javax.swing.JLabel();
        lblChoice1B = new javax.swing.JLabel();
        lblChoice1C = new javax.swing.JLabel();
        lblChoice1D = new javax.swing.JLabel();
        txtAnswer1 = new javax.swing.JTextField();
        txtAnswer4 = new javax.swing.JTextField();
        txtAnswer2 = new javax.swing.JTextField();
        txtAnswer3 = new javax.swing.JTextField();
        txtAnswer5 = new javax.swing.JTextField();
        lblMark1 = new javax.swing.JLabel();
        lblMark2 = new javax.swing.JLabel();
        lblMark3 = new javax.swing.JLabel();
        lblMark4 = new javax.swing.JLabel();
        lblMark5 = new javax.swing.JLabel();
        btnFinish = new javax.swing.JButton();
        lblCorrect = new javax.swing.JLabel();
        lblIncorrect = new javax.swing.JLabel();
        lblPercentage = new javax.swing.JLabel();
        lblThank = new javax.swing.JLabel();
        lblCorrectUser = new javax.swing.JLabel();
        lblIncorrectUser = new javax.swing.JLabel();
        lblPercentageUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("Alt codes Quiz ");

        lblInstruction.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        lblInstruction.setText("Check your understanding about ALT.");

        lblQuestion1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblQuestion1.setText("Question 1 : What if you press the [ Alt + 26 ]");

        lblQuestion2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblQuestion2.setText("Question 2 : What if you press the [ Alt + 3 ]");

        lblChoice2A.setText("1. ♦");

        lblChoice2B.setText("2. ♥");

        lblChoice2C.setText("3. ♣");

        lblChoice2D.setText("4. ♠");

        lblQuestion3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblQuestion3.setText("Question 3 : What if you press the [ Alt + 1 ]");

        lblChoice3A.setText("1. ☺");

        lblChoice3B.setText("2. ☻");

        lblChoice3C.setText("3. ☼");

        lblChoice3D.setText("4. ►");

        lblQuestion4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblQuestion4.setText("Question 4 : What if you press the [ Alt + 16 ]");

        lblChoice4A.setText("1. ▲");

        lblChoice4B.setText("2. ▼");

        lblChoice4C.setText("3. ►");

        lblChoice4D.setText("4. ◄");

        lblQuestion5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblQuestion5.setText("Question 5 : What if you press the [ Alt + 14 ]");

        lblChoice5A.setText("1. ♪");

        lblChoice5B.setText("2. •");

        lblChoice5C.setText("3. ◘");

        lblChoice5D.setText("4. ♫");

        lblChoice1A.setText("1. ☺");

        lblChoice1B.setText("2. ☻");

        lblChoice1C.setText("3. →");

        lblChoice1D.setText("4. ↓");

        txtAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer2ActionPerformed(evt);
            }
        });

        txtAnswer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer3ActionPerformed(evt);
            }
        });

        txtAnswer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer5ActionPerformed(evt);
            }
        });

        lblMark1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMark1.setForeground(java.awt.Color.red);

        lblMark2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMark2.setForeground(java.awt.Color.red);

        lblMark3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMark3.setForeground(java.awt.Color.red);

        lblMark4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMark4.setForeground(java.awt.Color.red);

        lblMark5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMark5.setForeground(java.awt.Color.red);

        btnFinish.setText("Finish!!");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        lblCorrect.setText("Correct :");

        lblIncorrect.setText("Incorrect :");

        lblPercentage.setText("Percentage :");

        lblThank.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        lblThank.setForeground(new java.awt.Color(255, 79, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblInstruction)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblChoice2A)
                                        .addComponent(lblChoice2B)
                                        .addComponent(lblChoice2C)
                                        .addComponent(lblChoice1A)
                                        .addComponent(lblChoice1B)
                                        .addComponent(lblChoice1C)
                                        .addComponent(lblQuestion3)
                                        .addComponent(lblQuestion2)
                                        .addComponent(lblQuestion1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblChoice1D)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblMark1)
                                    .addGap(56, 56, 56))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblChoice3D)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblMark3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblChoice2D)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblMark2)))
                                    .addGap(54, 54, 54)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblChoice3A)
                                    .addComponent(lblChoice3B)
                                    .addComponent(lblChoice3C))
                                .addGap(346, 346, 346)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblChoice4D)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAnswer4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMark4)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblChoice5D)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAnswer5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMark5)
                                .addGap(63, 63, 63))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblChoice5C)
                                        .addComponent(lblChoice5B)
                                        .addComponent(lblChoice5A)
                                        .addComponent(lblChoice4C)
                                        .addComponent(lblChoice4B)
                                        .addComponent(lblChoice4A)
                                        .addComponent(lblQuestion4)
                                        .addComponent(lblQuestion5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(btnFinish)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPercentage)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblPercentageUser))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblIncorrect)
                                                .addComponent(lblCorrect))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblCorrectUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblIncorrectUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(0, 62, Short.MAX_VALUE))
                            .addComponent(lblThank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuestion4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChoice4A)
                            .addComponent(lblChoice1A))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChoice4B)
                            .addComponent(lblChoice1B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChoice4C)
                            .addComponent(lblChoice1C))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChoice4D)
                            .addComponent(lblChoice1D)
                            .addComponent(txtAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnswer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMark1)
                            .addComponent(lblMark4))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuestion2)
                            .addComponent(lblQuestion5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChoice2A)
                            .addComponent(lblChoice5A))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChoice2B)
                            .addComponent(lblChoice5B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChoice2C)
                            .addComponent(lblChoice5C))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChoice2D)
                            .addComponent(lblChoice5D)
                            .addComponent(txtAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnswer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMark2)
                            .addComponent(lblMark5))
                        .addGap(18, 18, 18)
                        .addComponent(btnFinish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuestion3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCorrectUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCorrect)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblChoice3A)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblIncorrect)
                                .addComponent(lblIncorrectUser)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblChoice3C)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblChoice3D))
                                    .addComponent(lblChoice3B))
                                .addGap(0, 22, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPercentage)
                                    .addComponent(lblPercentageUser))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblThank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMark3)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswer2ActionPerformed

    private void txtAnswer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswer3ActionPerformed

    private void txtAnswer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswer5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswer5ActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // variable 
        int first = Integer.parseInt(txtAnswer1.getText());
        int second = Integer.parseInt(txtAnswer2.getText());
        int third = Integer.parseInt(txtAnswer3.getText());
        int four = Integer.parseInt(txtAnswer4.getText());
        int five = Integer.parseInt(txtAnswer5.getText());
        
        // Variable for calculate the total Correct/Incorrect Answer and Percentage.
        double firstAns; 
        double firstin;       
        double secondAns;
        double secondin;
        double thirdAns; 
        double thirdin;
        double forthAns; 
        double forthin;
        double fifthAns; 
        double fifthin;
        double correct;
        double incorrect;
        double percentage;
        double per;
        
        // Check what user put into Answer box and give the score. Also, comment "Correct!!!" or "Incorrect..."
        if (first == 3)
        {
            lblMark1.setText("Correct!!!");
            firstAns = 1;
            firstin = 0;
        }
        else 
        {
            lblMark1.setText("Incorrect...");
            firstAns = 0;
            firstin = 1;
        }
        
        
        if (second == 2)
        {
            lblMark2.setText("Correct!!!");
            secondAns = 1;
            secondin = 0;
        }
        else 
        {
            lblMark2.setText("Incorrect...");
            secondAns = 0;
            secondin = 1;
        }
        
        
        if (third == 1)
        {
            lblMark3.setText("Correct!!!");
            thirdAns = 1;
            thirdin = 0;
        }
        
        else 
        {
            lblMark3.setText("Incorrect...");
            thirdin = 1;
            thirdAns = 0;
        }
       
        
        if (four == 3)
        {
            lblMark4.setText("Correct!!!");
            forthAns = 1;
            forthin = 0;
        }
        
        else 
        {
            lblMark4.setText("Incorrect...");
            forthin = 1;
            forthAns = 0;
        }
        
        
        if (five == 4)
        {
            lblMark5.setText("Correct!!!");
            fifthAns = 1;
            fifthin = 0;
        }
        
        else
        {
            lblMark5.setText("Incorrect...");
            fifthin = 1;
            fifthAns = 0;
        }
        
        //Calculate the total Correct/Incorrect Answer
        correct = firstAns + secondAns + thirdAns + forthAns + fifthAns;
        lblCorrectUser.setText(String.valueOf(correct));
        
        incorrect = firstin + secondin + thirdin + forthin + fifthin;
        lblIncorrectUser.setText(String.valueOf(incorrect));
        
        //Calculate the percentage(%) by using the # of total Correct answers.
        percentage = (firstAns + secondAns + thirdAns + forthAns + fifthAns) / 5;
        per = percentage * 100; 
        lblPercentageUser.setText(""+per+" %");
        
        // Give the feedback that change by what Percentage does user get.
        if (per <= 20)
        {
            lblThank.setText("Try again!!");
        }
        
        else if (per == 40)
        {
            lblThank.setText("Nice Try!!");
        }
        
        else if (per == 60)
        {
            lblThank.setText("Good!!");
        }
        
        else if (per == 80)
        {
            lblThank.setText("Excellent");
        }
        
        else if (per == 100)
        {
            lblThank.setText("Perfect!!");
        }
            
            
            
            
            
        
        
    }//GEN-LAST:event_btnFinishActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMultiple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinish;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblChoice1A;
    private javax.swing.JLabel lblChoice1B;
    private javax.swing.JLabel lblChoice1C;
    private javax.swing.JLabel lblChoice1D;
    private javax.swing.JLabel lblChoice2A;
    private javax.swing.JLabel lblChoice2B;
    private javax.swing.JLabel lblChoice2C;
    private javax.swing.JLabel lblChoice2D;
    private javax.swing.JLabel lblChoice3A;
    private javax.swing.JLabel lblChoice3B;
    private javax.swing.JLabel lblChoice3C;
    private javax.swing.JLabel lblChoice3D;
    private javax.swing.JLabel lblChoice4A;
    private javax.swing.JLabel lblChoice4B;
    private javax.swing.JLabel lblChoice4C;
    private javax.swing.JLabel lblChoice4D;
    private javax.swing.JLabel lblChoice5A;
    private javax.swing.JLabel lblChoice5B;
    private javax.swing.JLabel lblChoice5C;
    private javax.swing.JLabel lblChoice5D;
    private javax.swing.JLabel lblCorrect;
    private javax.swing.JLabel lblCorrectUser;
    private javax.swing.JLabel lblIncorrect;
    private javax.swing.JLabel lblIncorrectUser;
    private javax.swing.JLabel lblInstruction;
    private javax.swing.JLabel lblMark1;
    private javax.swing.JLabel lblMark2;
    private javax.swing.JLabel lblMark3;
    private javax.swing.JLabel lblMark4;
    private javax.swing.JLabel lblMark5;
    private javax.swing.JLabel lblPercentage;
    private javax.swing.JLabel lblPercentageUser;
    private javax.swing.JLabel lblQuestion1;
    private javax.swing.JLabel lblQuestion2;
    private javax.swing.JLabel lblQuestion3;
    private javax.swing.JLabel lblQuestion4;
    private javax.swing.JLabel lblQuestion5;
    private javax.swing.JLabel lblThank;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAnswer1;
    private javax.swing.JTextField txtAnswer2;
    private javax.swing.JTextField txtAnswer3;
    private javax.swing.JTextField txtAnswer4;
    private javax.swing.JTextField txtAnswer5;
    // End of variables declaration//GEN-END:variables
}
