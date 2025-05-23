package pimsgui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author COMPUTER
 */
public class DISPLAY_TRANS_OR_DELETE_FRAME extends javax.swing.JFrame {

    /**
     * Creates new form DISPLAY_TRANS_OR_DELETE_FRAME
     */
    public DISPLAY_TRANS_OR_DELETE_FRAME() {
        initComponents();
        loadDeletedData(); // Load deleted data into the table when the frame is created
        loadTransferredData(); // Load transferred data into the second table
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        trans_del_txt_l = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_transfed_l = new javax.swing.JLabel();
        trans_txt_l = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        back_butt = new javax.swing.JButton();
        footer_l = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
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
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        trans_del_txt_l.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        trans_del_txt_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trans_del_txt_l.setText("TRANSFERED OR DELETED PRISONERS FROM OUR PRISONE");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                // Empty table initially
            },
            new String [] {
                "ID", "NAME", "SEX", "DOB", "CRIME", "SENTENCE(YEAR)", "RELEASE DATE", "CELL NO", "MD HISTORY", "VISITORS DETEILS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txt_transfed_l.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        txt_transfed_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_transfed_l.setText("DELETED (sentence complated,other) PRISONERS");

        trans_txt_l.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        trans_txt_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trans_txt_l.setText("TRANSFERED PRISNORES");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                // Empty table initially
            },
            new String [] {
                "ID", "Title 2", " SEX", "DOB", "CRIME", "SENTENCE(YEAR)", "RELEASE DATE", "CELL NO", "MD HISTORY", "VISITORS DETEILS"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

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
        footer_l.setText("prisoner information managment system");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(313, 313, 313)
                                    .addComponent(txt_transfed_l, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(334, 334, 334)
                                    .addComponent(trans_txt_l, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(206, 206, 206)
                                    .addComponent(trans_del_txt_l, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(back_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155)
                                .addComponent(footer_l, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(trans_del_txt_l, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_transfed_l, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trans_txt_l)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(back_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(footer_l)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void back_buttActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
         MAIN_MENU men = new MAIN_MENU();
        men.setVisible(true);
        this.dispose();
    }                                         

    /**
     * Loads deleted data from DELETED_DB.txt into jTable1.
     */
    private void loadDeletedData() {
        String filePath = "C:\\PIMS\\DELETED_DB.txt"; // Path to the deleted records file
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear the table before loading new data

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            String[] record = new String[10]; // Array to store each prisoner's data
            int index = 0;

            while ((line = reader.readLine()) != null) {
                line = line.trim(); // Remove extra spaces

                // Check if the line starts with a field (e.g., "ID:", "Name:", etc.)
                if (line.startsWith("ID:")) {
                    record[0] = line.substring(4).trim(); // Extract ID
                } else if (line.startsWith("Name:")) {
                    record[1] = line.substring(6).trim(); // Extract Name
                } else if (line.startsWith("Sex:")) {
                    record[2] = line.substring(5).trim(); // Extract Sex
                } else if (line.startsWith("Date of Birth:")) {
                    record[3] = line.substring(15).trim(); // Extract DOB
                } else if (line.startsWith("Crime:")) {
                    record[4] = line.substring(7).trim(); // Extract Crime
                } else if (line.startsWith("Sentence:")) {
                    record[5] = line.substring(10).trim(); // Extract Sentence
                } else if (line.startsWith("Release Date:")) {
                    record[6] = line.substring(14).trim(); // Extract Release Date
                } else if (line.startsWith("Cell Number:")) {
                    record[7] = line.substring(13).trim(); // Extract Cell Number
                } else if (line.startsWith("Medical History:")) {
                    record[8] = line.substring(17).trim(); // Extract Medical History
                } else if (line.startsWith("Visitors:")) {
                    record[9] = line.substring(10).trim(); // Extract Visitors
                }

                // If the line is empty, it indicates the end of a record
                if (line.isEmpty()) {
                    // Add the record to the table
                    model.addRow(record);
                    // Reset the record array for the next prisoner
                    record = new String[10];
                    index = 0;
                }
            }

            // Add the last record if the file does not end with an empty line
            if (record[0] != null) {
                model.addRow(record);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading DELETED_DB.txt file.", "File Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    /**
     * Loads transferred data from TRANSFERED_DB.txt into jTable2.
     */
    private void loadTransferredData() {
        String filePath = "C:\\PIMS\\TRANSFERED_DB.txt"; // Path to the transferred records file
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Clear the table before loading new data

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            String[] record = new String[10]; // Array to store each prisoner's data
            int index = 0;

            while ((line = reader.readLine()) != null) {
                line = line.trim(); // Remove extra spaces

                // Check if the line starts with a field (e.g., "ID:", "Name:", etc.)
                if (line.startsWith("ID:")) {
                    record[0] = line.substring(4).trim(); // Extract ID
                } else if (line.startsWith("Name:")) {
                    record[1] = line.substring(6).trim(); // Extract Name
                } else if (line.startsWith("Sex:")) {
                    record[2] = line.substring(5).trim(); // Extract Sex
                } else if (line.startsWith("Date of Birth:")) {
                    record[3] = line.substring(15).trim(); // Extract DOB
                } else if (line.startsWith("Crime:")) {
                    record[4] = line.substring(7).trim(); // Extract Crime
                } else if (line.startsWith("Sentence:")) {
                    record[5] = line.substring(10).trim(); // Extract Sentence
                } else if (line.startsWith("Release Date:")) {
                    record[6] = line.substring(14).trim(); // Extract Release Date
                } else if (line.startsWith("Cell Number:")) {
                    record[7] = line.substring(13).trim(); // Extract Cell Number
                } else if (line.startsWith("Medical History:")) {
                    record[8] = line.substring(17).trim(); // Extract Medical History
                } else if (line.startsWith("Visitors:")) {
                    record[9] = line.substring(10).trim(); // Extract Visitors
                }

                // If the line is empty, it indicates the end of a record
                if (line.isEmpty()) {
                    // Add the record to the table
                    model.addRow(record);
                    // Reset the record array for the next prisoner
                    record = new String[10];
                    index = 0;
                }
            }

            // Add the last record if the file does not end with an empty line
            if (record[0] != null) {
                model.addRow(record);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading TRANSFERED_DB.txt file.", "File Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(DISPLAY_TRANS_OR_DELETE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DISPLAY_TRANS_OR_DELETE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DISPLAY_TRANS_OR_DELETE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DISPLAY_TRANS_OR_DELETE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DISPLAY_TRANS_OR_DELETE_FRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton back_butt;
    private javax.swing.JLabel footer_l;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel trans_del_txt_l;
    private javax.swing.JLabel trans_txt_l;
    private javax.swing.JLabel txt_transfed_l;
    // End of variables declaration                   
}