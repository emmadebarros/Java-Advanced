/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day07validateinputs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author emmadebarros
 */
public class Day07ValidateInputs extends javax.swing.JFrame {
    
    DefaultListModel<String> modelUserInfo = new DefaultListModel<>();

    /**
     * Creates new form Day07ValidateInputs
     */
    public Day07ValidateInputs() {
        initComponents();
    }

    static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    static { // static initializer
        df.setLenient(false);
    }
    
    ArrayList<String> userInfo = new ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpGender = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfPassport = new javax.swing.JTextField();
        comboContinent = new javax.swing.JComboBox<>();
        rbGenderMale = new javax.swing.JRadioButton();
        rbGenderFemale = new javax.swing.JRadioButton();
        rbGenderOther = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cbPetCat = new javax.swing.JCheckBox();
        cbPetDog = new javax.swing.JCheckBox();
        cbPetOther = new javax.swing.JCheckBox();
        sliderHeight = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btVerifAdd = new javax.swing.JButton();
        lblHeight = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUserInfo = new javax.swing.JList<>();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Name:");

        jLabel2.setText("Passport #:");

        jLabel3.setText("Continent:");

        jLabel4.setText("Gender:");

        comboContinent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Choose...", "Africa", "Antarctica", "Asia", "Australia/Oceania", "Europe", "North America", "South America" }));

        btnGrpGender.add(rbGenderMale);
        rbGenderMale.setText("Male");

        btnGrpGender.add(rbGenderFemale);
        rbGenderFemale.setText("Female");

        btnGrpGender.add(rbGenderOther);
        rbGenderOther.setSelected(true);
        rbGenderOther.setText("Other");

        jLabel5.setText("Pets:");

        cbPetCat.setText("Cat");

        cbPetDog.setText("Dog");

        cbPetOther.setText("Other");

