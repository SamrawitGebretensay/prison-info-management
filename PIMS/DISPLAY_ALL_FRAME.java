package pimsgui;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class DISPLAY_ALL_FRAME extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private javax.swing.JTable alld_table;
    private javax.swing.JLabel allintro_l;
    private javax.swing.JButton back_butt;
    private javax.swing.JLabel footer_l;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration

    public DISPLAY_ALL_FRAME() {
        initComponents(); // Initialize the GUI components
        loadDataIntoTable(); // Load data into the table
         this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        allintro_l = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alld_table = new javax.swing.JTable();
        back_butt = new javax.swing.JButton();
        footer_l = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        allintro_l.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allintro_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allintro_l.setText("ALL PRISONERS");

        alld_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                // Empty data initially
            },
            new String [] {
                "ID", "NAME", "SEX", "DOB", "CRIME", "SENTENCE(YEAR)", "RELEASE DATE", "CELL NO", "MD HISTORY", "VISITOR DETAILS"
            }
        ));
        alld_table.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(alld_table);
        alld_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(allintro_l, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(back_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(footer_l, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(allintro_l, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back_butt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(footer_l)
                .addContainerGap())
        );

        pack();
    }

    private void back_buttActionPerformed(java.awt.event.ActionEvent evt) {
        MAIN_MENU men = new MAIN_MENU();
        men.setVisible(true);
        this.dispose();
    }

    private void loadDataIntoTable() {
        List<String[]> data = loadDataFromFile();

        DefaultTableModel model = new DefaultTableModel(
            new String[] {
                "ID", "NAME", "SEX", "DOB", "CRIME", "SENTENCE(YEAR)", "RELEASE DATE", "CELL NO", "MD HISTORY", "VISITOR DETAILS"
            },
            0
        );

        for (String[] row : data) {
            model.addRow(row);
        }

        alld_table.setModel(model);
    }

    private List<String[]> loadDataFromFile() {
        List<String[]> data = new ArrayList<>();
        File file = new File("C:\\PIMS\\CURRENT_DB.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("ID: ")) {
                    String[] row = new String[10];
                    row[0] = line.substring(4).trim(); // ID
                    row[1] = scanner.nextLine().substring(6).trim(); // Name
                    row[2] = scanner.nextLine().substring(5).trim(); // Sex
                    row[3] = scanner.nextLine().substring(14).trim(); // Date of Birth
                    row[4] = scanner.nextLine().substring(7).trim(); // Crime
                    row[5] = scanner.nextLine().substring(10).trim(); // Sentence
                    row[6] = scanner.nextLine().substring(16).trim(); // Release Date
                    row[7] = scanner.nextLine().substring(11).trim(); // Cell Number
                    row[8] = scanner.nextLine().substring(10).trim(); // Medical History
                    row[9] = scanner.nextLine().substring(10).trim(); // Visitors
                    data.add(row);
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return data;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DISPLAY_ALL_FRAME().setVisible(true);
            }
        });
    }
}