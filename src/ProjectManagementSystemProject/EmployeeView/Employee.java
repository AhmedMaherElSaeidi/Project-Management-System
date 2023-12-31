package ProjectManagementSystemProject.EmployeeView;

import ProjectManagementSystemProject.Controller.DataBase;
import ProjectManagementSystemProject.LogIn;
import ProjectManagementSystemProject.ProjectManagementSystemProject;
import ProjectManagementSystemProject.Controller.DateTime;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Employee extends javax.swing.JFrame {

    private static DataBase db;
    private final String path = ProjectManagementSystemProject.storagePath;

    public Employee(String welcomeHeader) {
        initComponents();
        jLabelHeader.setText(welcomeHeader);

        try {
            db = new DataBase(new File(this.path + "EntryTimeTable.txt"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
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

        jLabelHeader = new javax.swing.JLabel();
        recordEntryTime = new javax.swing.JButton();
        requestVacation = new javax.swing.JButton();
        viewPenalties = new javax.swing.JButton();
        viewAssignedTasks = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        showTotalTime = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Interface");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jLabelHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelHeader.setForeground(new java.awt.Color(0, 102, 102));
        jLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        recordEntryTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        recordEntryTime.setText("Record Entry Time");
        recordEntryTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordEntryTimeActionPerformed(evt);
            }
        });

        requestVacation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        requestVacation.setText("Request vacation");
        requestVacation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestVacationActionPerformed(evt);
            }
        });

        viewPenalties.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewPenalties.setText("View penalties");
        viewPenalties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPenaltiesActionPerformed(evt);
            }
        });

        viewAssignedTasks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewAssignedTasks.setText("View assigned tasks");
        viewAssignedTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAssignedTasksActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setForeground(new java.awt.Color(153, 0, 0));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        showTotalTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showTotalTime.setText("Request total time");
        showTotalTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTotalTimeActionPerformed(evt);
            }
        });

        logOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logOut.setForeground(new java.awt.Color(153, 0, 0));
        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Frame");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(viewAssignedTasks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(requestVacation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(recordEntryTime, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(showTotalTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewPenalties, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addComponent(jLabelHeader, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showTotalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recordEntryTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestVacation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewPenalties, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewAssignedTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recordEntryTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordEntryTimeActionPerformed
        EmployeeEntryTime ET = new EmployeeEntryTime();
        ET.show();
    }//GEN-LAST:event_recordEntryTimeActionPerformed


    private void requestVacationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestVacationActionPerformed
        try {
            EmployeeRequestVaccation rv = new EmployeeRequestVaccation();

            db.setFile(new File(path + "VaccationsTable.txt"));
            String[] result = db.getRecordWhere(0, LogIn.userID);

            if (result != null) {
                String[] fields = db.toFields(result[0]);

                if (fields[3].equals("false")) {
                    db.deleteRecordWhere(0, LogIn.userID);
                    JOptionPane.showMessageDialog(null, "Your vaccation request was refused.\nYou can send a new request", "Message", JOptionPane.INFORMATION_MESSAGE);
                    rv.show();
                } else if (fields[3].equals("waiting")) {
                    JOptionPane.showMessageDialog(null, "Your vaccation request is still on hold.", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    boolean onVaccation = DateTime.dateCMP(fields[2], DateTime.nowDate());
                    boolean vaccationStarted = !DateTime.dateCMP(fields[1], DateTime.nowDate());

                    if (onVaccation && vaccationStarted) {
                        JOptionPane.showMessageDialog(null, "Your vaccation request is approved.\nYou are on vaccation!.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else if (onVaccation && !vaccationStarted) {
                        JOptionPane.showMessageDialog(null, "Your vaccation request is approved.\nBut you vaccation didn't start yet.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        db.deleteRecordWhere(0, LogIn.userID);
                        JOptionPane.showMessageDialog(null, "Your vaccation has ended.\nWelcome back.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else {

                rv.show();
            }
        } catch (IOException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_requestVacationActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void viewAssignedTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAssignedTasksActionPerformed
        if (LogIn.userID != null) {
            EmployeeAssignedTasks assignedTasks = new EmployeeAssignedTasks();
            assignedTasks.show();
        } else {
            JOptionPane.showMessageDialog(null, "Please log in first.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewAssignedTasksActionPerformed

    private void viewPenaltiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPenaltiesActionPerformed
        if (LogIn.userID != null) {
            EmployeeViewPenalties p = new EmployeeViewPenalties();
            p.show();
        } else {
            JOptionPane.showMessageDialog(null, "You need to log in first.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewPenaltiesActionPerformed

    private void showTotalTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTotalTimeActionPerformed
        if (LogIn.userID != null) {
            try {
                db.setFile(new File(path + "EntryTimeTable.txt"));
                String[] records = db.readLines();

                boolean isMonthlyAttended = false;
                int days = 0;

                long totalSeconds = 0;
                for (String record : records) {
                    String[] words = db.toFields(record);
                    if (words[0].equals(LogIn.userID)) {
                        totalSeconds += Long.parseLong(words[4]);

                        if (days == 30) {
                            days = 0;
                            isMonthlyAttended = true;
                            for (int j = 0; j < 30; j++) {
                                db.deleteRecordWhere(0, LogIn.userID);
                            }
                        } else {
                            days++;
                        }
                    }
                }

                if (isMonthlyAttended) {
                    JOptionPane.showMessageDialog(null, "The total Attendance accumulative time is " + DateTime.toString(totalSeconds)
                            + " HH:MM:SS", "Total monthly entry time", JOptionPane.INFORMATION_MESSAGE);
                } else if (days == 0 && !isMonthlyAttended) {
                    JOptionPane.showMessageDialog(null, "There's no recorded entry time for now.", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "You can get your attendance accumulative time monthly only.\n"
                            + days + " days are spent for now.", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please log in first.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_showTotalTimeActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        LogIn logIn = new LogIn();
        logIn.show();
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabelHeader;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logOut;
    private javax.swing.JButton recordEntryTime;
    private javax.swing.JButton requestVacation;
    private javax.swing.JButton showTotalTime;
    private javax.swing.JButton viewAssignedTasks;
    private javax.swing.JButton viewPenalties;
    // End of variables declaration//GEN-END:variables
}
