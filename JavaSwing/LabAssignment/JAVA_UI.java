/*
Code By: Saleh Ibne Omar
ID: 2017000000040
Course code: CSE2016
Section: 03
Course Teacher Initial: SASK
*/
package salehibneomar_3_040;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class JAVA_UI extends javax.swing.JFrame {

    private Integer n1, n2, turn=1, c1=0, c2=0, winnerChances;
    private boolean p1Over=false, p2Over=false;
    private String winnerName;
    
    private ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
    
    public JAVA_UI() {
        initComponents();
        Player2Input.setEditable(false);
        Player2Submit.setEnabled(false);
        mainInput.setEditable(false);
        guessBtn.setEnabled(false);
        winnerNameInput.setVisible(false);
        nameBtn.setVisible(false);
        Player1Submit.setBorderPainted(false);
        Player2Submit.setBorderPainted(false);
        guessBtn.setBorderPainted(false);
        nameBtn.setBorderPainted(false);
        recordsBtn.setBorderPainted(false);
        this.setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Player1Label = new javax.swing.JLabel();
        Player1Input = new javax.swing.JTextField();
        Player2Label = new javax.swing.JLabel();
        Player2Input = new javax.swing.JTextField();
        Player1Submit = new javax.swing.JButton();
        Player2Submit = new javax.swing.JButton();
        mainInput = new javax.swing.JTextField();
        msgLabel = new javax.swing.JLabel();
        nameBtn = new javax.swing.JButton();
        winnerNameInput = new javax.swing.JTextField();
        guessBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        recordsBtn = new javax.swing.JButton();
        playerRecord = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Window");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(800, 200));
        setSize(new java.awt.Dimension(500, 600));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID:2017000000040");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Both Player-1 and 2 are requested to enter numbers between 0-40");

        Player1Label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Player1Label.setForeground(new java.awt.Color(51, 51, 51));
        Player1Label.setText("Player-1 Enter:");

        Player1Input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Player1Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Player1Input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(206, 214, 224), 4));

        Player2Label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Player2Label.setForeground(new java.awt.Color(51, 51, 51));
        Player2Label.setText("Player-2 Enter:");

        Player2Input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Player2Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Player2Input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(206, 214, 224), 4));

        Player1Submit.setBackground(new java.awt.Color(116, 125, 140));
        Player1Submit.setForeground(new java.awt.Color(255, 255, 255));
        Player1Submit.setText("Submit");
        Player1Submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Player1Submit.setFocusPainted(false);
        Player1Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player1SubmitActionPerformed(evt);
            }
        });

        Player2Submit.setBackground(new java.awt.Color(116, 125, 140));
        Player2Submit.setForeground(new java.awt.Color(255, 255, 255));
        Player2Submit.setText("Submit");
        Player2Submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Player2Submit.setFocusPainted(false);
        Player2Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player2SubmitActionPerformed(evt);
            }
        });

        mainInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mainInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(206, 214, 224), 4));

        msgLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        msgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msgLabel.setText("Player-1 Turn");

        nameBtn.setBackground(new java.awt.Color(116, 125, 140));
        nameBtn.setForeground(new java.awt.Color(255, 255, 255));
        nameBtn.setText("Submit");
        nameBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameBtn.setFocusPainted(false);
        nameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBtnActionPerformed(evt);
            }
        });

        winnerNameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        winnerNameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(206, 214, 224), 4));

        guessBtn.setBackground(new java.awt.Color(116, 125, 140));
        guessBtn.setForeground(new java.awt.Color(255, 255, 255));
        guessBtn.setText("Guess");
        guessBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guessBtn.setFocusPainted(false);
        guessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Click the following button to see previous winners name");

        recordsBtn.setBackground(new java.awt.Color(116, 125, 140));
        recordsBtn.setForeground(new java.awt.Color(255, 255, 255));
        recordsBtn.setText("Click Here");
        recordsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recordsBtn.setFocusPainted(false);
        recordsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordsBtnActionPerformed(evt);
            }
        });

        playerRecord.setEditable(false);
        playerRecord.setBackground(new java.awt.Color(73, 182, 182));
        playerRecord.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerRecord.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerRecord.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(recordsBtn)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Player1Label)
                                    .addComponent(Player1Input, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Player2Input, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Player2Label)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Player1Submit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Player2Submit))
                            .addComponent(msgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mainInput)
                            .addComponent(winnerNameInput, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(playerRecord)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player1Label)
                    .addComponent(Player2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player1Input, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player2Input, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player1Submit)
                    .addComponent(Player2Submit))
                .addGap(27, 27, 27)
                .addComponent(msgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainInput, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(winnerNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(recordsBtn))
                .addGap(18, 18, 18)
                .addComponent(playerRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBtnActionPerformed
           winnerName = winnerNameInput.getText();
           winnerNameInput.setText("");
           winnerNameInput.setEditable(false);
           nameBtn.setEnabled(false);
           
           try{
               FileWriter fl = new FileWriter("records.txt", true);
               fl.write(winnerName+"    "+winnerChances.toString());
               fl.write(System.lineSeparator());
               fl.close();
               JOptionPane.showMessageDialog(this, "Name inserted successfully!");
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(this, "Error!");
           }
    }//GEN-LAST:event_nameBtnActionPerformed

    private void Player1SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1SubmitActionPerformed
        
        int n = Integer.parseInt(Player1Input.getText(), 10);
        if(n>40 || n<0){
            Player1Label.setText("Player-1 Enter again:");
            Player1Label.setForeground(Color.red);
        }
        else{
            n1=n;
            Player1Input.setText("");
            Player1Input.setEditable(false);
            Player1Submit.setEnabled(false);
            Player2Input.setEditable(true);
            Player2Submit.setEnabled(true);
        }
    }//GEN-LAST:event_Player1SubmitActionPerformed

    private void Player2SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player2SubmitActionPerformed

        int n = Integer.parseInt(Player2Input.getText(), 10);
        if(n>40 || n<0){
            Player2Label.setText("Player-2 Enter again:");
            Player2Label.setForeground(Color.red);
        }
        else{
            n2=n;
            Player2Input.setText("");
            Player2Input.setEditable(false);
            Player2Submit.setEnabled(false);
            mainInput.setEditable(true);
            guessBtn.setEnabled(true);
        }
    }//GEN-LAST:event_Player2SubmitActionPerformed

    private void guessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessBtnActionPerformed
            if(p1Over!=true && turn==1){
               c1++;
               int n = Integer.parseInt(mainInput.getText(), 10);
               if(n==n2){
                   msgLabel.setText("Player-2 only you have to guess now.");
                   mainInput.setText(""); 
                   p1Over=true;
                   turn=2;
               }
               else if(p2Over!=true){
                   turn=2;
                   msgLabel.setText("Player-2 Turn");
                   mainInput.setText(""); 
               }
               else{
                   mainInput.setText(""); 
               }
           }
           else{
               if(p2Over!=true && turn==2){
                   c2++;
                   int n = Integer.parseInt(mainInput.getText(), 10);
                   if(n==n1){
                       msgLabel.setText("Player-1 only you have to guess now.");
                       mainInput.setText(""); 
                       p2Over=true;
                       turn=1;
                   }
                   else if(p1Over!=true){
                       turn=1;
                       msgLabel.setText("Player-1 Turn");
                       mainInput.setText("");
                   }
                   else{
                       mainInput.setText("");
                   }
               }  
           }
            
        if(p1Over==true && p2Over==true){
                if(c1<c2){
                    winnerChances=c1;
                    msgLabel.setText("Game Over! Player-1 enter your name as winner.");
                    mainInput.setText("");
                    mainInput.setVisible(false);
                    guessBtn.setVisible(false);
                    winnerNameInput.setVisible(true);
                    nameBtn.setVisible(true);
                }
                else if(c1>c2){
                    winnerChances=c2;
                    msgLabel.setText("Game Over! Player-2 enter your name as winner.");
                    mainInput.setText(""); 
                    mainInput.setVisible(false);
                    guessBtn.setVisible(false);
                    winnerNameInput.setVisible(true);
                    nameBtn.setVisible(true);
                }
                else if(c1==c2){
                    mainInput.setText("");
                    msgLabel.setText("Match Draw!");
                    mainInput.setEditable(false);
                    guessBtn.setEnabled(false);
                }
            }
    }//GEN-LAST:event_guessBtnActionPerformed

    private void recordsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordsBtnActionPerformed
        try{
            FileReader fl = new FileReader("records.txt");
            Scanner fetch = new Scanner(fl);
            while(fetch.hasNext()){
                playerRecord.setText("Previous winner: "+fetch.next()+",  Chances: "+fetch.next());
            }
            fl.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }//GEN-LAST:event_recordsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(JAVA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAVA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAVA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAVA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JAVA_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Player1Input;
    private javax.swing.JLabel Player1Label;
    private javax.swing.JButton Player1Submit;
    private javax.swing.JTextField Player2Input;
    private javax.swing.JLabel Player2Label;
    private javax.swing.JButton Player2Submit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton guessBtn;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mainInput;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JButton nameBtn;
    private javax.swing.JTextField playerRecord;
    private javax.swing.JButton recordsBtn;
    private javax.swing.JTextField winnerNameInput;
    // End of variables declaration//GEN-END:variables
}
