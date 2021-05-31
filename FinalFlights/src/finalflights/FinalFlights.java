/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalflights;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author emmadebarros
 */
public class FinalFlights extends javax.swing.JFrame {

    DefaultListModel<Flight> listFlightsModel = new DefaultListModel<>();
    
    Database db;

    //TODO: IMPLEMENT SAVE SELECTED TO .CSV
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files (*.txt, *.csv) ", "txt", "csv");
    //TODO: RIGHT CLICK - DELETE

    /**
     * Creates new form FinalFlights
     */
    public FinalFlights() {
        try {
            initComponents();
            fileChooser.setFileFilter(filter);
            db = new Database();
            reloadFromDatabase();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed to connect " + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1); // FATAL ERROR, EXIT PROGRAM
        }
    }

    private void reloadFromDatabase() {
        try {
            ArrayList<Flight> list = db.getAllFlights();
            listFlightsModel.clear(); // remove any items that may be in model
            for (Flight f : list) {
                listFlightsModel.addElement(f);
            }
            lblTotalFlights.setText("Passengers: " + list.size());
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed to fetch records: " + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
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

        dlgAddEdit = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dlgAddEdit_cbType = new javax.swing.JComboBox<>();
        dlgAddEdit_sliderPass = new javax.swing.JSlider();
        dlgAddEdit_lblPass = new javax.swing.JLabel();
        dlgAddEdit_btCancel = new javax.swing.JButton();
        dlgAddEdit_btSave = new javax.swing.JButton();
        dlgAddEdit_lblId = new javax.swing.JLabel();
        dlgAddEdit_ftfDate = new javax.swing.JFormattedTextField();
        dlgAddEdit_tfFromCode = new javax.swing.JTextField();
        dlgAddEdit_tfToCode = new javax.swing.JTextField();
        fileChooser = new javax.swing.JFileChooser();
        lblTotalFlights = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFlights = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miSaveSelected = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miAddFlight = new javax.swing.JMenuItem();

        dlgAddEdit.setResizable(false);

        jLabel1.setText("ID:");

        jLabel2.setText("Date:");

        jLabel3.setText("From Code:");

        jLabel4.setText("To Code:");

        dlgAddEdit_cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Domestic", "Private", "International" }));

        dlgAddEdit_sliderPass.setMajorTickSpacing(25);
        dlgAddEdit_sliderPass.setMaximum(200);
        dlgAddEdit_sliderPass.setMinorTickSpacing(1);
        dlgAddEdit_sliderPass.setPaintLabels(true);
        dlgAddEdit_sliderPass.setPaintTicks(true);
        dlgAddEdit_sliderPass.setSnapToTicks(true);
        dlgAddEdit_sliderPass.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dlgAddEdit_sliderPassStateChanged(evt);
            }
        });

        dlgAddEdit_lblPass.setText("Passengers: 37");

        dlgAddEdit_btCancel.setText("Cancel");
        dlgAddEdit_btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddEdit_btCancelActionPerformed(evt);
            }
        });

        dlgAddEdit_btSave.setText("Save");
        dlgAddEdit_btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddEdit_btSaveActionPerformed(evt);
            }
        });

        dlgAddEdit_lblId.setText("-");

        dlgAddEdit_ftfDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout dlgAddEditLayout = new javax.swing.GroupLayout(dlgAddEdit.getContentPane());
        dlgAddEdit.getContentPane().setLayout(dlgAddEditLayout);
        dlgAddEditLayout.setHorizontalGroup(
            dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddEditLayout.createSequentialGroup()
                .addGroup(dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dlgAddEdit_sliderPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dlgAddEditLayout.createSequentialGroup()
                        .addGroup(dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgAddEditLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(dlgAddEdit_lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgAddEditLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dlgAddEditLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dlgAddEdit_cbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(dlgAddEditLayout.createSequentialGroup()
                                .addComponent(dlgAddEdit_btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(dlgAddEdit_btSave, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddEditLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dlgAddEdit_lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dlgAddEdit_ftfDate)
                                    .addComponent(dlgAddEdit_tfFromCode)
                                    .addComponent(dlgAddEdit_tfToCode, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        dlgAddEditLayout.setVerticalGroup(
            dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddEditLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dlgAddEdit_lblId))
                .addGap(23, 23, 23)
                .addGroup(dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dlgAddEdit_ftfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dlgAddEdit_tfFromCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dlgAddEdit_tfToCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(dlgAddEdit_cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(dlgAddEdit_sliderPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dlgAddEdit_lblPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(dlgAddEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAddEdit_btCancel)
                    .addComponent(dlgAddEdit_btSave))
                .addGap(25, 25, 25))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 300));
        setSize(new java.awt.Dimension(450, 300));

        lblTotalFlights.setText("Total Flights: -");
        getContentPane().add(lblTotalFlights, java.awt.BorderLayout.PAGE_END);

        lstFlights.setModel(listFlightsModel);
        jScrollPane1.setViewportView(lstFlights);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        miSaveSelected.setText("Save Selected...");
        jMenu1.add(miSaveSelected);

        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        miAddFlight.setText("Add Flight");
        miAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddFlightActionPerformed(evt);
            }
        });
        jMenu2.add(miAddFlight);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddFlightActionPerformed
        // TODO add your handling code here:
        //cleanup inputs
        dlgAddEdit_lblId.setText("");
        dlgAddEdit_ftfDate.setText("");
        dlgAddEdit_tfFromCode.setText("");
        dlgAddEdit_tfToCode.setText("");
        dlgAddEdit_cbType.setSelectedIndex(0);
        dlgAddEdit_sliderPass.setValue(37);
        dlgAddEdit_lblPass.setText("Passengers: " + dlgAddEdit_sliderPass.getValue());
        //show dialog
        dlgAddEdit.pack();//tells swing to measure the size of the window and make it the correct size
        dlgAddEdit.setLocationRelativeTo(this);//places it relative to/on top of the parent window(the jFrame)
        dlgAddEdit.setModal(true);//disable the parent while dialog is being shown
        dlgAddEdit_btSave.setText("Add Student");
        dlgAddEdit.setVisible(true);//shows the custom dialog box (make it non-resizable through properties)
    }//GEN-LAST:event_miAddFlightActionPerformed

    private void dlgAddEdit_sliderPassStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dlgAddEdit_sliderPassStateChanged
        // TODO add your handling code here:
        int numPass = dlgAddEdit_sliderPass.getValue();

        dlgAddEdit_lblPass.setText(String.format("Passengers: %d", numPass));
    }//GEN-LAST:event_dlgAddEdit_sliderPassStateChanged

    private void dlgAddEdit_btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddEdit_btCancelActionPerformed
        // TODO add your handling code here:
        dlgAddEdit.setVisible(false);
    }//GEN-LAST:event_dlgAddEdit_btCancelActionPerformed

    private void dlgAddEdit_btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddEdit_btSaveActionPerformed
        try {
            // TODO

            //check for errors and collect them
            ArrayList<String> errorList = new ArrayList<>();

            //Verif Date
            String dateS = dlgAddEdit_ftfDate.getText();
            Date date = GlobalDF.format.parse(dateS);// exc Parse

            Date now = new Date();

            //fromCode
            String fromCode = dlgAddEdit_tfFromCode.getText();
            //toCode
            String toCode = dlgAddEdit_tfToCode.getText();

            if (dateS == null) {
                errorList.add("Must add a date.");
            }

            if (date.before(now)) {
                errorList.add("Date must be in the correct format yyyy-MM-dd and scheduled for a later date. Today's date: " + GlobalDF.format.format(date));
            }

            //Verif fromCode - toCode
            if (!fromCode.matches("^[A-Z]{3,5}$") || !toCode.matches("^[A-Z]{3,5}$")) {
                errorList.add("Destination codes must be between 3-5 characters and contain only uppercase letters");
            }

            //
            if (!errorList.isEmpty()) {
                JOptionPane.showMessageDialog(this, String.join("\n", errorList),
                        "Input error(s)", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Make Type
            
            String flightT = (String) dlgAddEdit_cbType.getSelectedItem();
                    

            //passengers
            int passengers = dlgAddEdit_sliderPass.getValue();

            //Make object
            db.addFlight(new Flight(0, date, fromCode, toCode, Flight.Type.valueOf(flightT), passengers));
            
            reloadFromDatabase();
            dlgAddEdit.setVisible(false);//dismiss the dialog

            /**
             * @param args the command line arguments
             */
        } catch (ParseException exc) {
            exc.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    exc.getMessage(),
                    "Parsing Exception",
                    JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed to connect " + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1); // FATAL ERROR, EXIT PROGRAM
        }
    }//GEN-LAST:event_dlgAddEdit_btSaveActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        // TODO add your handling code here:

        //THE NAMES ARE REVERTED LOL for Exit and ExportToCSV
        Object[] options = {"Exit",
            "Cancel"};
        int n = JOptionPane.showOptionDialog(this,
                "Are you sure you want to exit the program? ",
                "Exit program",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, //do not use a custom Icon
                options, //the titles of buttons
                options[1]); //default button title

        if (n == JOptionPane.YES_NO_OPTION) {

            dispose();
            
            /*
            Options: 
            or frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            setVisible(false); //you can't see me!
            dispose(); //Destroy the JFrame object
            */
        }// end if(n == JOptionPane.YES_NO_OPTION) block
    }//GEN-LAST:event_miExitActionPerformed

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
            java.util.logging.Logger.getLogger(FinalFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalFlights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog dlgAddEdit;
    private javax.swing.JButton dlgAddEdit_btCancel;
    private javax.swing.JButton dlgAddEdit_btSave;
    private javax.swing.JComboBox<String> dlgAddEdit_cbType;
    private javax.swing.JFormattedTextField dlgAddEdit_ftfDate;
    private javax.swing.JLabel dlgAddEdit_lblId;
    private javax.swing.JLabel dlgAddEdit_lblPass;
    private javax.swing.JSlider dlgAddEdit_sliderPass;
    private javax.swing.JTextField dlgAddEdit_tfFromCode;
    private javax.swing.JTextField dlgAddEdit_tfToCode;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalFlights;
    private javax.swing.JList<finalflights.Flight> lstFlights;
    private javax.swing.JMenuItem miAddFlight;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miSaveSelected;
    // End of variables declaration//GEN-END:variables
}