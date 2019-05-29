
package tableexample;

import javax.swing.*;
import javax.swing.table.*;

public class UI extends javax.swing.JFrame {

    String name, gender, occupation;
    Integer age, rowCounter=0;
    DefaultTableModel table;
    
    public UI() {
        initComponents();
        maleRB.setActionCommand("Male");
        femaleRB.setActionCommand("Female");
        otherRB.setActionCommand("Other");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGRP = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTable = new javax.swing.JTable();
        ageINP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameINP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        femaleRB = new javax.swing.JRadioButton();
        otherRB = new javax.swing.JRadioButton();
        maleRB = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        ocupationDRPD = new javax.swing.JComboBox<>();
        Insert = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 750));
        setMinimumSize(new java.awt.Dimension(600, 750));
        setPreferredSize(new java.awt.Dimension(600, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 750));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Table Example");

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setEnabled(false);

        contentTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        contentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial:", "Name:", "Age:", "Gender:", "Occupation:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        contentTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contentTable.setRowHeight(24);
        contentTable.setRowMargin(6);
        contentTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        contentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contentTable);

        ageINP.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ageINP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Age:");

        nameINP.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nameINP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Gender:");

        btnGRP.add(femaleRB);
        femaleRB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        femaleRB.setText("Female");

        btnGRP.add(otherRB);
        otherRB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        otherRB.setText("Other");

        btnGRP.add(maleRB);
        maleRB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        maleRB.setText("Male");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Occupation:");

        ocupationDRPD.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ocupationDRPD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "          ", "Student", "Teacher", "Doctor", "Engineer", "Lawyer", "Business" }));
        ocupationDRPD.setBorder(null);

        Insert.setBackground(new java.awt.Color(153, 153, 153));
        Insert.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Insert.setForeground(new java.awt.Color(255, 255, 255));
        Insert.setText("Insert");
        Insert.setBorder(null);
        Insert.setBorderPainted(false);
        Insert.setFocusPainted(false);
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(153, 153, 153));
        Update.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.setBorder(null);
        Update.setBorderPainted(false);
        Update.setFocusPainted(false);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(153, 153, 153));
        Delete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.setBorder(null);
        Delete.setBorderPainted(false);
        Delete.setFocusPainted(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maleRB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(femaleRB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(otherRB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameINP)
                    .addComponent(ageINP)
                    .addComponent(ocupationDRPD, 0, 402, Short.MAX_VALUE))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameINP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageINP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(femaleRB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherRB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleRB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocupationDRPD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        try{
            rowCounter++;
            name = nameINP.getText();
            age = Integer.parseInt(ageINP.getText());
            occupation = ocupationDRPD.getItemAt(ocupationDRPD.getSelectedIndex()).toString();
            gender = btnGRP.getSelection().getActionCommand();
            table = (DefaultTableModel) contentTable.getModel();
            table.addRow(new Object[]{rowCounter, name, age, gender, occupation});
            nameINP.setText("");
            ageINP.setText("");
            btnGRP.clearSelection();
            ocupationDRPD.setSelectedIndex(0);
        }
        catch(Exception e){
            rowCounter--;
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }//GEN-LAST:event_InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
            table = (DefaultTableModel) contentTable.getModel();
            table.removeRow(contentTable.getSelectedRow());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try{
            name = nameINP.getText();
            age = Integer.parseInt(ageINP.getText());
            occupation = ocupationDRPD.getItemAt(ocupationDRPD.getSelectedIndex()).toString();
            gender = btnGRP.getSelection().getActionCommand();
            table = (DefaultTableModel) contentTable.getModel();
            table.setValueAt(name, contentTable.getSelectedRow(), 1);
            table.setValueAt(age, contentTable.getSelectedRow(), 2);
            table.setValueAt(gender, contentTable.getSelectedRow(), 3);
            table.setValueAt(occupation, contentTable.getSelectedRow(), 4);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void contentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentTableMouseClicked
       table = (DefaultTableModel) contentTable.getModel();
       name = table.getValueAt(contentTable.getSelectedRow(), 1).toString();
       age = Integer.parseInt(table.getValueAt(contentTable.getSelectedRow(), 2).toString());
       occupation = table.getValueAt(contentTable.getSelectedRow(), 4).toString();
       
       nameINP.setText(name);
       ageINP.setText(age.toString());
       ocupationDRPD.setSelectedItem(occupation);
    }//GEN-LAST:event_contentTableMouseClicked

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Update;
    private javax.swing.JTextField ageINP;
    private javax.swing.ButtonGroup btnGRP;
    private javax.swing.JTable contentTable;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton maleRB;
    private javax.swing.JTextField nameINP;
    private javax.swing.JComboBox<String> ocupationDRPD;
    private javax.swing.JRadioButton otherRB;
    // End of variables declaration//GEN-END:variables
}
