package univeristyoop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Courses extends javax.swing.JFrame {

    LessonForm lessonForm1 = new LessonForm();

    public JTable getjTable4() {
        return jTable4;
    }

    public Courses() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField_code = new javax.swing.JTextField();
        jTextField_name = new javax.swing.JTextField();
        jTextField_credit = new javax.swing.JTextField();
        jTextField_note = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1_teacherName = new javax.swing.JTextField();
        jTextField2_teacherSurname = new javax.swing.JTextField();
        jLabel9_errorLog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jTextField_code.setBackground(new java.awt.Color(153, 153, 255));

        jTextField_name.setBackground(new java.awt.Color(153, 153, 255));

        jTextField_credit.setBackground(new java.awt.Color(153, 153, 255));

        jTextField_note.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setText("Code:");

        jLabel2.setText("Name:");

        jLabel3.setText("Credit:");

        jLabel4.setText("Note:");

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Show INFO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Teacher:");

        jLabel6.setText("Name:");

        jLabel7.setText("Surname:");

        jLabel8.setText("Lesson:");

        jTextField1_teacherName.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1_teacherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_teacherNameActionPerformed(evt);
            }
        });

        jTextField2_teacherSurname.setBackground(new java.awt.Color(153, 153, 255));

        jLabel9_errorLog.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9_errorLog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9_errorLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_code, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jTextField_note)
                                    .addComponent(jTextField_name))
                                .addComponent(jTextField1_teacherName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2_teacherSurname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_note, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1_teacherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9_errorLog, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2_teacherSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable4FocusGained

    }//GEN-LAST:event_jTable4FocusGained

    private void jTable4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable4FocusLost

    }//GEN-LAST:event_jTable4FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Adding course button action
        try {
            addCourse();
        } catch (java.lang.NumberFormatException e1) {
            jLabel9_errorLog.setText("Only numbers are allowed in \"Credit\" Field   ");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// This button opens frame that display expand information about exact lesson(teacher included).
        
        try {
            int indx = Adminka.getIndexOfSelectedRow();
            System.out.println("" + University.listStudent.get(indx).arrListLessons.toString()); // Проверка Array
            String credit1 = Integer.toString(University.listStudent.get(indx).arrListLessons.get(jTable4.getSelectedRow()).getCredit());
            lessonForm1.jTextField_code.setText(University.listStudent.get(indx).arrListLessons.get(jTable4.getSelectedRow()).getCode());
            lessonForm1.jTextField_name.setText(University.listStudent.get(indx).arrListLessons.get(jTable4.getSelectedRow()).getName());
            lessonForm1.jTextField_credit.setText(credit1);
            lessonForm1.jTextField_teacher.setText(University.listStudent.get(indx).arrListLessons.get(jTable4.getSelectedRow()).getTeacher().toString());
        } catch (java.lang.ArrayIndexOutOfBoundsException err) {
            jLabel9_errorLog.setText("Please select any row to continue");
        }

        lessonForm1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1_teacherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_teacherNameActionPerformed

    }//GEN-LAST:event_jTextField1_teacherNameActionPerformed

    public void addCourse() {

        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        System.out.println("" + Adminka.getIndexOfSelectedRow());
        int indx = Adminka.getIndexOfSelectedRow();
        String code = jTextField_code.getText();
        String name = jTextField_name.getText();
        String credit2 = jTextField_credit.getText();
        int credit = Integer.parseInt(jTextField_credit.getText());
        String teacherName = jTextField1_teacherName.getText();
        String teacherSurname = jTextField2_teacherSurname.getText();
        Teacher t = new Teacher(teacherName, teacherSurname);
        Lesson L = new Lesson(code, name, credit, t);
        if (code.equals("") || name.equals("") || teacherName.equals("")
                || teacherSurname.equals("") || credit2.equals("")) {
            jLabel9_errorLog.setText("All fields must be filled!");
        } else if (University.listStudent.get(indx).arrListLessons.size() <= 5) { // If all fields filled we add new lesson to array list
            model.setRowCount(0); // Set the table 0 rows
            University.listStudent.get(indx).addLessonForStd(L); // Add the new lesson if isn't exist

            if (indx < University.listStudent.size()) {
                for (int z = 0; z < University.listStudent.get(indx).arrListLessons.size(); z++) {
                    model.addRow(new Object[]{University.listStudent.get(indx).arrListLessons.get(z).getCode(), University.listStudent.get(indx).arrListLessons.get(z).getName(), University.listStudent.get(indx).arrListLessons.get(z).getCredit()});
// This FOR cycle adds lessons from array list to this table.
                }
            }

        } else {
            jLabel9_errorLog.setText("Maximum 6 lessons allowed");
            // If student has 6 lessons you can't add more lessons to the list.
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9_errorLog;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1_teacherName;
    private javax.swing.JTextField jTextField2_teacherSurname;
    private javax.swing.JTextField jTextField_code;
    private javax.swing.JTextField jTextField_credit;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_note;
    // End of variables declaration//GEN-END:variables
}
