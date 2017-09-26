package univeristyoop;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Adminka extends javax.swing.JFrame {

    StudentForm rowData = new StudentForm();
    static Courses studentCourses = new Courses();
    University uni1 = new University("Khazar");
    Student s1 = new Student("1", "Aysel", "Abdullayeva");
    Student s2 = new Student("2", "Artyom", "Pirojkov");
    Student s3 = new Student("3", "Rashad", "Khaliqov");

    public Adminka() {
        initComponents();
        defaultStudents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_tableDemo = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField_ID = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField_name = new javax.swing.JTextField();
        jTextField_surname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_tableDemo.setBackground(new java.awt.Color(153, 153, 255));
        jTable_tableDemo.setForeground(new java.awt.Color(255, 255, 255));
        jTable_tableDemo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Surname", "ID"
            }
        ));
        jTable_tableDemo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable_tableDemoFocusGained(evt);
            }
        });
        jTable_tableDemo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_tableDemoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_tableDemo);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Show Info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField_ID.setBackground(new java.awt.Color(153, 153, 255));

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField_name.setBackground(new java.awt.Color(153, 153, 255));

        jTextField_surname.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable_tableDemo.getModel();
        System.out.println("" + University.listStudent.toString());
        int i = jTable_tableDemo.getSelectedRow();
        if (i >= 0) {
            University.listStudent.remove(i);
            model.removeRow(i);
            System.out.println("" + University.listStudent.toString());
        } else {
            System.out.println("Error!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int index = getIndexOfSelectedRow();
        System.out.println("i:" + index); // Checking current selected row
        TableModel model = jTable_tableDemo.getModel();
        String id = model.getValueAt(index, 2).toString();
        String name = model.getValueAt(index, 0).toString();
        String surname = model.getValueAt(index, 1).toString();
        rowData.setVisible(true);
        rowData.pack();
        rowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rowData.jTextField_ID.setText(id);
        rowData.jTextField_name.setText(name);
        rowData.jTextField_surname.setText(surname);

        // ------------ DISPLAY LIST OF LESSONS in COURSES FRAME
        DefaultTableModel model2 = (DefaultTableModel) studentCourses.getjTable4().getModel();
        model2.setRowCount(0);
        studentCourses.jLabel9_errorLog.setText("");
        if (index < University.listStudent.size()) {
            for (int z = 0; z < University.listStudent.get(index).arrListLessons.size(); z++) {
                model2.addRow(new Object[]{University.listStudent.get(index).arrListLessons.get(z).getCode(), University.listStudent.get(index).arrListLessons.get(z).getName(), University.listStudent.get(index).arrListLessons.get(z).getCredit()});

            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed


    private void jTable_tableDemoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable_tableDemoFocusGained


    }//GEN-LAST:event_jTable_tableDemoFocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Add Student button
        addStudentToList();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable_tableDemoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_tableDemoMouseClicked

    }//GEN-LAST:event_jTable_tableDemoMouseClicked

    public static int getIndexOfSelectedRow() {

        return jTable_tableDemo.getSelectedRow();
    }

    public void defaultStudents() {

        University.listStudent.add(s1);
        University.listStudent.add(s2);
        University.listStudent.add(s3);
        DefaultTableModel model = (DefaultTableModel) jTable_tableDemo.getModel();
        for (int i = 0; i < 3; i++) {
            model.addRow(new Object[]{University.listStudent.get(i).getName(), University.listStudent.get(i).getSurname(), University.listStudent.get(i).getId()});

        }

    }

    public void addStudentToList() {
        System.out.println("" + University.listStudent.toString());
        DefaultTableModel model = (DefaultTableModel) jTable_tableDemo.getModel();
        String id = jTextField_ID.getText();
        String name = jTextField_name.getText();
        String surname = jTextField_surname.getText();
        Student student = new Student(id, name, surname);
        model.setRowCount(0);
        University.listStudent.add(student); // ADD NEW STUDENT TO ARRAY LIST
        for (int i = 0; i < University.listStudent.size(); i++) { // ITERATION FOR SHOWING STUDENTS IN TABLE
            model.addRow(new Object[]{University.listStudent.get(i).getName(),
                University.listStudent.get(i).getSurname(),
                University.listStudent.get(i).getId()});
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_tableDemo;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_surname;
    // End of variables declaration//GEN-END:variables
}
