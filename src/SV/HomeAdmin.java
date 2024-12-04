/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SV;

import Controllers.DiemControler;
import Controllers.HocphiController;
import Controllers.LoginAdminController;
import Controllers.StudentController;
import Controllers.XepLoaiController;
import Model.admin;
import Model.diem;
import Model.hocphi;
import Model.sinhvien;
import Model.xeploai;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIT
 */
public class HomeAdmin extends javax.swing.JFrame {

    /**
     * Creates new form HomeAdmin
     */
    DefaultTableModel tableModel;
    java.util.List<sinhvien> sinhvienList = new ArrayList<>();
    DefaultTableModel tableModel1;
    java.util.List<hocphi> hocphiList = new ArrayList<>();
    DefaultTableModel tableModel2;
    java.util.List<diem> diemList = new ArrayList<>();
    DefaultTableModel tableModel3;
    java.util.List<xeploai> xeploaiList = new ArrayList<>();
    DefaultTableModel tableModel4;
    java.util.List<admin> adminList = new ArrayList<>();

    private String MaSinhVien;

    private int id;
    private String Username, Password, Quyen, Hoten, Email;

    public HomeAdmin() {
        initComponents();
    }

    public HomeAdmin(String Username, String Password, String Quyen, String Hoten, String Email, int id) {
        initComponents();

        getContentPane().setBackground(Color.WHITE);
        tableModel = (DefaultTableModel) tbSinhVien.getModel();
        showSinhVien();
        tableModel1 = (DefaultTableModel) tbHocPhi.getModel();
        showHocPhi();
        tableModel2 = (DefaultTableModel) tbDiem.getModel();
        showDiem();
        tableModel3 = (DefaultTableModel) tbXepLoai.getModel();
        showXepLoai();
        tableModel4 = (DefaultTableModel) tbAdmin.getModel();
        showAdmin();

        this.Username = Username;
        this.Password = Password;
        this.Quyen = Quyen;
        this.Hoten = Hoten;
        this.Email = Email;
        this.id = id;
        this.Password = Password;

        this.txtTaiKhoan.setText(Username);
        this.txtQuyen.setText(Quyen);
        this.txtHoTenAM.setText(Hoten);
        this.txtEmailAM.setText(Email);

        this.txtTaiKhoan.setEnabled(false);
        this.txtQuyen.setEnabled(false);
        this.txtHoTenAM.setEnabled(false);
        this.txtEmailAM.setEnabled(false);
        this.btnLuuAM.setVisible(false);

        this.txtPassAM2.setEnabled(false);
        this.txtNewPassAM2.setEnabled(false);
        this.txtAgainPassAM2.setEnabled(false);
        this.btnLuuDoiMatKhauAM1.setVisible(false);

        this.txtId.setVisible(false);
        if ("phongCTSV".equals(Quyen)) {
            jPanel7.setVisible(false);
        }
    }

