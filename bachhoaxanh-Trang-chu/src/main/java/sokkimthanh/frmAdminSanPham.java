/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokkimthanh;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DSSanPham;
import model.SanPham;

/**
 *
 * @author Thanh
 */
public class frmAdminSanPham extends javax.swing.JFrame {

    //connect danhSachSP
    DSSanPham danhSachSP = new DSSanPham();
    String maSP = "";
    String tenSP = "";
    int loaiSP = 0;
    double giaSP = .0;
    int tieuChiTimKiem = 0;

    private void hienThi() {
        danhSachSP.DocDL();
        DefaultTableModel tableModel = (DefaultTableModel) tblHienThi.getModel();
        tableModel.setRowCount(0);
        for (SanPham value : danhSachSP.getData()) {
            Object[] data = new Object[]{value.getMaSP(), value.getTenSP(), value.getLoaiSP(), value.getGiaSP()};
//            detbl = (DefaultTableModel) tblHienThi.getModel();
            tableModel.addRow(data);
        }
        tableModel.fireTableDataChanged();
    }

    /**
     * Creates new form NewJFrame
     */
    public frmAdminSanPham() {
        initComponents();
        hienThi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        divTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        divInfo = new javax.swing.JPanel();
        divInput = new javax.swing.JPanel();
        divLoaiSanPham = new javax.swing.JPanel();
        lblLoaiSanPham = new javax.swing.JLabel();
        cboLoaiSanPham = new javax.swing.JComboBox<>();
        divTenSP = new javax.swing.JPanel();
        lblTenSP = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        divGiaTien = new javax.swing.JPanel();
        lblGiaTien = new javax.swing.JLabel();
        txtGiaSanPham = new javax.swing.JTextField();
        divButton = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        divSearch = new javax.swing.JPanel();
        panelSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        ckbSearch1 = new javax.swing.JCheckBox();
        cboTieuChi = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        divTable = new javax.swing.JPanel();
        scrollSanPham = new javax.swing.JScrollPane();
        tblHienThi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setMinimumSize(new java.awt.Dimension(500, 173));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        divTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        divTitle.setFocusable(false);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setLabelFor(this);
        lblTitle.setText("Danh mục sản phẩm");
        lblTitle.setToolTipText("Danh mục sản phẩm");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        divTitle.add(lblTitle);

        getContentPane().add(divTitle);
        divTitle.getAccessibleContext().setAccessibleName("");
        divTitle.getAccessibleContext().setAccessibleDescription("");

        divInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        divInfo.setLayout(new javax.swing.BoxLayout(divInfo, javax.swing.BoxLayout.PAGE_AXIS));

        divInput.setLayout(new java.awt.GridLayout(3, 0, 8, 8));

        divLoaiSanPham.setLayout(new java.awt.GridLayout(1, 0, 8, 8));

        lblLoaiSanPham.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLoaiSanPham.setText("Loại sản phẩm");
        lblLoaiSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        lblLoaiSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        divLoaiSanPham.add(lblLoaiSanPham);

        cboLoaiSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trứng sữa", "Đường", "Rau củ quả" }));
        divLoaiSanPham.add(cboLoaiSanPham);

        divInput.add(divLoaiSanPham);

        divTenSP.setLayout(new java.awt.GridLayout(1, 0, 8, 8));

        lblTenSP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTenSP.setText("Tên sản phẩm");
        lblTenSP.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        lblTenSP.setMaximumSize(new java.awt.Dimension(20, 18));
        divTenSP.add(lblTenSP);

        txtTenSanPham.setColumns(1);
        txtTenSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTenSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSanPhamActionPerformed(evt);
            }
        });
        divTenSP.add(txtTenSanPham);

        divInput.add(divTenSP);

        divGiaTien.setLayout(new java.awt.GridLayout(1, 0, 8, 8));

        lblGiaTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGiaTien.setText("Giá sản phẩm");
        lblGiaTien.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        lblGiaTien.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        divGiaTien.add(lblGiaTien);

        txtGiaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaSanPhamActionPerformed(evt);
            }
        });
        divGiaTien.add(txtGiaSanPham);

        divInput.add(divGiaTien);

        divInfo.add(divInput);

        divButton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnThem.setBackground(new java.awt.Color(34, 167, 242));
        btnThem.setForeground(java.awt.Color.white);
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        divButton.add(btnThem);

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        divButton.add(btnXoa);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        divButton.add(btnSua);

        divInfo.add(divButton);

        getContentPane().add(divInfo);

        divSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        divSearch.setLayout(new javax.swing.BoxLayout(divSearch, javax.swing.BoxLayout.PAGE_AXIS));

        panelSearch.setLayout(new javax.swing.BoxLayout(panelSearch, javax.swing.BoxLayout.LINE_AXIS));
        panelSearch.add(txtSearch);

        ckbSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbSearch1ActionPerformed(evt);
            }
        });
        panelSearch.add(ckbSearch1);

        cboTieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--TieuChi--", "LoaiSanPham", "TenSanPham", "GiaSanPham" }));
        panelSearch.add(cboTieuChi);

        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        panelSearch.add(btnSearch);

        divSearch.add(panelSearch);

        divTable.setLayout(new javax.swing.BoxLayout(divTable, javax.swing.BoxLayout.LINE_AXIS));

        tblHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "#", "Tên sản phẩm", "Loại sản phẩm", "Giá sản phẩm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblHienThi.setColumnSelectionAllowed(true);
        tblHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHienThiMouseClicked(evt);
            }
        });
        scrollSanPham.setViewportView(tblHienThi);
        tblHienThi.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        divTable.add(scrollSanPham);

        divSearch.add(divTable);

        getContentPane().add(divSearch);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Đây là một đoạn code trong Java để xử lý sự kiện khi người dùng nhấn vào
     * nút tìm kiếm btnSearch.
     *
     * Khi người dùng nhấn vào nút này, phương thức btnSearch1ActionPerformed sẽ
     * được gọi.
     *
     * Trong phương thức này, đầu tiên chúng ta khai báo biến tieuChiTimKiem và
     * gán giá trị cho nó bằng cách lấy giá trị được chọn từ cboTieuChi.
     *
     * Đây là một đối tượng JComboBox cho phép người dùng chọn một tiêu chí tìm
     * kiếm.
     *
     * Sau đó, chúng ta kiểm tra xem người dùng có chọn một tiêu chí tìm kiếm
     * hay không bằng cách so sánh tieuChiTimKiem với 0.
     *
     * Nếu người dùng đã chọn một tiêu chí, chúng ta sẽ gọi phương thức timKiem
     * của đối tượng danhSachSP để tìm kiếm sản phẩm theo tiêu chí được chọn.
     *
     * Tiếp theo, chúng ta lấy đối tượng DefaultTableModel từ tblHienThi và gọi
     * phương thức setRowCount(0) để xóa tất cả các dòng hiện có trong bảng.
     *
     * Sau đó, chúng ta gọi phương thức fireTableDataChanged() để thông báo cho
     * JTable về sự thay đổi dữ liệu.
     *
     * Cuối cùng, chúng ta sử dụng vòng lặp for để duyệt qua danh sách sản phẩm
     * được trả về từ phương thức timKiem và thêm từng sản phẩm vào bảng.
     *
     * Chúng ta sử dụng phương thức addRow() của lớp DefaultTableModel để thêm
     * một hàng mới vào bảng với các giá trị tương ứng.
     *
     * Sau khi hoàn thành vòng lặp, chúng ta gọi lại phương thức
     * fireTableDataChanged() để cập nhật lại giao diện của JTable.
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // khai bao
        tieuChiTimKiem = cboTieuChi.getSelectedIndex();
