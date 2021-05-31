/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day09friendsdb;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author emmadebarros
 */
public class Day09FriendsDb extends javax.swing.JFrame {

    DefaultListModel<Person> peopleListModel = new DefaultListModel<>();

    Database db;

    /**
     * Creates new form Day09FriendsDb
     */
    //Step1. make the connection and implement reloadFromDatabase()
    public Day09FriendsDb() {
        initComponents();
        try {
            db = new Database();
            reloadFromDatabase();
        } catch (SQLException exc) {
            exc.printStackTrace();
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "Failed to connect." + exc.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
            //return; since it's a fatal error, no return from method. Rather: 
            System.exit(1); //FATAL ERROR - EXIT PROGRAM
        }
    }

    private void reloadFromDatabase() {
        try {
            ArrayList<Person> personList = db.getAllPeople();
            peopleListModel.clear();//remove any items that may be in model
            for (Person p : personList) {
                peopleListModel.addElement(p);//the list can only really display string even if we changed it to Person so it calls the toString();
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "Failed to fetch records." + exc.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPeople = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        spinnerAge = new javax.swing.JSpinner();
        btAddPerson = new javax.swing.JButton();
        btDeletePerson = new javax.swing.JButton();
        btUpdatePerson = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lstPeople.setModel(peopleListModel);
        lstPeople.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPeople.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPeopleValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPeople);

        jLabel1.setText("ID:");

        jLabel2.setText("Name:");

        jLabel3.setText("Age:");

        lblId.setText("-");

        spinnerAge.setModel(new javax.swing.SpinnerNumberModel(1, 0, 150, 1));

        btAddPerson.setText("Add Person");
        btAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddPersonActionPerformed(evt);
            }
        });

        btDeletePerson.setText("Delete Person");
        btDeletePerson.setEnabled(false);
        btDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletePersonActionPerformed(evt);
            }
        });

        btUpdatePerson.setText("Update Person");
        btUpdatePerson.setEnabled(false);
        btUpdatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdatePersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfName)
                    .addComponent(spinnerAge)
                    .addComponent(btAddPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDeletePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btUpdatePerson, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblId))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spinnerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btAddPerson)
                        .addGap(18, 18, 18)
                        .addComponent(btDeletePerson)
                        .addGap(18, 18, 18)
                        .addComponent(btUpdatePerson)
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddPersonActionPerformed
        // TODO add your handling code here:
        try {
            String name = tfName.getText();//verif (we could do setters....)
            if (name.length() < 2 || name.length() > 45) {//check database name size
                //custom title, error icon
                JOptionPane.showMessageDialog(this,
                        "Name must be 2-45 characters long.",
                        "Input error",
                        JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
                return;
            }

            int age = (int) spinnerAge.getValue();
            if (age < 1 || age > 150) {//check database name size
                //custom title, error icon
                JOptionPane.showMessageDialog(this,
                        "Age must be 0-150.",
                        "Input error",
                        JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
                return;
            }

            Person person = new Person(0, name, age);
            //0 because in the addPeople() of database, it'll be ignored and it's a NULL becauser it's auto-increment in the Database
            //I could put any number, it'll be ignored
            db.addPerson(person);
            reloadFromDatabase();
            //cleanup the inputs
            tfName.setText("");
            spinnerAge.setValue(0);
        } catch (SQLException exc) {
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "Failed to fetch records." + exc.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
        }
    }//GEN-LAST:event_btAddPersonActionPerformed

    private void btDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletePersonActionPerformed
        // TODO add your handling code here:
        Person person = lstPeople.getSelectedValue();

        if (person == null) {// shouldn't happen as return button on/off but we play it safe
            return;
        }
        
        Object[] options = {"Delete",
            "Cancel"};
        
        int n = JOptionPane.showOptionDialog(this,
                "Would you like to delete " + person.toString(),//we could just put person here because toString() is implicitely called
                "Delete the data",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, //do not use a custom Icon
                options, //the titles of buttons
                options[1]); //default button title

        if (n == JOptionPane.OK_CANCEL_OPTION) {

            try {

                db.deletePerson(person);
                reloadFromDatabase();

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this,
                        "Failed to fetch records" + ex.getMessage(),
                        "Database error",
                        JOptionPane.ERROR_MESSAGE);
            }// end catch block
        }// end if(n == JOptionPane.YES_NO_OPTION) block


    }//GEN-LAST:event_btDeletePersonActionPerformed

    private void btUpdatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdatePersonActionPerformed
        // TODO add your handling code here:
        Person person = lstPeople.getSelectedValue();
        if (person == null) {//should never happen because we turn buttons on/off but we play it safe
            return;
        }

        try {//code duplication here but teacher said it was okay for today
            String name = tfName.getText();//verif (we could do setters....)
            if (name.length() < 2 || name.length() > 45) {//check database name size
                //custom title, error icon
                JOptionPane.showMessageDialog(this,
                        "Name must be 2-45 characters long.",
                        "Input error",
                        JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
                return;
            }

            int age = (int) spinnerAge.getValue();
            if (age < 1 || age > 150) {//check database name size
                //custom title, error icon
                JOptionPane.showMessageDialog(this,
                        "Age must be 0-150.",
                        "Input error",
                        JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
                return;
            }

            //copy data (after verif) into fields of the selected item
            person.name = name;
            person.age = age;
            //0 because in the addPeople() of database, it'll be ignored and it's a NULL becauser it's auto-increment in the Database
            //I could put any number, it'll be ignored
            db.updatePerson(person);
            reloadFromDatabase();
            //cleanup the inputs
            tfName.setText("");
            spinnerAge.setValue(0);
        } catch (SQLException exc) {
            //custom title, error icon
            JOptionPane.showMessageDialog(this,
                    "Failed to fetch records." + exc.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE); // code from : https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
        }

    }//GEN-LAST:event_btUpdatePersonActionPerformed

    private void lstPeopleValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPeopleValueChanged
        // TODO add your handling code here:
        Person person = lstPeople.getSelectedValue();
        if (person == null) {
            lblId.setText("-");//+ "" because we need it to be a string
            tfName.setText("");
            spinnerAge.setValue(0);
            btUpdatePerson.setEnabled(false);//update and delete btns only work if smtn is selected
            btDeletePerson.setEnabled(false);//update and delete btns only work if smtn is selected
        } else {
            lblId.setText(person.id + "");//+ "" because we need it to be a string
            tfName.setText(person.name);
            spinnerAge.setValue(person.age);
            btUpdatePerson.setEnabled(true);//update and delete btns only work if smtn is selected
            btDeletePerson.setEnabled(true);//update and delete btns only work if smtn is selected

        }
    }//GEN-LAST:event_lstPeopleValueChanged

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
            java.util.logging.Logger.getLogger(Day09FriendsDb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Day09FriendsDb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Day09FriendsDb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Day09FriendsDb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Day09FriendsDb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddPerson;
    private javax.swing.JButton btDeletePerson;
    private javax.swing.JButton btUpdatePerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JList<Person> lstPeople;
    private javax.swing.JSpinner spinnerAge;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
