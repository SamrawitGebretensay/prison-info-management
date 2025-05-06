package pimsgui;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SEARCH_BY_ID extends javax.swing.JFrame {

    /**
     * Creates new form SEARCH_BY_ID
     */
    public SEARCH_BY_ID() {
        initComponents();
         this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        search_l = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ser_l = new javax.swing.JLabel();
        ser_tf = new javax.swing.JTextField();
        ser_but = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back_butt = new javax.swing.JButton();
        footer_l = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        search_l.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search_l.setText("SEARCH PRISONERS BY ID");

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        ser_l.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ser_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ser_l.setText("ENTER ID NO : ");

        ser_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_tfActionPerformed(evt);
            }
        });

        ser_but.setBackground(new java.awt.Color(0, 51, 204));
        ser_but.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ser_but.setForeground(new java.awt.Color(255, 255, 255));
        ser_but.setText("SEARCH");
        ser_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_butActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "SEX", "DOB", "CRIME", "SENTENCE(YEAR)", "RELEASE DATE", "CELL NO", "MD HISTORY", "VISITORS DETEALS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        back_butt.setBackground(new java.awt.Color(0, 51, 204));
        back_butt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        back_butt.setForeground(new java.awt.Color(255, 255, 255));
        back_butt.setText("BACK TO MENU");
        back_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttActionPerformed(evt);
            }
        });

        footer_l.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        footer_l.setForeground(new java.awt.Color(51, 153, 255));
        footer_l.setText("prisoner information management system");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(ser_l, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ser_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ser_but)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(back_butt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(search_l, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(footer_l, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(search_l, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ser_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ser_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ser_but, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(footer_l)
                .addContainerGap())
        );

        pack();
    }

    private void ser_butActionPerformed(java.awt.event.ActionEvent evt) {
        // Get the ID from the text field
        String id = ser_tf.getText().trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Search for the ID in the file
        String[] prisonerData = searchPrisonerById(id);

        if (prisonerData != null) {
            // Display the prisoner data in the table
            displayPrisonerData(prisonerData);
        } else {
            // Show "Not Found" message
            JOptionPane.showMessageDialog(this, "ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Search for the prisoner information by ID in the CURRENT_DB.txt file.
     *
     * @param id The ID to search for.
     * @return An array of prisoner data if found, otherwise null.
     */
    private String[] searchPrisonerById(String id) {
        File file = new File("C:\\PIMS\\CURRENT_DB.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("ID: ")) {
                    String currentId = line.substring(4).trim();
                    if (currentId.equals(id)) {
                        // Found the prisoner, load their data
                        String[] prisonerData = new String[10];
                        prisonerData[0] = currentId; // ID
                        prisonerData[1] = scanner.nextLine().substring(6).trim(); // Name
                        prisonerData[2] = scanner.nextLine().substring(5).trim(); // Sex
                        prisonerData[3] = scanner.nextLine().substring(14).trim(); // Date of Birth
                        prisonerData[4] = scanner.nextLine().substring(7).trim(); // Crime
                        prisonerData[5] = scanner.nextLine().substring(10).trim(); // Sentence
                        prisonerData[6] = scanner.nextLine().substring(16).trim(); // Release Date
                        prisonerData[7] = scanner.nextLine().substring(11).trim(); // Cell Number
                        prisonerData[8] = scanner.nextLine().substring(10).trim(); // Medical History
                        prisonerData[9] = scanner.nextLine().substring(10).trim(); // Visitors

                        return prisonerData; // Return the prisoner data
                    }
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return null; // ID not found
    }

    /**
     * Display the prisoner data in the table.
     *
     * @param prisonerData The prisoner data to display.
     */
    private void displayPrisonerData(String[] prisonerData) {
        // Create a table model with the prisoner data
        String[] columnNames = {"ID", "NAME", "SEX", "DOB", "CRIME", "SENTENCE(YEAR)", "RELEASE DATE", "CELL NO", "MD HISTORY", "VISITORS DETEALS"};
        Object[][] data = {prisonerData};

        // Update the table model
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(data, columnNames);
        jTable1.setModel(model);
    }

    private void ser_tfActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void back_buttActionPerformed(java.awt.event.ActionEvent evt) {
        // Return to the main menu
        MAIN_MENU men = new MAIN_MENU();
        men.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SEARCH_BY_ID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEARCH_BY_ID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEARCH_BY_ID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEARCH_BY_ID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEARCH_BY_ID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton back_butt;
    private javax.swing.JLabel footer_l;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel search_l;
    private javax.swing.JButton ser_but;
    private javax.swing.JLabel ser_l;
    private javax.swing.JTextField ser_tf;
    // End of variables declaration
}