// chon 1 tieu chi de tim
        if (tieuChiTimKiem != 0) {
            danhSachSP.TimKiem(tieuChiTimKiem, txtSearch.getText(), cboLoaiSanPham.getSelectedIndex());
            DefaultTableModel tableModel = (DefaultTableModel) tblHienThi.getModel();
            tableModel.setRowCount(0);
            tableModel.fireTableDataChanged();

            for (SanPham value : danhSachSP.getData()) {
                DefaultTableModel detbl = (DefaultTableModel) tblHienThi.getModel();
                Object[] data = new Object[]{value.getMaSP(), value.getTenSP(), value.getLoaiSP(), value.getGiaSP()};
                detbl = (DefaultTableModel) tblHienThi.getModel();
                detbl.addRow(data);
            }
            tableModel.fireTableDataChanged();
        } else {
            hienThi();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void ckbSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbSearch1ActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // khai bao
        int loaiSP = cboLoaiSanPham.getSelectedIndex();
        String tenSP = txtTenSanPham.getText();
        double giaSP = Double.parseDouble(txtGiaSanPham.getText());

        // sua san pham
        int status = danhSachSP.SuaDL(new SanPham(maSP, tenSP, loaiSP, giaSP));
        if (status > 0) {
            JOptionPane.showMessageDialog(rootPane, "Sửa thông tin thành công", "Fixing", 3);
            DefaultTableModel detbl = (DefaultTableModel) tblHienThi.getModel();
            detbl.setValueAt(maSP, tblHienThi.getSelectedRow(), 0);
            detbl.setValueAt(tenSP, tblHienThi.getSelectedRow(), 1);
            detbl.setValueAt(loaiSP, tblHienThi.getSelectedRow(), 2);
            detbl.setValueAt(giaSP, tblHienThi.getSelectedRow(), 3);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        int result = JOptionPane.showConfirmDialog(rootPane, "Đồng ý xóa Sản phẩm " + tenSP);
        if (result == 0) {
            int status = danhSachSP.XoaDL(new SanPham(maSP));
            if (status > 0) {
                JOptionPane.showMessageDialog(rootPane, "Xóa thông tin thành công", "Remove", 1);
                DefaultTableModel detbl = (DefaultTableModel) tblHienThi.getModel();
                detbl.removeRow(tblHienThi.getSelectedRow());
            }
        }
        // reset form
        cboLoaiSanPham.setSelectedIndex(0);
        txtTenSanPham.setText("");
        txtGiaSanPham.setText("");

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        int loaiSP = cboLoaiSanPham.getSelectedIndex();
        String tenSP = txtTenSanPham.getText();
        double giaSP = Double.parseDouble(txtGiaSanPham.getText());

        SanPham sp = new SanPham(tenSP, loaiSP, giaSP);
        int status = danhSachSP.ThemDL(sp);
        txtTenSanPham.setText("");
        txtGiaSanPham.setText("");
        cboLoaiSanPham.setSelectedIndex(0);

        if (status > 0) {
            JOptionPane.showMessageDialog(rootPane, "Thêm thông tin thành công", "Adding", 2);
            danhSachSP.DocDL();
            SanPham sss = (SanPham) danhSachSP.getData().toArray()[danhSachSP.getData().toArray().length - 1];

            DefaultTableModel detbl = (DefaultTableModel) tblHienThi.getModel();
            Object[] data = new Object[]{sss.getMaSP(), sss.getTenSP(), sss.getLoaiSP(), sss.getGiaSP()};
            detbl = (DefaultTableModel) tblHienThi.getModel();
            detbl.addRow(data);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtGiaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaSanPhamActionPerformed

    private void txtTenSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSanPhamActionPerformed

    private void tblHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHienThiMouseClicked
        DefaultTableModel tableModel = (DefaultTableModel) tblHienThi.getModel();

        int colMaSP = 0;// column mã sản phẩm
        int colTenSP = 1;// column tên sản phẩm        
        int colLoaiSP = 2;// column loai sản phẩm
        int colGiaSP = 3;// column giá sản phẩm

        // chọn row trên table
        int row = tblHienThi.getSelectedRow();

        // lấy giá trị từng cột
        maSP =  tableModel.getValueAt(row, colMaSP).toString();
        tenSP = tableModel.getValueAt(row, colTenSP).toString();
        loaiSP = Integer.parseInt(tableModel.getValueAt(row, colLoaiSP).toString());
        giaSP = Double.parseDouble(tableModel.getValueAt(row, colGiaSP).toString());

        // chọn xong nhập thông tin trên form
        cboLoaiSanPham.setSelectedIndex(loaiSP);
        txtTenSanPham.setText(tenSP);
        txtGiaSanPham.setText(giaSP + "");
    }//GEN-LAST:event_tblHienThiMouseClicked

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
            java.util.logging.Logger.getLogger(frmAdminSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdminSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdminSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdminSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdminSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLoaiSanPham;
    private javax.swing.JComboBox<String> cboTieuChi;
    private javax.swing.JCheckBox ckbSearch1;
    private javax.swing.JPanel divButton;
    private javax.swing.JPanel divGiaTien;
    private javax.swing.JPanel divInfo;
    private javax.swing.JPanel divInput;
    private javax.swing.JPanel divLoaiSanPham;
    private javax.swing.JPanel divSearch;
    private javax.swing.JPanel divTable;
    private javax.swing.JPanel divTenSP;
    private javax.swing.JPanel divTitle;
    private javax.swing.JLabel lblGiaTien;
    private javax.swing.JLabel lblLoaiSanPham;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JScrollPane scrollSanPham;
    private javax.swing.JTable tblHienThi;
    private javax.swing.JTextField txtGiaSanPham;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables
}
