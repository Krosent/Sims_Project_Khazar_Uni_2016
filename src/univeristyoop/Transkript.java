package univeristyoop;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Transkript extends javax.swing.JFrame {

    public Transkript() {
        initComponents();
        defaultTranscriptLsns();

    }

    public JTable getjTable2() {
        return jTable2;
    }

    public JTable getjTable4() {
        return jTable4;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jTable4.setBackground(new java.awt.Color(153, 153, 255));
        jTable4.setForeground(new java.awt.Color(255, 255, 255));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Credit", "Note"
            }
        ));
        jTable4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable4FocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTable4);

        jTable2.setBackground(new java.awt.Color(153, 153, 255));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GPA", "Total Credit"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable4FocusLost

    }//GEN-LAST:event_jTable4FocusLost

    private void jTable4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable4FocusGained

    }//GEN-LAST:event_jTable4FocusGained

//    public static void main(String args[]) {
//        
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Transkript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Transkript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Transkript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Transkript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//    
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Transkript().setVisible(true);
//            }
//        });
//    }
    public void defaultTranscriptLsns() {
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        int index = Adminka.getIndexOfSelectedRow();

        Lesson l1 = new Lesson("CMS140", "History", 4, 90);
        Lesson l2 = new Lesson("CMS 240", "Culture", 3, 83);
        Lesson l3 = new Lesson("CMS 123", "Web", 3, 74);
        Lesson l4 = new Lesson("CMS 236", "OOP", 4, 71);
        Lesson l5 = new Lesson("CMS 213", "Dancing", 3, 64);
        Lesson l6 = new Lesson("CMS140", "Esp", 4, 85);
        Lesson l7 = new Lesson("CMS 240", "Foundation1", 3, 73);
        Lesson l8 = new Lesson("CMS 123", "$toto", 3, 84);
        Lesson l9 = new Lesson("CMS 236", "Philosophy", 4, 91);
        Lesson l10 = new Lesson("CMS 213", "Chorus", 3, 84);

        University.listStudent.get(0).arrListOldLessons.clear(); // >> Clear the array
        University.listStudent.get(1).arrListOldLessons.clear(); // >> Clear the array 

        if (University.listStudent.get(index).getName().equals("Aysel")) {
            University.listStudent.get(index).addOldLessonForStd(l1);
            University.listStudent.get(index).addOldLessonForStd(l2);
            University.listStudent.get(index).addOldLessonForStd(l3);
            University.listStudent.get(index).addOldLessonForStd(l4);
            University.listStudent.get(index).addOldLessonForStd(l5);

        } /////////////////////////
        else if (University.listStudent.get(index).getName().equals("Artyom")) {
            University.listStudent.get(index).addOldLessonForStd(l6);
            University.listStudent.get(index).addOldLessonForStd(l7);
            University.listStudent.get(index).addOldLessonForStd(l8);
            University.listStudent.get(index).addOldLessonForStd(l9);
            University.listStudent.get(index).addOldLessonForStd(l10);
        }

        if (index < University.listStudent.size()) {
            for (int z = 0; z < University.listStudent.get(index).arrListOldLessons.size(); z++) {
                model.addRow(new Object[]{University.listStudent.get(index).arrListOldLessons.get(z).getCode(), University.listStudent.get(index).arrListOldLessons.get(z).getName(), University.listStudent.get(index).arrListOldLessons.get(z).getCredit(), University.listStudent.get(index).arrListOldLessons.get(z).getNote()});

            }
        }

        model2.addRow(new Object[]{University.listStudent.get(index).getGPA(), University.listStudent.get(index).getTotalCredit()});

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private static javax.swing.JTable jTable2;
    private static javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
