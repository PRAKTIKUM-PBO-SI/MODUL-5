/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Perpustakaan;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;


 * @author LENOVO
 */
public class InputBuku extends javax.swing.JFrame {

    
    public InputBuku() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        txtIsbn = new javax.swing.JTextField();
        BtnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txttahunTerbit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxKategori = new javax.swing.JComboBox<>();
        lblKeterangan = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Judul Buku");

        jLabel2.setText("Nama Pengarang");

        jLabel3.setText("No ISBN");

        BtnSubmit.setText("Tambah Data");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });

        jLabel4.setText("Tahun Terbit Buku");

        jLabel5.setText("Harga Buku");

        jLabel6.setText("Kategori Buku");

        cbxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { null, "Novel", "Komik", "Sejarah" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtJudul)
                    .addComponent(txtPengarang)
                    .addComponent(txtIsbn)
                    .addComponent(txttahunTerbit)
                    .addComponent(txtHarga)
                    .addComponent(cbxKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(BtnSubmit)
                .addGap(19, 19, 19))
        );

        lblKeterangan.setText("Keterangan");

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judul", "Pengarang", "ISBN", "Tahun", "Harga", "Kategori"
            }
        ));
        jScrollPane2.setViewportView(tblBuku);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblKeterangan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKeterangan)
                .addContainerGap())
        );

        pack();
    }

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {
        try {
                String judul = txtJudul.getText();
                String pengarang = txtPengarang.getText();
                String isbn = txtIsbn.getText();
                String tahunTerbit = txttahunTerbit.getText();
                String harga = txtHarga.getText();
                String kategori = (String) cbxKategori.getSelectedItem();
                
                
                Buku buku = new Buku(judul, pengarang, isbn, tahunTerbit, harga, kategori);
                
                
                DefaultTableModel data = (DefaultTableModel)
                tblBuku.getModel();
                data.addRow(new Object[]{buku.getJudul(),
                buku.getPengarang(), buku.getIsbn(),
                buku.getTahunTerbit(), buku.getHarga(),
                buku.getKategori()});
                
                
                txtJudul.setText("");
                txtPengarang.setText("");
                txtIsbn.setText("");
                txttahunTerbit.setText("");
                txtHarga.setText("");
                cbxKategori.setSelectedIndex(0);
                lblKeterangan.setForeground(Color.GREEN);
                lblKeterangan.setText("Buku berhasil ditambahkan!");
                
                } catch (ValidasiInputException e) {
                    lblKeterangan.setForeground(Color.RED);
                    lblKeterangan.setText("Error: " + e.getMessage());
                }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InputBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputBuku().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JComboBox<String> cbxKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblKeterangan;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txttahunTerbit;
    
}