    private void showSinhVien() {
        sinhvienList = StudentController.findAll();

        tableModel.setRowCount(0);

        sinhvienList.forEach((sinhvien) -> {
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, sinhvien.getMaSinhVien(),
                sinhvien.getHoTen(), sinhvien.getNamSinh(), sinhvien.getQueQuan(), sinhvien.getGioiTinh(),
                sinhvien.getEmail(), sinhvien.getSDT()});
        });
    }

    private void showHocPhi() {
        hocphiList = HocphiController.all();

        tableModel1.setRowCount(0);

        hocphiList.forEach((hocphi) -> {
            tableModel1.addRow(new Object[]{tableModel1.getRowCount() + 1, hocphi.getMaHocPhi(),
                hocphi.getHocKi(), hocphi.getNamHoc(), hocphi.getTongTien(), hocphi.getTrangThai(),
                hocphi.getMaSinhVien()});
        });
    }

    private void showDiem() {
        diemList = DiemControler.all();

        tableModel2.setRowCount(0);

        diemList.forEach((diem) -> {
            tableModel2.addRow(new Object[]{tableModel2.getRowCount() + 1, diem.getMaMonHoc(),
                diem.getTenMon(), diem.getDiemCC(), diem.getDiemGK(), diem.getDiemCK(),
                diem.getMaSinhVien()});
        });
    }

    private void showXepLoai() {
        xeploaiList = XepLoaiController.all();

        tableModel3.setRowCount(0);

        xeploaiList.forEach((xeploai) -> {
            tableModel3.addRow(new Object[]{tableModel3.getRowCount() + 1, xeploai.getMaXepLoai(), xeploai.getMaSinhVien(),
                xeploai.getHocKy(), xeploai.getNamHoc(), xeploai.getXepLoai()});
        });
    }

    private void showAdmin() {
        adminList = LoginAdminController.findAll();

        tableModel4.setRowCount(0);

        adminList.forEach((admin) -> {
            tableModel4.addRow(new Object[]{tableModel4.getRowCount() + 1, admin.getUsername(), admin.getPassword(),
                admin.getQuyen(), admin.getHoTen(), admin.getEmail(), admin.getId()});
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbe_Admin1 = new SV.Tabbe_Admin();
        tabbe_Admin2 = new SV.Tabbe_Admin();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSinhVien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaSinhVien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNamSinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQueQuan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbHocPhi = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMaHocPhi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMSVHP = new javax.swing.JTextField();
        btnThem1 = new javax.swing.JButton();
        btnSua1 = new javax.swing.JButton();
        btnXoa1 = new javax.swing.JButton();
        btnTimKiem1 = new javax.swing.JButton();
        cbNamHoc = new javax.swing.JComboBox<>();
        cbHocKi = new javax.swing.JComboBox<>();
        cbTrangThai = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbDiem = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtMaHocPhan = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtTenHocPhan = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtMSVDiem = new javax.swing.JTextField();
        btnThem3 = new javax.swing.JButton();
        btnSua3 = new javax.swing.JButton();
        btnXoa3 = new javax.swing.JButton();
        btnTimKiem3 = new javax.swing.JButton();
        txtDiemCC = new javax.swing.JTextField();
        txtDiemGK = new javax.swing.JTextField();
        txtDiemCK = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbXepLoai = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMaSinhVien2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnThem2 = new javax.swing.JButton();
        btnSua2 = new javax.swing.JButton();
        btnXoa2 = new javax.swing.JButton();
        btnTimKiem2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtMaXepLoai = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbAdmin = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtTaiKhoanDNAM = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtMatKhauDNAM = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        btnThemAM = new javax.swing.JButton();
        btnSuaAM = new javax.swing.JButton();
        btnXoaAM = new javax.swing.JButton();
        btnTimKiemAM = new javax.swing.JButton();
        txtHoTenDNAM = new javax.swing.JTextField();
        txtEmailDNAM = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        txtQuyen = new javax.swing.JTextField();
        txtHoTenAM = new javax.swing.JTextField();
        txtEmailAM = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        btnLuuAM = new javax.swing.JButton();
        btnCapNhatAM = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtNewPassAM2 = new javax.swing.JPasswordField();
        txtAgainPassAM2 = new javax.swing.JPasswordField();
        txtPassAM2 = new javax.swing.JPasswordField();
        btnDoiMatKhauAM = new javax.swing.JButton();
        btnLuuDoiMatKhauAM1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbe_Admin2.setBackground(new java.awt.Color(255, 255, 255));
        tabbe_Admin2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sinh viên", "Họ tên", "Năm sinh", "Quê quán", "Giới tính", "Email", "Số điện thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSinhVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSinhVien);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 705, 606));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Thông tin");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 6, -1, -1));

        jLabel3.setText("Mã sinh viên");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 37, 77, -1));
        jPanel3.add(txtMaSinhVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 59, 228, 28));

        jLabel4.setText("Họ tên");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 93, 37, -1));
        jPanel3.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 115, 228, 28));

        jLabel5.setText("Năm sinh");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 149, -1, -1));
        jPanel3.add(txtNamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 171, 228, 28));

        jLabel6.setText("Quê quán");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 205, 60, -1));
        jPanel3.add(txtQueQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 227, 228, 28));

        jLabel7.setText("Giới tính");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 261, 59, -1));

        jLabel8.setText("Email");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 317, 37, -1));
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 339, 228, 28));
        jPanel3.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 395, 228, 31));

        jLabel9.setText("Số điện thoại");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 373, 80, -1));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel3.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 524, 80, -1));

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 524, 79, -1));

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel3.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 565, 80, -1));

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel3.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 565, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 283, 228, 28));

        tabbe_Admin2.addTab("Sinh Viên", jPanel3);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbHocPhi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã học phí", "Học kì", "Năm học", "Tổng tiền", "Trạng thái", "Mã sinh viên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHocPhi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHocPhiMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbHocPhi);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 705, 606));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Thông tin");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 6, -1, -1));

        jLabel11.setText("Mã học phí");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 37, 77, -1));
        jPanel7.add(txtMaHocPhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 59, 228, 28));

        jLabel12.setText("Học kì");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 93, 37, -1));

        jLabel13.setText("Năm học");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 149, -1, -1));

        jLabel14.setText("Tổng tiền");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 205, 60, -1));
        jPanel7.add(txtTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 227, 228, 28));

        jLabel15.setText("Trạng thái");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 261, 59, -1));

        jLabel16.setText("Mã sinh viên");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 317, -1, -1));
        jPanel7.add(txtMSVHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 339, 228, 28));

        btnThem1.setText("Thêm");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnThem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 524, 80, -1));

        btnSua1.setText("Sửa");
        btnSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnSua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 524, 79, -1));

        btnXoa1.setText("Xóa");
        btnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnXoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 565, 80, -1));

        btnTimKiem1.setText("Tìm kiếm");
        btnTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiem1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnTimKiem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 565, -1, -1));

        cbNamHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023" }));
        jPanel7.add(cbNamHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 171, 228, 28));

        cbHocKi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        jPanel7.add(cbHocKi, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 115, 228, 28));

        cbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã Nộp", "Chưa Nộp" }));
        jPanel7.add(cbTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 283, 228, 28));

        tabbe_Admin2.addTab("Học phí", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã học phần", "Tên môn", "Điểm CC", "Điểm GK", "Điểm CK", "Mã sinh viên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDiemMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbDiem);

        jPanel9.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 705, 606));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Thông tin");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 6, -1, -1));

        jLabel27.setText("Mã học phần");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 37, 77, -1));

        txtMaHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHocPhanActionPerformed(evt);
            }
        });
        jPanel9.add(txtMaHocPhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 59, 228, 28));

        jLabel28.setText("Tên học phần");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 93, -1, -1));
        jPanel9.add(txtTenHocPhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 115, 228, 28));

        jLabel29.setText("Điểm CC");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 149, -1, -1));

        jLabel30.setText("Điểm GK");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 205, 60, -1));

        jLabel31.setText("Điểm CK");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 261, 59, -1));

        jLabel32.setText("Mã sinh viên");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 317, 79, -1));
        jPanel9.add(txtMSVDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 339, 228, 28));

        btnThem3.setText("Thêm");
        btnThem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem3ActionPerformed(evt);
            }
        });
        jPanel9.add(btnThem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 524, 80, -1));

        btnSua3.setText("Sửa");
        btnSua3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua3ActionPerformed(evt);
            }
        });
        jPanel9.add(btnSua3, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 524, 79, -1));

        btnXoa3.setText("Xóa");
        btnXoa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa3ActionPerformed(evt);
            }
        });
        jPanel9.add(btnXoa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 565, 80, -1));

        btnTimKiem3.setText("Tìm kiếm");
        btnTimKiem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiem3ActionPerformed(evt);
            }
        });
        jPanel9.add(btnTimKiem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 565, -1, -1));
        jPanel9.add(txtDiemCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 171, 228, 28));
        jPanel9.add(txtDiemGK, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 227, 228, 28));
        jPanel9.add(txtDiemCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 283, 228, 28));

        tabbe_Admin2.addTab("Điểm", jPanel9);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbXepLoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã xếp loại", "Mã sinh viên", "Học kì", "Năm học", "Xếp loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbXepLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbXepLoaiMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbXepLoai);

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 707, 606));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Thông tin");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 6, -1, -1));

        jLabel19.setText("Mã sinh viên");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 90, 77, -1));
        jPanel8.add(txtMaSinhVien2, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 112, 228, 28));

        jLabel20.setText("Học kì");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 146, 37, -1));

        jLabel21.setText("Năm Học");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 202, -1, -1));

        jLabel22.setText("Xếp Loại");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 258, 60, -1));

        btnThem2.setText("Thêm");
        btnThem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem2ActionPerformed(evt);
            }
        });
        jPanel8.add(btnThem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 524, 80, -1));

        btnSua2.setText("Sửa");
        btnSua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua2ActionPerformed(evt);
            }
        });
        jPanel8.add(btnSua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 524, 79, -1));

        btnXoa2.setText("Xóa");
        btnXoa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa2ActionPerformed(evt);
            }
        });
        jPanel8.add(btnXoa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 565, 80, -1));

        btnTimKiem2.setText("Tìm kiếm");
        btnTimKiem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiem2ActionPerformed(evt);
            }
        });
        jPanel8.add(btnTimKiem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 565, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        jPanel8.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 168, 228, 28));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 224, 228, 28));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yếu", "Trung bình", "Khá ", "Giỏi" }));
        jPanel8.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 286, 228, 28));

        jLabel23.setText("Mã xếp loại");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 37, 77, -1));
        jPanel8.add(txtMaXepLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 59, 228, 28));

        tabbe_Admin2.addTab("Xếp loại", jPanel8);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tài khoản", "Mật khẩu", "Quyền", "Họ Tên", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAdminMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tbAdmin);

        jPanel13.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 705, 590));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setText("Thông tin");
        jPanel13.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 6, -1, -1));

        jLabel49.setText("Tài khoản");
        jPanel13.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 37, 77, -1));

        txtTaiKhoanDNAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanDNAMActionPerformed(evt);
            }
        });
        jPanel13.add(txtTaiKhoanDNAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 59, 228, 28));

        jLabel50.setText("Mật khẩu");
        jPanel13.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 93, -1, -1));
        jPanel13.add(txtMatKhauDNAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 115, 228, 28));

        jLabel51.setText("Quyền");
        jPanel13.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 149, -1, -1));

        jLabel52.setText("Họ Tên");
        jPanel13.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 205, 60, -1));

        jLabel53.setText("Email");
        jPanel13.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 261, 59, -1));

        btnThemAM.setText("Thêm");
        btnThemAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemAMActionPerformed(evt);
            }
        });
        jPanel13.add(btnThemAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 508, 80, -1));

        btnSuaAM.setText("Sửa");
        btnSuaAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaAMActionPerformed(evt);
            }
        });
        jPanel13.add(btnSuaAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 508, 79, -1));

        btnXoaAM.setText("Xóa");
        btnXoaAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaAMActionPerformed(evt);
            }
        });
        jPanel13.add(btnXoaAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 549, 80, -1));

        btnTimKiemAM.setText("Tìm kiếm");
        btnTimKiemAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemAMActionPerformed(evt);
            }
        });
        jPanel13.add(btnTimKiemAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 549, -1, -1));
        jPanel13.add(txtHoTenDNAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 227, 228, 28));
        jPanel13.add(txtEmailDNAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 283, 228, 28));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin ", "phongCTSV" }));
        jPanel13.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 171, 228, 28));
        jPanel13.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 329, 71, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 957, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabbe_Admin2.addTab("Tài khoản", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setText("Tài khoản");

        jLabel33.setText("Quyền");

        jLabel34.setText("Họ tên");

        jLabel35.setText("Email");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel36.setText("Thông tin tài khoản");

        btnLuuAM.setText("Lưu");
        btnLuuAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuAMActionPerformed(evt);
            }
        });

        btnCapNhatAM.setText("Cập nhật");
        btnCapNhatAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatAMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLuuAM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhatAM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel36))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(txtQuyen)
                            .addComponent(txtHoTenAM)
                            .addComponent(txtEmailAM))))
                .addGap(73, 73, 73))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel36)
                .addGap(92, 92, 92)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel24))
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTenAM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailAM, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnCapNhatAM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLuuAM)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbe_Admin2.addTab("Thông tin", jPanel4);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel41.setText("Đổi mật khẩu");

        jLabel42.setText("Mật khẩu");

        jLabel43.setText("Mật khẩu mới");

        jLabel44.setText("Nhập lại");

        btnDoiMatKhauAM.setText("Đổi mật khẩu");
        btnDoiMatKhauAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauAMActionPerformed(evt);
            }
        });

        btnLuuDoiMatKhauAM1.setText("Lưu");
        btnLuuDoiMatKhauAM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuDoiMatKhauAM1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(159, 159, 159))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNewPassAM2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(txtAgainPassAM2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnLuuDoiMatKhauAM1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDoiMatKhauAM, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(txtPassAM2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))))
                        .addGap(85, 85, 85))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel41)
                .addGap(76, 76, 76)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassAM2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtNewPassAM2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgainPassAM2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(btnDoiMatKhauAM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLuuDoiMatKhauAM1)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbe_Admin2.addTab("Đổi mật khẩu", jPanel10);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_export_50px.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(348, 348, 348)
                .addComponent(jLabel17)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbe_Admin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbe_Admin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public boolean isEmptyHocPhi() {
        if (txtMaHocPhi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã học phí", "Warning", 2);
            return false;
        }
        if (txtTongTien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập tổng tiền", "Warning", 2);
            return false;
        }
        if (txtMSVHP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã sinh viên", "Warning", 2);
            return false;
        }

        return true;
    }

    public boolean isEmptyAdmin() {
        if (txtTaiKhoanDNAM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên tài khoản", "Warning", 2);
            return false;
        }
        if (txtMatKhauDNAM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mật khẩu", "Warning", 2);
            return false;
        }
        if (txtHoTenDNAM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập họ tên", "Warning", 2);
            return false;
        }
        if (txtEmailDNAM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập Email", "Warning", 2);
            return false;
        }
        return true;
    }

    public boolean isEmptydiem() {
        if (txtMaHocPhan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã học phần", "Warning", 2);
            return false;
        }
        if (txtTenHocPhan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên học phần", "Warning", 2);
            return false;
        }
        if (txtDiemCC.getText().isEmpty() && Integer.parseInt(txtDiemCC.getText()) > 10) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập điểm chuyên cần hoặc sai định dạng điểm chuyên cần", "Warning", 2);
            return false;
        }
        if (txtDiemGK.getText().isEmpty() && Integer.parseInt(txtDiemGK.getText()) > 10) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập điểm giữa kìhoặc sai định dạng điểm giữa kì", "Warning", 2);
            return false;
        }
        if (txtDiemCK.getText().isEmpty() && Integer.parseInt(txtDiemCK.getText()) > 10) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập điểm cuối kìhoặc sai định dạng điểm cuối kì", "Warning", 2);
            return false;
        }
        if (txtMSVDiem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã sinh viên", "Warning", 2);
            return false;
        }
        return true;
    }
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void btnTimKiem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiem2ActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Nhập mã sinh viên cần tìm kiếm");
        if (input != null && input.length() > 0) {
            xeploaiList = XepLoaiController.findByFullname(input);

            tableModel3.setRowCount(0);

            xeploaiList.forEach((xeploai) -> {
                tableModel3.addRow(new Object[]{xeploai.getMaXepLoai(), xeploai.getMaSinhVien(),
                    xeploai.getHocKy(), xeploai.getNamHoc(), xeploai.getXepLoai()});
            });
        } else {
            showXepLoai();
        }
    }//GEN-LAST:event_btnTimKiem2ActionPerformed

    private void btnXoa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa2ActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tbXepLoai.getSelectedRow();
        if (selectedIndex >= 0) {
            xeploai std = xeploaiList.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa thông tin xếp loại này không?");
            System.out.println("option : " + option);

            if (option == 0) {
                XepLoaiController.delete(std.getMaXepLoai());

                showXepLoai();
            }
        }
    }//GEN-LAST:event_btnXoa2ActionPerformed

    private void btnSua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua2ActionPerformed
        // TODO add your handling code here:
        if (isEmptyXepLoai() == true) {
            String MaXepLoai = txtMaXepLoai.getText();
            String MaSinhVien = txtMaSinhVien2.getText();
            String HocKi = jComboBox2.getSelectedItem().toString();
            String NamHoc = jComboBox3.getSelectedItem().toString();
            String TrangThai = jComboBox4.getSelectedItem().toString();
            txtMaSinhVien2.setEnabled(true);
            btnThem2.setVisible(true);

            try {
                xeploai std = new xeploai(MaXepLoai, MaSinhVien, HocKi, NamHoc, TrangThai);
                XepLoaiController.update(std);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi update");
            }
            showXepLoai();
            txtMaXepLoai.setText("");
            txtMaSinhVien2.setText("");
            jComboBox2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);
            jComboBox4.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnSua2ActionPerformed

    private void btnThem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem2ActionPerformed
        // TODO add your handling code here:
        if (isEmptyXepLoai() == true) {
            String MaXepLoai = txtMaXepLoai.getText();
            String MaSinhVien = txtMaSinhVien2.getText();
            String HocKi = jComboBox2.getSelectedItem().toString();
            String NamHoc = jComboBox3.getSelectedItem().toString();
            String XepLoai = jComboBox4.getSelectedItem().toString();
            txtMaSinhVien2.setEnabled(true);

            xeploai std = new xeploai(MaXepLoai, MaSinhVien, HocKi, NamHoc, XepLoai);

            XepLoaiController.insert(std);

            showXepLoai();
            txtMaXepLoai.setText("");
            txtMaSinhVien2.setText("");
            jComboBox2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);
            jComboBox4.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnThem2ActionPerformed

    private void tbXepLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbXepLoaiMouseClicked
        // TODO add your handling code here:
        tableModel3 = (DefaultTableModel) tbXepLoai.getModel();
        int selectedIndex = tbXepLoai.getSelectedRow();
        xeploai sv = xeploaiList.get(selectedIndex);
        txtMaXepLoai.setEnabled(false);
        txtMaXepLoai.setText(sv.getMaXepLoai());
        txtMaSinhVien2.setText(sv.getMaSinhVien());
        jComboBox2.setSelectedItem(sv.getHocKy());
        jComboBox3.setSelectedItem(sv.getNamHoc());
        jComboBox4.setSelectedItem(sv.getXepLoai());
        btnThem2.setVisible(false);
    }//GEN-LAST:event_tbXepLoaiMouseClicked

    private void btnTimKiem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiem3ActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Nhập mã môn học cần tìm kiếm");
        if (input != null && input.length() > 0) {
            diemList = DiemControler.findByFullname(input);

            tableModel2.setRowCount(0);

            diemList.forEach((diem) -> {
                tableModel2.addRow(new Object[]{diem.getMaMonHoc(),
                    diem.getTenMon(), diem.getDiemCC(), diem.getDiemGK(), diem.getDiemCK(),
                    diem.getMaSinhVien()});
            });
        } else {
            showDiem();
        }
    }//GEN-LAST:event_btnTimKiem3ActionPerformed

    private void btnXoa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa3ActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tbDiem.getSelectedRow();
        if (selectedIndex >= 0) {
            diem std = diemList.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa thông tin điểm học phần này không?");
            System.out.println("option : " + option);

            if (option == 0) {
                DiemControler.delete(std.getMaMonHoc());

                showDiem();
            }
        }
    }//GEN-LAST:event_btnXoa3ActionPerformed

    private void btnSua3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua3ActionPerformed
        // TODO add your handling code here:
        if (isEmptydiem() == true) {
            String MaHocPhan = txtMaHocPhan.getText();
            String TenHocPhan = txtTenHocPhan.getText();
            int DiemCC = Integer.parseInt(txtDiemCC.getText());
            int DiemGK = Integer.parseInt(txtDiemGK.getText());
            int DiemCK = Integer.parseInt(txtDiemCK.getText());
            String MSVDiem = txtMSVDiem.getText();
            txtMaHocPhan.setEnabled(true);
            btnThem3.setVisible(true);

            try {
                diem std = new diem(MaHocPhan, TenHocPhan, DiemCC, DiemGK, DiemCK, MSVDiem);
                DiemControler.update(std);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi update");
            }
            showDiem();
            txtMaHocPhan.setText("");
            txtDiemCC.setText("");
            txtDiemGK.setText("");
            txtTenHocPhan.setText("");
            txtDiemCK.setText("");
            txtMSVDiem.setText("");
        }
    }//GEN-LAST:event_btnSua3ActionPerformed

    private void btnThem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem3ActionPerformed
        // TODO add your handling code here:
        if (isEmptydiem() == true) {
            String MaHocPhan = txtMaHocPhan.getText();
            String TenHocPhan = txtTenHocPhan.getText();
            int DiemCC = Integer.parseInt(txtDiemCC.getText());
            int DiemGK = Integer.parseInt(txtDiemGK.getText());
            int DiemCK = Integer.parseInt(txtDiemCK.getText());
            String MSVDiem = txtMSVDiem.getText();
            txtMaHocPhan.setEnabled(true);

            diem std = new diem(MaHocPhan, TenHocPhan, DiemCC, DiemGK, DiemCK, MSVDiem);

            DiemControler.insert(std);

            showDiem();
            txtMaHocPhan.setText("");
            txtDiemCC.setText("");
            txtDiemGK.setText("");
            txtTenHocPhan.setText("");
            txtDiemCK.setText("");
            txtMSVDiem.setText("");
        }
    }//GEN-LAST:event_btnThem3ActionPerformed

    private void txtMaHocPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHocPhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHocPhanActionPerformed

    private void tbDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDiemMouseClicked
        // TODO add your handling code here:
        tableModel2 = (DefaultTableModel) tbDiem.getModel();
        int selectedIndex = tbDiem.getSelectedRow();
        diem diem = diemList.get(selectedIndex);
        txtMaHocPhan.setEnabled(false);
        txtMaHocPhan.setText(diem.getMaMonHoc());
        txtTenHocPhan.setText(diem.getTenMon());
        txtDiemCC.setText(diem.getDiemCC() + "");
        txtDiemGK.setText(diem.getDiemGK() + "");
        txtDiemCK.setText(diem.getDiemCK() + "");
        txtMSVDiem.setText(diem.getMaSinhVien());
        btnThem3.setVisible(false);
    }//GEN-LAST:event_tbDiemMouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseClicked

    private void btnTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiem1ActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Nhập mã học phí cần tìm kiếm");
        if (input != null && input.length() > 0) {
            hocphiList = HocphiController.findByFullname(input);

            tableModel1.setRowCount(0);

            hocphiList.forEach((hocphi) -> {
                tableModel1.addRow(new Object[]{hocphi.getMaHocPhi(),
                    hocphi.getHocKi(), hocphi.getNamHoc(), hocphi.getTongTien(), hocphi.getTrangThai(),
                    hocphi.getMaSinhVien()});
            });
        } else {
            showHocPhi();
        }
    }//GEN-LAST:event_btnTimKiem1ActionPerformed

    private void btnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1ActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tbHocPhi.getSelectedRow();
        if (selectedIndex >= 0) {
            hocphi std = hocphiList.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa thông tin học phí này không?");
            System.out.println("option : " + option);

            if (option == 0) {
                HocphiController.delete(std.getMaHocPhi());

                showHocPhi();
            }
        }
    }//GEN-LAST:event_btnXoa1ActionPerformed

    private void btnSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua1ActionPerformed
        // TODO add your handling code here:
        if (isEmptyHocPhi() == true) {
            String MaHocPhi = txtMaHocPhi.getText();
            String HocKi = cbHocKi.getSelectedItem().toString();
            String NamHoc = cbNamHoc.getSelectedItem().toString();
            int TongTien = Integer.parseInt(txtTongTien.getText());
            String TrangThai = cbTrangThai.getSelectedItem().toString();
            String MSVHP = txtMSVHP.getText();
            txtMaHocPhi.setEnabled(true);
            btnThem1.setVisible(true);

            try {
                hocphi std = new hocphi(MaHocPhi, HocKi, NamHoc, TongTien, TrangThai, MaSinhVien);
                HocphiController.update(std);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi update");
            }
            showHocPhi();
            txtMaHocPhi.setText("");
            cbHocKi.setSelectedIndex(0);
            cbNamHoc.setSelectedIndex(0);
            txtTongTien.setText("");
            cbTrangThai.setSelectedIndex(0);
            txtMSVHP.setText("");
        }
    }//GEN-LAST:event_btnSua1ActionPerformed

