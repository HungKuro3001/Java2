/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Form extends javax.swing.JFrame {

    ArrayList<Staff> list = new ArrayList<>();
    private DefaultTableModel model = new DefaultTableModel();
    Staff x = null;
    private boolean isEditMode = false;

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        clock();
        this.setLocationRelativeTo(null);

    }

    public void clock() {
        ClockThread th = new ClockThread(lblClock);
        th.start();

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
        tblStaff = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();
        lblRecod = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStaff);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setText("MÃ NHÂN VIÊN");

        jLabel3.setText("HỌ TÊN NHÂN VIÊN");

        jLabel4.setText("TUỔI");

        jLabel5.setText("EMAIL");

        jLabel6.setText("LƯƠNG");

        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("FIND");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setText("OPEN");
        btnOpen.setToolTipText("");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblClock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClock.setForeground(new java.awt.Color(255, 0, 0));
        lblClock.setText("00:00:00 AA");

        lblRecod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRecod.setForeground(new java.awt.Color(255, 0, 51));
        lblRecod.setText("Record");

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setText("<<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtId)
                                            .addComponent(txtName)
                                            .addComponent(txtAge)
                                            .addComponent(txtEmail)
                                            .addComponent(txtSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblClock))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnOpen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(lblRecod))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblClock)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpen))
                .addGap(13, 13, 13)
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRecod)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtId.setText("");
        txtAge.setText("");
        txtEmail.setText("");
        txtSalary.setText("");
        isEditMode = false;
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete();
        fillTable();
        locations2(2);
        btnNewActionPerformed(null);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Add();
        fillTable();
         
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        find();
        locations();
        display(0);
        fillTable();
          btnNewActionPerformed(null);
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        openFile();
        fillTable();
        btnFirstActionPerformed(evt);
        showDisplay();
        
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        saveFile();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
        locations();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        previous();
        showDisplay();
        locations();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
        showDisplay();
        locations();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
        locations();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseClicked
        // TODO add your handling code here:
        locations();
        showDisplay();
    }//GEN-LAST:event_tblStaffMouseClicked

    /**
     * @param args the command line arguments
     */
    private void Add() {
        x = new Staff();
        try {
            x.id = txtId.getText();
            if (check(txtId.getText()) == true) {
                JOptionPane.showMessageDialog(this, "Trùng mã hoặc mã bị để trống");
                return;
            }
            if (x.id.length() == 0) {
                JOptionPane.showMessageDialog(this, "Không để trống mã");
                return;
            }
        } catch (Exception e) {
        }

        try {
            x.name = txtName.getText();
            if (x.name.length() == 0) {
                JOptionPane.showMessageDialog(this, "Không để trống tên");
                return;
            }
        } catch (Exception e) {
        }

        try {
            x.age = Integer.parseInt(txtAge.getText());
            if (x.age >= 18 && x.age <= 60) {
            } else {
                JOptionPane.showMessageDialog(this, "tuổi từ 18 đến 60");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "nhập đúng định dạng tuổi");
        }

        try {
            x.email = txtEmail.getText();
            String mail = "^[A-Za-z0-9_.]{6,32}@([a-zA-Z0-9]{2,12})(.[a-zA-Z]{2,12})+$";
            if (x.email.matches(mail)) {

            } else {
                JOptionPane.showMessageDialog(this, "sai định dang email");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "lỗi Email");
        }

        try {
            x.salary = Double.parseDouble(txtSalary.getText());
            if (x.salary > 5000000) {
            } else {
                JOptionPane.showMessageDialog(this, " Lương >5tr");
                return;
            }
        } catch (Exception e) {
        }
        list.add(x);

    }

    private void fillTable() {

        model = (DefaultTableModel) tblStaff.getModel();
        model.setRowCount(0);
        for (Staff x : list) {
            Object[] row = new Object[]{
                x.id, x.name, x.age, x.email, x.salary
            };
            model.addRow(row);
        }

    }

    private boolean check(String checkId) {
        boolean returns = false;
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i).id.equals(checkId) == true) {
                returns = true;
            }
        }
        return returns;
    }
    public void next() {
        try {
            model = (DefaultTableModel) tblStaff.getModel();
            int row = tblStaff.getSelectedRow();
            if (row < list.size() - 1) {
                tblStaff.getSelectionModel().setSelectionInterval(row + 1, row + 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi");
        }
    }

    public void previous() {
        try {
            model = (DefaultTableModel) tblStaff.getModel();
            int row = tblStaff.getSelectedRow();
            if (row > 0) {
                tblStaff.getSelectionModel().setSelectionInterval(row - 1, row - 1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi");
        }
    }
    public void first() {
        int row = 0;
        tblStaff.getSelectionModel().setSelectionInterval(row, row);
    }

    public void last() {

        int row = list.size() - 1;
        tblStaff.getSelectionModel().setSelectionInterval(row, row);
    }
    private void showDisplay() {

        int hang = tblStaff.getSelectedRow();
        Staff x = list.get(hang);
        Generics<String> ma = new Generics<>(x.id);
        txtId.setText(ma.data);
        Generics<String> name = new Generics<>(x.name);
        txtName.setText(name.data);
        Generics<Integer> age = new Generics<>(x.age);
        txtAge.setText(Integer.toString(age.data));
        Generics<String> email = new Generics<>(x.email);
        txtEmail.setText(email.data);
        Generics<Double> salary = new Generics<>(x.salary);
        txtSalary.setText(Double.toString(salary.data));
    }
     public void display(int i) {
        Staff x = list.get(i);
        txtId.setText(x.id);
        txtName.setText(x.name);
        txtAge.setText(Integer.toString(x.age));
        txtEmail.setText(x.email);
        txtSalary.setText(Double.toString(x.salary));

        tblStaff.getSelectionModel().setSelectionInterval(i, i);
    }
       private void locations() {
        try {
            model = (DefaultTableModel) tblStaff.getModel();
            int row = tblStaff.getSelectedRow();
            lblRecod.setText("Record: " + Integer.toString(row + 1) + " / " + list.size());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi vị trí");
        }
    }
        public void locations2(int row) {
        try {
            lblRecod.setText("Record: " + Integer.toString(row + 1) + " / " + list.size());
          tblStaff.getSelectionModel().setSelectionInterval(row , row );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi vị trí");
        }
    }
     public void find() {
        int checkfind = -1;
        String findId = JOptionPane.showInputDialog("Nhập mã");
        int i;
        for (i = 0; i <= list.size() - 1; i++) {
            if (list.get(i).id.equals(findId) == true) {
                checkfind = i;
                tblStaff.getSelectionModel().setSelectionInterval(i, i);

            }
        }
        if (findId.length() == 0) {
            JOptionPane.showMessageDialog(this, "không để trống");
        } else if (checkfind == -1) {
            JOptionPane.showMessageDialog(this, "Không có mã");

        } else {
            Staff x = list.get(checkfind);
            txtId.setText(x.id);
            txtName.setText(x.name);
            txtAge.setText(Integer.toString(x.age));
            txtEmail.setText(x.email);
            txtSalary.setText(Double.toString(x.salary));
        }
        
    }
     public void delete() {
        int check = -1;
        int i;
        String findId = JOptionPane.showInputDialog("Nhập mã");
        for (i = 0; i <= list.size() - 1; i++) {
            if (list.get(i).id.equals(findId) == true) {
                check = i;
            }
        }
        if (check >= 0) {
            list.remove(check);
            fillTable();
            JOptionPane.showMessageDialog(this, "xóa thành công");
        } else if (findId.length() == 0) {
            JOptionPane.showMessageDialog(this, "không để trống");
        } else {
            JOptionPane.showMessageDialog(this, "masv không tồn tại");
        }
    }
    private void openFile() {
        try {
            FileInputStream fis = new FileInputStream("data.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<Staff>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "lỗi mở file");

        }
    }

    private void saveFile() {
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "bạn muốn thoát không", "Exit", JOptionPane.YES_NO_OPTION);
            if (hoi == JOptionPane.YES_OPTION) {
                FileOutputStream fos = new FileOutputStream("data.dat");
                ObjectOutputStream oss = new ObjectOutputStream(fos);
                oss.writeObject(list);
                oss.close();
                JOptionPane.showMessageDialog(this, "lưu thành công");
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "lỗi lưu file");
        }
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
            java.util.logging.Logger.getLogger(Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblRecod;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}