        sliderHeight.setMajorTickSpacing(50);
        sliderHeight.setMaximum(250);
        sliderHeight.setMinimum(100);
        sliderHeight.setMinorTickSpacing(10);
        sliderHeight.setPaintLabels(true);
        sliderHeight.setPaintTicks(true);
        sliderHeight.setValue(170);
        sliderHeight.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderHeightStateChanged(evt);
            }
        });

        jLabel7.setText("Height:");

        jLabel8.setText("Date of Birth:");

        btVerifAdd.setText("Verify & Add Value");
        btVerifAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerifAddActionPerformed(evt);
            }
        });

        lblHeight.setText("170 cm");

        tfDate.setText("yyyy-mm-dd");

        lstUserInfo.setModel(modelUserInfo);
        jScrollPane1.setViewportView(lstUserInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfName)
                                        .addComponent(tfPassport)
                                        .addComponent(comboContinent, 0, 183, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbGenderMale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbGenderFemale))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbPetCat)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbPetDog)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbPetOther)
                                            .addComponent(rbGenderOther)))
                                    .addComponent(sliderHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfDate)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btVerifAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboContinent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbGenderMale)
                    .addComponent(rbGenderFemale)
                    .addComponent(rbGenderOther))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbPetCat)
                    .addComponent(cbPetDog)
                    .addComponent(cbPetOther))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(lblHeight)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btVerifAdd)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVerifAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerifAddActionPerformed
        // TODO add your handling code here:

        //1. Verif name
        if (tfName.getText().isEmpty()) {
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "Name must not be empty.",
                    "Input error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
            return;
        }

        if (!tfName.getText().matches("^[a-zA-Z -]{1,50}$")) {
            tfName.setText("");
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "Name must only contain uppercase, lowercase, spaces, and hyphens characters and be between 1-50 characters long.",
                    "Input error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
            return;
        }
        
        String name = tfName.getText();
        userInfo.add(name);

        //2. Verif Passport
        if (tfPassport.getText().isEmpty()) {
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "Passport must not be empty.",
                    "Input error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
            return;
        }

        if (!tfPassport.getText().matches("^[A-z]{2}[1-6]{6}$")) {
            tfPassport.setText("");
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "Passport must start with two uppercase characters followed by 6 digits.",
                    "Input error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
            return;
        }
        
        String passport = tfPassport.getText();
        userInfo.add(passport);

        //3. Verif Continent
        if (comboContinent.getSelectedIndex() == 0) { //comboContinent.getText() == "Please choose..." no good because might change the text
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "Must choose a continent.",
                    "Input error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
            return;
        } else {
            String continent = (String) comboContinent.getSelectedItem(); //cast
            userInfo.add(continent);
        }

        //4. Verif Gender
        String gender;
        if (rbGenderOther.isSelected()) {
            gender = "Other";
        } else if (rbGenderFemale.isSelected()) {
            gender = "Female";
        } else if (rbGenderMale.isSelected()) {
            gender = "Male";
        } else { //should never happen
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "Invalid control flow",
                    "Internal error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
            return;
        }
        
        userInfo.add(gender);

        //5. Verif Pets
        
        String pet = "No pet";
        
        if (cbPetCat.isSelected()) {
            if(pet.equals("No pet")) {
                pet = "Cat";
            } else {
                pet += ", Cat";
            }
        }
        
        if (cbPetDog.isSelected()) {
            if(pet.equals("No pet")) {
                pet = "Dog";
            } else {
                pet += ", Dog";
            }
        }
        
        if (cbPetOther.isSelected()) {
            if(pet.equals("No pet")) {
                pet = "Other";
            } else {
                pet += ", Other";
            }
        }
        
        userInfo.add(pet);
        
        
        /* for the purpose of this exercice I think it's better if I use just a simple String
        ArrayList<String> petsList = new ArrayList<>();

        if (cbPetCat.isSelected()) {
            petsList.add("Cat");
        }

        if (cbPetDog.isSelected()) {
            petsList.add("Dog");
        }

        if (cbPetOther.isSelected()) {
            petsList.add("Other");
        }

        String pets = String.join(",", petsList);
        */

        //6. Verif Height
        int height = sliderHeight.getValue(); //event listener on it too

        //7. Verif Date
        String date;

        if (tfDate.getText().isEmpty() || tfDate.getText().equals("yyyy-mm-dd")) {
            tfDate.setText("yyyy-mm-yy");
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "A date must be entered",
                    "Input error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
            return;
        } else {

            try {

                Date dateTest = df.parse(tfDate.getText()); //might throw ParseException

                int year = dateTest.getYear() + 1900;

                if (year < 1900 || year > 2100) {
                    //custom title, error icon
                    tfDate.setText("");
                    JOptionPane.showMessageDialog(this,
                            "Year must be between 1900-2100.",
                            "Input error",
                            JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
                    return;
                }

                String dateTestF = df.format(dateTest); //Format it

                date = dateTestF;

            } catch (ParseException ex) {
                //custom title, error icon
                tfDate.setText("yyyy-mm-dd");
                JOptionPane.showMessageDialog(this,
                        "Must enter a date in the valid format yyyy-mm-dd",
                        "Input error",
                        JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
                return;
            }
            
            userInfo.add(date);

        }

        /*
        getYear() on date is depricated and prefered to use this instead: 
        
        Date date; // your date
        // Choose time zone in which you want to interpret your Date
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        // etc.
        
        see also Java image folder **set-date-calendar and **set-date-localDate (better to use localDate now)
         */
        
        String infoS = String.join(";", userInfo);
        userInfo.clear();
        
        modelUserInfo.addElement(infoS);
        
        tfName.setText("");
        tfPassport.setText("");
        comboContinent.setSelectedIndex(0);
        rbGenderOther.setSelected(true);
        cbPetCat.setSelected(false);
        cbPetDog.setSelected(false);
        cbPetOther.setSelected(false);
        sliderHeight.setValue(170);
        tfDate.setText("yyyy-mm-dd");

    }//GEN-LAST:event_btVerifAddActionPerformed

    private void sliderHeightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderHeightStateChanged
        // TODO add your handling code here:
        int height = sliderHeight.getValue();

        lblHeight.setText(String.format("%d cm", height));
    }//GEN-LAST:event_sliderHeightStateChanged

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
            java.util.logging.Logger.getLogger(Day07ValidateInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Day07ValidateInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Day07ValidateInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Day07ValidateInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Day07ValidateInputs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVerifAdd;
    private javax.swing.ButtonGroup btnGrpGender;
    private javax.swing.JCheckBox cbPetCat;
    private javax.swing.JCheckBox cbPetDog;
    private javax.swing.JCheckBox cbPetOther;
    private javax.swing.JComboBox<String> comboContinent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JList<String> lstUserInfo;
    private javax.swing.JRadioButton rbGenderFemale;
    private javax.swing.JRadioButton rbGenderMale;
    private javax.swing.JRadioButton rbGenderOther;
    private javax.swing.JSlider sliderHeight;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassport;
    // End of variables declaration//GEN-END:variables
}
