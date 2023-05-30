package oanh;

import javax.swing.JOptionPane;

/**
 *
 * @author ABC
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTen = new javax.swing.JPanel();
        lblTen = new javax.swing.JLabel();
        paneliputTen = new javax.swing.JPanel();
        rbtQuantrivien = new javax.swing.JRadioButton();
        rbtKhachhang = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        panelTen2 = new javax.swing.JPanel();
        lblTen1 = new javax.swing.JLabel();
        paneliputTen2 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        panelTen1 = new javax.swing.JPanel();
        lblTenMatkhau = new javax.swing.JLabel();
        paneliputTen1 = new javax.swing.JPanel();
        txtPass = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnQuenMK = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnDangNhap1 = new javax.swing.JButton();
        btnHuy1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(600, 600));
        setMinimumSize(new java.awt.Dimension(300, 108));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(5, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        panelTen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTen.setFocusable(false);
        panelTen.setMaximumSize(new java.awt.Dimension(50, 50));
        panelTen.setMinimumSize(new java.awt.Dimension(50, 20));
        panelTen.setLayout(new javax.swing.BoxLayout(panelTen, javax.swing.BoxLayout.LINE_AXIS));

        lblTen.setText("Loại Tài Khoản:");
        lblTen.setFocusable(false);
        lblTen.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelTen.add(lblTen);

        jPanel1.add(panelTen);

        paneliputTen.setLayout(new javax.swing.BoxLayout(paneliputTen, javax.swing.BoxLayout.LINE_AXIS));

        rbtQuantrivien.setText("Quản Trị Viên");
        paneliputTen.add(rbtQuantrivien);

        rbtKhachhang.setText("Khách hàng");
        paneliputTen.add(rbtKhachhang);

        jPanel1.add(paneliputTen);

        getContentPane().add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        panelTen2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTen2.setFocusable(false);
        panelTen2.setMaximumSize(new java.awt.Dimension(50, 50));
        panelTen2.setMinimumSize(new java.awt.Dimension(50, 20));
        panelTen2.setLayout(new javax.swing.BoxLayout(panelTen2, javax.swing.BoxLayout.LINE_AXIS));

        lblTen1.setText("Tên Đăng Nhập:");
        lblTen1.setFocusable(false);
        lblTen1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelTen2.add(lblTen1);

        jPanel2.add(panelTen2);

        paneliputTen2.setLayout(new javax.swing.BoxLayout(paneliputTen2, javax.swing.BoxLayout.LINE_AXIS));
        paneliputTen2.add(txtUsername);

        jPanel2.add(paneliputTen2);

        getContentPane().add(jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        panelTen1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTen1.setFocusable(false);
        panelTen1.setMinimumSize(new java.awt.Dimension(200, 50));
        panelTen1.setLayout(new javax.swing.BoxLayout(panelTen1, javax.swing.BoxLayout.LINE_AXIS));

        lblTenMatkhau.setText("Mật Khẩu:");
        lblTenMatkhau.setFocusable(false);
        lblTenMatkhau.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelTen1.add(lblTenMatkhau);

        jPanel4.add(panelTen1);

        paneliputTen1.setLayout(new javax.swing.BoxLayout(paneliputTen1, javax.swing.BoxLayout.LINE_AXIS));
        paneliputTen1.add(txtPass);

        jPanel4.add(paneliputTen1);

        getContentPane().add(jPanel4);

        btnQuenMK.setBackground(new java.awt.Color(51, 255, 255));
        btnQuenMK.setText("Quên Mật Khẩu");
        btnQuenMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuenMKActionPerformed(evt);
            }
        });
        jPanel3.add(btnQuenMK);

        btnDangKy.setBackground(new java.awt.Color(51, 255, 255));
        btnDangKy.setText("Đăng Ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });
        jPanel3.add(btnDangKy);

        getContentPane().add(jPanel3);

        btnDangNhap1.setText("Đăng Nhập");
        btnDangNhap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhap1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnDangNhap1);

        btnHuy1.setText("Hủy");
        btnHuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuy1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnHuy1);

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhap1ActionPerformed
        // TODO add your handling code here:
        if (txtUsername.getText().equals("") || txtPass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Username or Pass is empty!", "Empty", JOptionPane.WARNING_MESSAGE);
        }
        if (txtUsername.getText().equals("admin") || txtPass.getText().equals("admin")) {
            JOptionPane.showMessageDialog(null, "Login success!");
        } else {
            JOptionPane.showConfirmDialog(null,"Login failed!","Failed",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDangNhap1ActionPerformed

    private void btnHuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuy1ActionPerformed
        // TODO add your handling code here:
        txtUsername.setText("");
        txtPass.setText("");
    }//GEN-LAST:event_btnHuy1ActionPerformed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        // TODO add your handling code here:
        frmDangKy fdangky = new frmDangKy();
        fdangky.setVisible(true);
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnQuenMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuenMKActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnQuenMKActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap1;
    private javax.swing.JButton btnHuy1;
    private javax.swing.JButton btnQuenMK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblTen1;
    private javax.swing.JLabel lblTenMatkhau;
    private javax.swing.JPanel panelTen;
    private javax.swing.JPanel panelTen1;
    private javax.swing.JPanel panelTen2;
    private javax.swing.JPanel paneliputTen;
    private javax.swing.JPanel paneliputTen1;
    private javax.swing.JPanel paneliputTen2;
    private javax.swing.JRadioButton rbtKhachhang;
    private javax.swing.JRadioButton rbtQuantrivien;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