//    public boolean checkMSV(){
//        sinhvien sv = LoginUserController.login(MaSinhVien, Password);
//                String HoTen1 = sv.getHoTen();
//                String NamSinh1 = sv.getNamSinh();
//                String QueQuan1 = sv.getQueQuan();
//                String GioiTinh1 = sv.getGioiTinh();
//                String Email1 = sv.getEmail();
//                int SDT1 = sv.getSDT();
//        if()
//        return true;
//    }
    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
        if (isEmptyHocPhi() == true) {
            String MaHocPhi = txtMaHocPhi.getText();
            String HocKi = cbHocKi.getSelectedItem().toString();
            String NamHoc = cbNamHoc.getSelectedItem().toString();
            int TongTien = Integer.parseInt(txtTongTien.getText());
            String TrangThai = cbTrangThai.getSelectedItem().toString();
            String MaSinhVien = txtMSVHP.getText();
            txtMaHocPhi.enable(true);

            hocphi std = new hocphi(MaHocPhi, HocKi, NamHoc, TongTien, TrangThai, MaSinhVien);

            HocphiController.insert(std);

            showHocPhi();
            txtMaHocPhi.setText("");
            cbHocKi.setSelectedIndex(0);
            cbNamHoc.setSelectedIndex(0);
            txtTongTien.setText("");
            cbTrangThai.setSelectedIndex(0);
            txtMSVHP.setText("");
        }
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void tbHocPhiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHocPhiMouseClicked
        // TODO add your handling code here:
        tableModel1 = (DefaultTableModel) tbHocPhi.getModel();
        int selectedIndex = tbHocPhi.getSelectedRow();
        hocphi sv = hocphiList.get(selectedIndex);
        txtMaHocPhi.setEnabled(false);
        txtMaHocPhi.setText(sv.getMaHocPhi());
        cbHocKi.setSelectedItem(sv.getHocKi());
        cbNamHoc.setSelectedItem(sv.getNamHoc());
        txtTongTien.setText(sv.getTongTien() + "");
        cbTrangThai.setSelectedItem(sv.getTrangThai());
        txtMSVHP.setText(sv.getMaSinhVien());
        btnThem1.setVisible(false);
    }//GEN-LAST:event_tbHocPhiMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Nhập họ tên cần tìm kiếm");
        if (input != null && input.length() > 0) {
            sinhvienList = StudentController.findByFullname(input);

            tableModel.setRowCount(0);

            sinhvienList.forEach((sinhvien) -> {
                tableModel.addRow(new Object[]{sinhvien.getMaSinhVien(),
                    sinhvien.getHoTen(), sinhvien.getNamSinh(), sinhvien.getQueQuan(), sinhvien.getGioiTinh(),
                    sinhvien.getEmail(), sinhvien.getSDT()});
            });
        } else {
            showSinhVien();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tbSinhVien.getSelectedRow();
        if (selectedIndex >= 0) {
            sinhvien std = sinhvienList.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa thông tin sinh viên này không?");
            System.out.println("option : " + option);

            if (option == 0) {
                StudentController.delete(std.getMaSinhVien());

                showSinhVien();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        MaSinhVien = txtMaSinhVien.getText();
        String HoTen = txtHoTen.getText();
        String NamSinh = txtNamSinh.getText();
        String QueQuan = txtQueQuan.getText();
        String GioiTinh = jComboBox1.getSelectedItem().toString();
        String Email = txtEmail.getText();
        int SDT = Integer.parseInt(txtSDT.getText());
        txtMaSinhVien.setEnabled(true);
        btnThem.setVisible(true);
        //String Password = txtQueQuan.getText();

        //sinhvien std = new sinhvien(MaSinhVien, HoTen, NamSinh, QueQuan, GioiTinh, Email, SDT);
        try {
            sinhvien std = new sinhvien(MaSinhVien, HoTen, NamSinh, QueQuan, GioiTinh, Email, SDT);
            StudentController.update(std);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi update");
        }
        showSinhVien();
        txtMaSinhVien.setText("");
        txtHoTen.setText("");
        txtNamSinh.setText("");
        txtQueQuan.setText("");
        jComboBox1.setSelectedIndex(0);
        txtEmail.setText("");
        txtSDT.setText("");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String MaSinhVien = txtMaSinhVien.getText();
        String HoTen = txtHoTen.getText();
        String NamSinh = txtNamSinh.getText();
        String QueQuan = txtQueQuan.getText();
        String GioiTinh = jComboBox1.getSelectedItem().toString();
        String Email = txtEmail.getText();
        txtMaSinhVien.enable(true);
        int SDT = Integer.parseInt(txtSDT.getText());

        sinhvien std = new sinhvien(MaSinhVien, HoTen, NamSinh, QueQuan, GioiTinh, Email, SDT);

        StudentController.insert(std);

        showSinhVien();
        txtMaSinhVien.setText("");
        txtHoTen.setText("");
        txtNamSinh.setText("");
        txtQueQuan.setText("");
        //txtGioiTinh.setText("");
        jComboBox1.setSelectedIndex(0);
        txtEmail.setText("");
        txtSDT.setText("");
    }//GEN-LAST:event_btnThemActionPerformed

    private void tbSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSinhVienMouseClicked
        // TODO add your handling code here:
        tableModel = (DefaultTableModel) tbSinhVien.getModel();
        int selectedIndex = tbSinhVien.getSelectedRow();
        sinhvien sv = sinhvienList.get(selectedIndex);
        txtMaSinhVien.setEnabled(false);
        txtMaSinhVien.setText(sv.getMaSinhVien());
        txtHoTen.setText(sv.getHoTen());
        txtNamSinh.setText(sv.getNamSinh());
        txtEmail.setText(sv.getEmail());
        txtQueQuan.setText(sv.getQueQuan());
        //cbGioiTinh.setSelectedItem(sv.getGioiTinh());
        //txtGioiTinh.setText(sv.getGioiTinh());
        jComboBox1.setSelectedItem(sv.getGioiTinh());
        txtSDT.setText(sv.getSDT() + "");
        btnThem.setVisible(false);
    }//GEN-LAST:event_tbSinhVienMouseClicked

    private void btnCapNhatAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatAMActionPerformed
        // TODO add your handling code here:
        this.txtTaiKhoan.setEnabled(true);
        this.txtQuyen.setEnabled(false);
        this.txtHoTenAM.setEnabled(true);
        this.txtEmailAM.setEnabled(true);
        this.btnLuuAM.setVisible(true);
        this.btnCapNhatAM.setVisible(false);

        this.txtPassAM2.setEnabled(false);
        this.txtNewPassAM2.setEnabled(false);
        this.txtAgainPassAM2.setEnabled(false);
        this.btnLuuDoiMatKhauAM1.setVisible(false);
    }//GEN-LAST:event_btnCapNhatAMActionPerformed

    private void btnLuuAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuAMActionPerformed
        // TODO add your handling code here:
        if (isEmptyAM() == true) {
            String TaiKhoan = txtTaiKhoan.getText();
            String Quyen = txtQuyen.getText();
            String Hoten = txtHoTenAM.getText();
            String Email = txtEmailAM.getText();
            try {
                admin std = new admin(TaiKhoan, Password, Quyen, Hoten, Email, id);
                LoginAdminController.update(std);
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công");
//                int option = JOptionPane.showConfirmDialog(this, "Bạn cần đăng nhập lại để đồng bộ dữ liệu");
//                System.out.println("option : " + option);
//
//                if (option == 0) {
//                    java.awt.EventQueue.invokeLater(new Runnable() {
//                        public void run() {
//                            new DangNhap().setVisible(true);
//                        }
//                    });
//                    setVisible(false);
//                    dispose();
//                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi update");
            }
        }
        this.txtTaiKhoan.setEnabled(false);
        this.txtQuyen.setEnabled(false);
        this.txtHoTenAM.setEnabled(false);
        this.txtEmailAM.setEnabled(false);
        this.btnLuuAM.setVisible(false);
        this.btnCapNhatAM.setVisible(true);

        this.txtPassAM2.setEnabled(false);
        this.txtNewPassAM2.setEnabled(false);
        this.txtAgainPassAM2.setEnabled(false);
        this.btnLuuDoiMatKhauAM1.setVisible(false);
    }//GEN-LAST:event_btnLuuAMActionPerformed

    private void btnLuuDoiMatKhauAM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuDoiMatKhauAM1ActionPerformed
        // TODO add your handling code here:
        String Password = txtAgainPassAM2.getText();
        if (isEmptyDMK() == true) {
            try {
                admin std = new admin(Username, Password, Quyen, Hoten, Email, id);
                LoginAdminController.update(std);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, ERROR);
            }
            JOptionPane.showMessageDialog(rootPane, "Đôi mật khẩu thành công");
