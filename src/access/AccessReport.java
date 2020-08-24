package access;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class AccessReport extends javax.swing.JFrame {

    List<PersonAcces> lst = new ArrayList<>();
    List<PersonAcces> lstFiltrated = new ArrayList<>();
    DefaultListModel<PersonAcces> model = new DefaultListModel<>();
    DefaultListModel<String> model1 = new DefaultListModel<>();
    Set<String> nameSet = new HashSet<>();
    Set<String> levelSet = new HashSet<>();
    List<PersonAcces> lstCustomFiltered = new ArrayList<>();

    public AccessReport() {
        initComponents();
        listFile.setModel(model);
        jListReport.setModel(model1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfc1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFile = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListReport = new javax.swing.JList<>();
        cBoxNames = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cBoxLevel = new javax.swing.JComboBox<>();
        tfStartDate = new javax.swing.JFormattedTextField();
        tfEndDate = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        jMenuOpen = new javax.swing.JMenuItem();
        jMenuSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listFile);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane2.setViewportView(jListReport);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Data range:");

        jButton1.setText("Filter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Employee:");

        jLabel4.setText("Zone:");

        try {
            tfStartDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfEndDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        menu.setText("File");

        jMenuOpen.setText("Open file");
        jMenuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOpenActionPerformed(evt);
            }
        });
        menu.add(jMenuOpen);

        jMenuSave.setText("Export file");
        menu.add(jMenuSave);
        menu.add(jSeparator1);

        jMenuExit.setText("Exit");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        menu.add(jMenuExit);

        jMenuBar1.add(menu);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cBoxLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cBoxNames, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfStartDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfEndDate))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuExitActionPerformed

    private void jMenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOpenActionPerformed
        model.clear();
        cBoxNames.removeAllItems();
        cBoxLevel.removeAllItems();
        nameSet.clear();
        levelSet.clear();
        levelSet.add("All zones");
        nameSet.add("All names");
        if (jfc1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File resource = jfc1.getSelectedFile();
            if (!resource.isFile()) {
                JOptionPane.showMessageDialog(this, "Please select a file");
                return;
            }
            if (!resource.canRead() || !resource.canExecute()) {
                JOptionPane.showMessageDialog(this, "You don't have access to this file");
            }
            if (!resource.getName().endsWith(".txt")) {
                JOptionPane.showMessageDialog(this, "You must select a text file");
                return;
            } else {
                ReadFile rf = new ReadFile();
                try {
                    lst = rf.readFile(resource);
                    //filter the inconsistentes areas
                    lstFiltrated = rf.filterList(lst, ReadFile.filter);
                    setListModel(lstFiltrated);
                    lstFiltrated.forEach(k -> levelSet.add(k.getLevel()));
                    lstFiltrated.forEach(k -> nameSet.add(k.getName()));
                    nameSet.forEach(k -> cBoxNames.addItem(k));
                    cBoxNames.setSelectedItem("All names");
                    levelSet.forEach(k -> cBoxLevel.addItem(k));
                    cBoxLevel.setSelectedItem("All zones");
                    tfStartDate.setText(lstFiltrated.get(0).getDate().toString());
                    tfEndDate.setText(lstFiltrated.get(lstFiltrated.size() - 1).getDate().toString());
                } catch (IOException ex) {
                    Logger.getLogger(AccessReport.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jMenuOpenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (listFile.getModel().getSize() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a file");
            return;
        }
        String name = cBoxNames.getSelectedItem().toString();
        String level = cBoxLevel.getSelectedItem().toString();
        LocalDate startDate = dateTransfo(tfStartDate.getText());
        LocalDate endDate = dateTransfo(tfEndDate.getText());
        model1.clear();

        if (name.equals("All names") && level.equals("All zones")) {
            lstCustomFiltered = lstFiltrated.stream()
                    .filter(k -> k.getDate().isAfter(startDate.minusDays(1)) && k.getDate().isBefore(endDate.plusDays(1)))
                    .collect(Collectors.toList());
        } else if (name.equals("All names") && !level.equals("All zones")) {
            lstCustomFiltered = lstFiltrated.stream()
                    .filter(k -> k.getLevel().contains(level))
                    .filter(k -> k.getDate().isAfter(startDate.minusDays(1)) && k.getDate().isBefore(endDate.plusDays(1)))
                    .collect(Collectors.toList());
        } else if (!name.equals("All names") && level.equals("All zones")) {
            lstCustomFiltered = lstFiltrated.stream()
                    .filter(k -> k.getName().equals(name))
                    .filter(k -> k.getDate().isAfter(startDate.minusDays(1)) && k.getDate().isBefore(endDate.plusDays(1)))
                    .collect(Collectors.toList());
        } else {
            lstCustomFiltered = lstFiltrated.stream()
                    .filter(k -> k.getName().equals(name))
                    .filter(k -> k.getLevel().contains(level))
                    .filter(k -> k.getDate().isAfter(startDate.minusDays(1)) && k.getDate().isBefore(endDate.plusDays(1)))
                    .collect(Collectors.toList());
        }
        ZoneReport zr = Reports.buildZonesReport(lstCustomFiltered, name, startDate, endDate);
        zr.getReport().forEach((k, v) -> model1.addElement(k.getZone() + ", " + k.getLevel() + ", "
                + String.format("%d:%02d:%02d", v.getSeconds() / 3600, (v.getSeconds() % 3600) / 60, (v.getSeconds() % 60))));
        setListModel(lstCustomFiltered);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setListModel(List<PersonAcces> lst) {
        model.clear();
        for (PersonAcces p : lst) {
            model.addElement(p);
        }
    }

    private LocalDate dateTransfo(String s) {
        int year = Integer.parseInt(s.substring(0, 4));
        int month = Integer.parseInt(s.substring(5, 7));
        int day = Integer.parseInt(s.substring(8));
        return LocalDate.of(year, month, day);
    }

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
            java.util.logging.Logger.getLogger(AccessReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccessReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccessReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccessReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AccessReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cBoxLevel;
    private javax.swing.JComboBox<String> cBoxNames;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListReport;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuExit;
    private javax.swing.JMenuItem jMenuOpen;
    private javax.swing.JMenuItem jMenuSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JFileChooser jfc1;
    private javax.swing.JList<PersonAcces> listFile;
    private javax.swing.JMenu menu;
    private javax.swing.JFormattedTextField tfEndDate;
    private javax.swing.JFormattedTextField tfStartDate;
    // End of variables declaration//GEN-END:variables
}
