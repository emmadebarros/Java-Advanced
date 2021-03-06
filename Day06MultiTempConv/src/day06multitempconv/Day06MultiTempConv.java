/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day06multitempconv;

import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author emmadebarros
 */
public class Day06MultiTempConv extends javax.swing.JFrame {

    /**
     * Creates new form Day06MultiTempConv
     */
    public Day06MultiTempConv() {
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

        btnGrpInput = new javax.swing.ButtonGroup();
        btnGrpOutput = new javax.swing.ButtonGroup();
        tfInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbInputCelsius = new javax.swing.JRadioButton();
        rbInputFahrenheit = new javax.swing.JRadioButton();
        rbInputKelvin = new javax.swing.JRadioButton();
        rbOutputCelsius = new javax.swing.JRadioButton();
        rbOutputFahrenheit = new javax.swing.JRadioButton();
        rbOutputKelvin = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        tfOutput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbAnyClicked(evt);
            }
        });

        tfInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfInputKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("input");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("input scale");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("output scale");

        btnGrpInput.add(rbInputCelsius);
        rbInputCelsius.setSelected(true);
        rbInputCelsius.setText("Celsius");
        rbInputCelsius.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbAnyClicked(evt);
            }
        });

        btnGrpInput.add(rbInputFahrenheit);
        rbInputFahrenheit.setText("Fahrenheit");
        rbInputFahrenheit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbAnyClicked(evt);
            }
        });

        btnGrpInput.add(rbInputKelvin);
        rbInputKelvin.setText("Kelvin");
        rbInputKelvin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbAnyClicked(evt);
            }
        });

        btnGrpOutput.add(rbOutputCelsius);
        rbOutputCelsius.setText("Celsius");
        rbOutputCelsius.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbAnyClicked(evt);
            }
        });

        btnGrpOutput.add(rbOutputFahrenheit);
        rbOutputFahrenheit.setSelected(true);
        rbOutputFahrenheit.setText("Fahrenheit");
        rbOutputFahrenheit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbAnyClicked(evt);
            }
        });

        btnGrpOutput.add(rbOutputKelvin);
        rbOutputKelvin.setText("Kelvin");
        rbOutputKelvin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbAnyClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbInputCelsius)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbOutputCelsius)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbInputFahrenheit)
                                .addComponent(rbInputKelvin)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbOutputFahrenheit)
                                    .addComponent(rbOutputKelvin))
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInputCelsius)
                    .addComponent(rbOutputCelsius))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInputFahrenheit)
                    .addComponent(rbOutputFahrenheit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInputKelvin)
                    .addComponent(rbOutputKelvin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfInputKeyReleased
        // TODO add your handling code here:
        recalculate();
    }//GEN-LAST:event_tfInputKeyReleased

    private void rbAnyClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAnyClicked
        // TODO add your handling code here:
        recalculate();
    }//GEN-LAST:event_rbAnyClicked

    private void recalculate() {
        
        double inputVal;
        
        //1. Parse the input
        try {
            inputVal = Double.parseDouble(tfInput.getText());
        } catch (NumberFormatException exc) {
            tfOutput.setText("invalid input");
            return;
        }
        
        double cel;
        
        //2.Convert everything selected to Celsius (we're saving time converting one unit (C) into the others instead of matching calculations to the right units
        if(rbInputCelsius.isSelected()) {
            cel = inputVal;
        } else if (rbInputFahrenheit.isSelected()) {
            cel = (inputVal - 32) *  5/9;
        } else if (rbInputKelvin.isSelected()) {
            cel = inputVal - 273.15;
        } else { // should never happen - if nothing is selected
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "No input radio button selected found.",
                    "Internal error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
            return;
        }
        
        double outputVal;
        String unit;
        
        //3.Convert the celsius converted value into whatever output value is selected
        if(rbOutputCelsius.isSelected()) {
            outputVal = cel; // because it's already been converted
            unit = "??C";
        } else if (rbOutputFahrenheit.isSelected()) {
            outputVal = (cel * 9/5) + 32;
            unit = "??F";
        } else if (rbOutputKelvin.isSelected()) {
            outputVal = cel + 273.15;
            unit = "??K";
        } else { // should never happen - if nothing is selected
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "No output radio button selected found.",
                    "Internal error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
            return;
        }
        
        String outputString = String.format("%.2f %s", outputVal, unit);
        tfOutput.setText(outputString);
        
    }
    
    
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
            java.util.logging.Logger.getLogger(Day06MultiTempConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Day06MultiTempConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Day06MultiTempConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Day06MultiTempConv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Day06MultiTempConv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpInput;
    private javax.swing.ButtonGroup btnGrpOutput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbInputCelsius;
    private javax.swing.JRadioButton rbInputFahrenheit;
    private javax.swing.JRadioButton rbInputKelvin;
    private javax.swing.JRadioButton rbOutputCelsius;
    private javax.swing.JRadioButton rbOutputFahrenheit;
    private javax.swing.JRadioButton rbOutputKelvin;
    private javax.swing.JTextField tfInput;
    private javax.swing.JTextField tfOutput;
    // End of variables declaration//GEN-END:variables
}