//            int option = JOptionPane.showConfirmDialog(this, "Xác nhận đổi mật khẩu");
//            System.out.println("option : " + option);
//            if (option == 0) {
//                this.setVisible(false);
//            }
        }
        this.txtPassAM2.setEnabled(false);
        this.txtNewPassAM2.setEnabled(false);
        this.txtAgainPassAM2.setEnabled(false);
        btnLuuDoiMatKhauAM1.setVisible(false);
        btnDoiMatKhauAM.setVisible(true);
    }//GEN-LAST:event_btnLuuDoiMatKhauAM1ActionPerformed

    private void btnDoiMatKhauAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauAMActionPerformed
        // TODO add your handling code here:
        this.txtPassAM2.setEnabled(true);
        this.txtNewPassAM2.setEnabled(true);
        this.txtAgainPassAM2.setEnabled(true);
        this.btnLuuDoiMatKhauAM1.setVisible(true);
        btnDoiMatKhauAM.setVisible(false);
    }//GEN-LAST:event_btnDoiMatKhauAMActionPerformed

    private void tbAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAdminMouseClicked
        // TODO add your handling code here:
        tableModel4 = (DefaultTableModel) tbAdmin.getModel();
        int selectedIndex = tbAdmin.getSelectedRow();
        admin sv = adminList.get(selectedIndex);
        //txtTaiKhoanDNAM.setEnabled(false);
        txtTaiKhoanDNAM.setText(sv.getUsername());
        txtMatKhauDNAM.setText(sv.getPassword());
        jComboBox5.setSelectedItem(sv.getQuyen());
        txtHoTenDNAM.setText(sv.getHoTen());
        txtEmailDNAM.setText(sv.getEmail());
        txtId.setText(sv.getId()+ "");
        btnThemAM.setVisible(false);
    }//GEN-LAST:event_tbAdminMouseClicked

    private void txtTaiKhoanDNAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanDNAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanDNAMActionPerformed

    private void btnThemAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemAMActionPerformed
        // TODO add your handling code here:
        if (isEmptyAdmin() == true) {
            String TaiKhoan = txtTaiKhoanDNAM.getText();
            String MatKhau = txtMatKhauDNAM.getText();
            String Quyen = jComboBox5.getSelectedItem().toString();
            String HoTen = txtHoTenDNAM.getText();
            String Email = txtEmailDNAM.getText();
            //int id = Integer.parseInt(txtId.getText());
            //txtMaSinhVien2.setEnabled(true);

            admin std = new admin(TaiKhoan, MatKhau, Quyen, HoTen, Email);

            LoginAdminController.insert(std);

            showAdmin();
            txtTaiKhoanDNAM.setText("");
            txtMatKhauDNAM.setText("");
            jComboBox5.setSelectedIndex(0);
            txtHoTenDNAM.setText("");
            txtEmailDNAM.setText("");
            txtId.setText("");
        }
    }//GEN-LAST:event_btnThemAMActionPerformed

    private void btnSuaAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaAMActionPerformed
        // TODO add your handling code here:
        if (isEmptyAdmin() == true) {
            String TaiKhoan = txtTaiKhoanDNAM.getText();
            String MatKhau = txtMatKhauDNAM.getText();
            String Quyen = jComboBox5.getSelectedItem().toString();
            String HoTen = txtHoTenDNAM.getText();
            String Email = txtEmailDNAM.getText();
            int id = Integer.parseInt(txtId.getText());
            txtMaSinhVien2.setEnabled(true);
            btnThemAM.setVisible(true);

            try {
                admin std = new admin(TaiKhoan, MatKhau, Quyen, HoTen, Email, id);
                LoginAdminController.update(std);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi update");
            }
            showAdmin();
            txtTaiKhoanDNAM.setText("");
            txtMatKhauDNAM.setText("");
            jComboBox5.setSelectedIndex(0);
            txtHoTenDNAM.setText("");
            txtEmailDNAM.setText("");
            txtId.setText("");
        }
    }//GEN-LAST:event_btnSuaAMActionPerformed

    private void btnXoaAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaAMActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tbAdmin.getSelectedRow();
        if (selectedIndex >= 0) {
            admin std = adminList.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa tài khoản này không?");
            System.out.println("option : " + option);

            if (option == 0) {
                LoginAdminController.delete(std.getId());

                showAdmin();
            }
        }
    }//GEN-LAST:event_btnXoaAMActionPerformed

    private void btnTimKiemAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemAMActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Nhập tài khoản cần tìm kiếm");
        if (input != null && input.length() > 0) {
            adminList = LoginAdminController.findByFullname(input);

            tableModel4.setRowCount(0);

            adminList.forEach((admin) -> {
                tableModel4.addRow(new Object[]{tableModel4.getRowCount() + 1, admin.getUsername(), admin.getPassword(),
                    admin.getQuyen(), admin.getHoTen(), admin.getEmail(), admin.getId()});
            });
        } else {
            showAdmin();
        }
    }//GEN-LAST:event_btnTimKiemAMActionPerformed
    public boolean isEmptyXepLoai() {
        if (txtMaSinhVien2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã sinh viên", "Warning", 2);
            return false;
        }
        if (txtMaXepLoai.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã Xếp loại", "Warning", 2);
            return false;
        }
        return true;
    }

    public boolean isEmptyAM() {
        if (txtTaiKhoan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập tài khoản", "Warning", 2);
            return false;
        }
        if (txtHoTenAM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập họ tên", "Warning", 2);
            return false;
        }
        if (txtEmailAM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập email", "Warning", 2);
            return false;
        }
        return true;
    }

    public boolean isEmptyDMK() {
        if (txtPassAM2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mật khẩu cũ", "Warning", 2);
            return false;
        }
        if ((txtPassAM2.getText() == null ? Password != null : !txtPassAM2.getText().equals(Password))) {
            JOptionPane.showMessageDialog(null, "Mật khẩu cũ không chính xác", "Warning", 2);
            return false;
        }
        if (txtNewPassAM2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mật khẩu mới", "Warning", 2);
            return false;
        }
        if (txtAgainPassAM2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập lại mật khẩu mới", "Warning", 2);
            return false;
        }
        if (txtNewPassAM2.getText() == null ? txtAgainPassAM2.getText() != null : !txtNewPassAM2.getText().equals(txtAgainPassAM2.getText())) {
            JOptionPane.showMessageDialog(null, "Nhập lại mật khẩu mới không trùng lặp, vui lòng nhập lại", "Warning", 2);
            return false;
        }

        return true;
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
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatAM;
    private javax.swing.JButton btnDoiMatKhauAM;
    private javax.swing.JButton btnLuuAM;
    private javax.swing.JButton btnLuuDoiMatKhauAM1;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSua1;
    private javax.swing.JButton btnSua2;
    private javax.swing.JButton btnSua3;
    private javax.swing.JButton btnSuaAM;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThem2;
    private javax.swing.JButton btnThem3;
    private javax.swing.JButton btnThemAM;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTimKiem1;
    private javax.swing.JButton btnTimKiem2;
    private javax.swing.JButton btnTimKiem3;
    private javax.swing.JButton btnTimKiemAM;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JButton btnXoa2;
    private javax.swing.JButton btnXoa3;
    private javax.swing.JButton btnXoaAM;
    private javax.swing.JComboBox<String> cbHocKi;
    private javax.swing.JComboBox<String> cbNamHoc;
    private javax.swing.JComboBox<String> cbTrangThai;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private SV.Tabbe_Admin tabbe_Admin1;
    private SV.Tabbe_Admin tabbe_Admin2;
    private javax.swing.JTable tbAdmin;
    private javax.swing.JTable tbDiem;
    private javax.swing.JTable tbHocPhi;
    private javax.swing.JTable tbSinhVien;
    private javax.swing.JTable tbXepLoai;
    private javax.swing.JPasswordField txtAgainPassAM2;
    private javax.swing.JTextField txtDiemCC;
    private javax.swing.JTextField txtDiemCK;
    private javax.swing.JTextField txtDiemGK;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailAM;
    private javax.swing.JTextField txtEmailDNAM;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtHoTenAM;
    private javax.swing.JTextField txtHoTenDNAM;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMSVDiem;
    private javax.swing.JTextField txtMSVHP;
    private javax.swing.JTextField txtMaHocPhan;
    private javax.swing.JTextField txtMaHocPhi;
    private javax.swing.JTextField txtMaSinhVien;
    private javax.swing.JTextField txtMaSinhVien2;
    private javax.swing.JTextField txtMaXepLoai;
    private javax.swing.JTextField txtMatKhauDNAM;
    private javax.swing.JTextField txtNamSinh;
    private javax.swing.JPasswordField txtNewPassAM2;
    private javax.swing.JPasswordField txtPassAM2;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtQuyen;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTaiKhoanDNAM;
    private javax.swing.JTextField txtTenHocPhan;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
