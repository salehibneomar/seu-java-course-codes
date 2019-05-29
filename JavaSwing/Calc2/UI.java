
package calc;
import javax.swing.*;
import java.awt.*;
import static java.lang.Math.*;

public class UI extends javax.swing.JFrame {
    int limDot=0;
    Double n1=0.0, n2=0.0, result_value=0.0;
    String operator="", stringRes="";
    public UI() {
        initComponents();
    }
    
    void Operation(){
        n2=Double.parseDouble(Display.getText());
        switch(operator){
            case "+":
                result_value=n1+n2;
                stringRes=String.format("%.2f",result_value);
                Display.setText(stringRes);
                break;
            case "-":
                result_value=n1-n2;
                stringRes=String.format("%.2f",result_value);
                Display.setText(stringRes);
                break;
            case "*":
                result_value=n1*n2;
                stringRes=String.format("%.2f",result_value);
                Display.setText(stringRes);
                break;
            case "/":
                result_value=n1/n2;
                stringRes=String.format("%.2f",result_value);
                Display.setText(stringRes);
                break;
            case "%":
                result_value=n1%n2;
                stringRes=String.format("%.2f",result_value);
                Display.setText(stringRes);
                break;
                
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton13 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Display = new javax.swing.JTextField();
        pai = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        four = new javax.swing.JButton();
        six = new javax.swing.JButton();
        five = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        three = new javax.swing.JButton();
        one = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        division = new javax.swing.JButton();
        two = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        result = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        jButton13.setText("jButton1");
        jButton13.setMaximumSize(new java.awt.Dimension(100, 60));
        jButton13.setMinimumSize(new java.awt.Dimension(100, 60));
        jButton13.setPreferredSize(new java.awt.Dimension(100, 60));

        jButton18.setText("jButton1");
        jButton18.setMaximumSize(new java.awt.Dimension(206, 60));
        jButton18.setMinimumSize(new java.awt.Dimension(206, 60));
        jButton18.setPreferredSize(new java.awt.Dimension(206, 60));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator prac");
        setLocation(new java.awt.Point(500, 200));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JAVA CALCULATOR PRACTICE");

        Display.setEditable(false);
        Display.setBackground(new java.awt.Color(255, 255, 255));
        Display.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Display.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        pai.setText("π");
        pai.setMaximumSize(new java.awt.Dimension(100, 60));
        pai.setMinimumSize(new java.awt.Dimension(100, 60));
        pai.setPreferredSize(new java.awt.Dimension(100, 60));
        pai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paiActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minus.setText("-");
        minus.setMaximumSize(new java.awt.Dimension(206, 60));
        minus.setMinimumSize(new java.awt.Dimension(206, 60));
        minus.setPreferredSize(new java.awt.Dimension(206, 60));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        mod.setText("%");
        mod.setMaximumSize(new java.awt.Dimension(100, 60));
        mod.setMinimumSize(new java.awt.Dimension(100, 60));
        mod.setPreferredSize(new java.awt.Dimension(100, 60));
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        sqrt.setText("√");
        sqrt.setMaximumSize(new java.awt.Dimension(100, 60));
        sqrt.setMinimumSize(new java.awt.Dimension(100, 60));
        sqrt.setPreferredSize(new java.awt.Dimension(100, 60));
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        seven.setText("7");
        seven.setMaximumSize(new java.awt.Dimension(100, 60));
        seven.setMinimumSize(new java.awt.Dimension(100, 60));
        seven.setPreferredSize(new java.awt.Dimension(100, 60));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.setMaximumSize(new java.awt.Dimension(100, 60));
        eight.setMinimumSize(new java.awt.Dimension(100, 60));
        eight.setPreferredSize(new java.awt.Dimension(100, 60));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.setMaximumSize(new java.awt.Dimension(100, 60));
        nine.setMinimumSize(new java.awt.Dimension(100, 60));
        nine.setPreferredSize(new java.awt.Dimension(100, 60));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        four.setText("4");
        four.setMaximumSize(new java.awt.Dimension(100, 60));
        four.setMinimumSize(new java.awt.Dimension(100, 60));
        four.setPreferredSize(new java.awt.Dimension(100, 60));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        six.setText("6");
        six.setMaximumSize(new java.awt.Dimension(100, 60));
        six.setMinimumSize(new java.awt.Dimension(100, 60));
        six.setPreferredSize(new java.awt.Dimension(100, 60));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        five.setText("5");
        five.setMaximumSize(new java.awt.Dimension(100, 60));
        five.setMinimumSize(new java.awt.Dimension(100, 60));
        five.setPreferredSize(new java.awt.Dimension(100, 60));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        plus.setText("+");
        plus.setMaximumSize(new java.awt.Dimension(206, 60));
        plus.setMinimumSize(new java.awt.Dimension(206, 60));
        plus.setPreferredSize(new java.awt.Dimension(206, 60));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        multi.setText("X");
        multi.setMaximumSize(new java.awt.Dimension(206, 60));
        multi.setMinimumSize(new java.awt.Dimension(206, 60));
        multi.setPreferredSize(new java.awt.Dimension(206, 60));
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });

        three.setText("3");
        three.setMaximumSize(new java.awt.Dimension(100, 60));
        three.setMinimumSize(new java.awt.Dimension(100, 60));
        three.setPreferredSize(new java.awt.Dimension(100, 60));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        one.setText("1");
        one.setMaximumSize(new java.awt.Dimension(100, 60));
        one.setMinimumSize(new java.awt.Dimension(100, 60));
        one.setPreferredSize(new java.awt.Dimension(100, 60));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        dot.setText(".");
        dot.setMaximumSize(new java.awt.Dimension(100, 60));
        dot.setMinimumSize(new java.awt.Dimension(100, 60));
        dot.setPreferredSize(new java.awt.Dimension(100, 60));
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        division.setText("/");
        division.setMaximumSize(new java.awt.Dimension(206, 60));
        division.setMinimumSize(new java.awt.Dimension(206, 60));
        division.setPreferredSize(new java.awt.Dimension(206, 60));
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        two.setText("2");
        two.setMaximumSize(new java.awt.Dimension(100, 60));
        two.setMinimumSize(new java.awt.Dimension(100, 60));
        two.setPreferredSize(new java.awt.Dimension(100, 60));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.setMaximumSize(new java.awt.Dimension(100, 60));
        zero.setMinimumSize(new java.awt.Dimension(100, 60));
        zero.setPreferredSize(new java.awt.Dimension(100, 60));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        result.setText("=");
        result.setMaximumSize(new java.awt.Dimension(206, 60));
        result.setMinimumSize(new java.awt.Dimension(206, 60));
        result.setPreferredSize(new java.awt.Dimension(206, 60));
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        clear.setText("AC");
        clear.setMaximumSize(new java.awt.Dimension(100, 60));
        clear.setMinimumSize(new java.awt.Dimension(100, 60));
        clear.setPreferredSize(new java.awt.Dimension(100, 60));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Display)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(result, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(minus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(multi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(division, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        Display.setText(Display.getText()+"1");
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        Display.setText(Display.getText()+"2");
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        Display.setText(Display.getText()+"3");
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        Display.setText(Display.getText()+"4");
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        Display.setText(Display.getText()+"5");
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        Display.setText(Display.getText()+"6");
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        Display.setText(Display.getText()+"7");
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        Display.setText(Display.getText()+"8");
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        Display.setText(Display.getText()+"9");
    }//GEN-LAST:event_nineActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        
        if(limDot==0){
            Display.setText(Display.getText()+".");
            limDot=1;
        }
        else{
            JOptionPane.showMessageDialog(this,"Cannot use twice in a row!");
        }
    }//GEN-LAST:event_dotActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        Display.setText(Display.getText()+"0");
    }//GEN-LAST:event_zeroActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        Display.setText("");
        limDot=0;
        n1=n2=0.0;
    }//GEN-LAST:event_clearActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        result_value=Double.parseDouble(Display.getText());
        result_value=Math.sqrt(result_value);
        stringRes=String.format("%.2f", result_value);
        Display.setText(stringRes);
    }//GEN-LAST:event_sqrtActionPerformed

    private void paiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paiActionPerformed
        Display.setText("3.1416");
    }//GEN-LAST:event_paiActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        try{
            operator="+";
            n1=Double.parseDouble(Display.getText());
            Display.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Cannot use twice in a row!");
        }
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        try{
            operator="-";
            n1=Double.parseDouble(Display.getText());
            Display.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Cannot use twice in a row!");
        }
    }//GEN-LAST:event_minusActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        try{
            operator="*";
            n1=Double.parseDouble(Display.getText());
            Display.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Cannot use twice in a row!");
        }
    }//GEN-LAST:event_multiActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        try{
            operator="/";
            n1=Double.parseDouble(Display.getText());
            Display.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Cannot use twice in a row!");
        }
    }//GEN-LAST:event_divisionActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        try{
            operator="%";
            n1=Double.parseDouble(Display.getText());
            Display.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Cannot use twice in a row!");
        }
    }//GEN-LAST:event_modActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        try{
            Operation();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Nothing to perform!");
        }
    }//GEN-LAST:event_resultActionPerformed

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
    private javax.swing.JTextField Display;
    private javax.swing.JButton clear;
    private javax.swing.JButton division;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton minus;
    private javax.swing.JButton mod;
    private javax.swing.JButton multi;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton pai;
    private javax.swing.JButton plus;
    private javax.swing.JButton result;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
