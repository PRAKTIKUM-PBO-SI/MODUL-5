/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TigrisYedijaMaarende
 */
public class InputData extends javax.swing.JFrame {

    /**
     * Creates new form InputData
     */
    public InputData() {
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
        textJudul = new javax.swing.JLabel();
        textPengarang = new javax.swing.JLabel();
        textISBN = new javax.swing.JLabel();
        JudulBuku = new javax.swing.JTextField();
        Pengarang = new javax.swing.JTextField();
        ISBN = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        textKeterangan = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();
        TahunTerbit = new javax.swing.JTextField();
        textTahunTerbit = new javax.swing.JLabel();
        HargaBuku = new javax.swing.JTextField();
        KategoriBuku = new javax.swing.JTextField();
        textHargaBuku = new javax.swing.JLabel();
        textKategoriBuku = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textJudul.setText("Judul Buku");

        textPengarang.setText("Pengarang");

        textISBN.setText("No ISBN");

        JudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JudulBukuActionPerformed(evt);
            }
        });

        Pengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PengarangActionPerformed(evt);
            }
        });

        ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        textKeterangan.setText("Keterangan");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judul Buku", "Pengarang", "No ISBN", "Tahun Terbit", "Harga Buku", "Kategori Buku"
            }
        ));
        jScrollPane1.setViewportView(tableBuku);

        TahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TahunTerbitActionPerformed(evt);
            }
        });

        textTahunTerbit.setText("Tahun Terbit");

        HargaBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaBukuActionPerformed(evt);
            }
        });

        KategoriBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategoriBukuActionPerformed(evt);
            }
        });

        textHargaBuku.setText("Harga Buku");

        textKategoriBuku.setText("Kategori Buku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textKeterangan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textISBN)
                                    .addComponent(textPengarang)
                                    .addComponent(textTahunTerbit)
                                    .addComponent(textJudul)
                                    .addComponent(textHargaBuku)
                                    .addComponent(textKategoriBuku))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TahunTerbit)
                                    .addComponent(ISBN)
                                    .addComponent(Pengarang)
                                    .addComponent(JudulBuku)
                                    .addComponent(HargaBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(KategoriBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(btnTambah)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textJudul)
                    .addComponent(JudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPengarang)
                    .addComponent(Pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textISBN)
                    .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTahunTerbit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textHargaBuku)
                    .addComponent(HargaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KategoriBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textKategoriBuku))
                .addGap(18, 18, 18)
                .addComponent(btnTambah)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textKeterangan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JudulBukuActionPerformed

    private void PengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PengarangActionPerformed

    private void ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
    // Mendapatkan input dari field
try {
    String judul = JudulBuku.getText().trim();
    String pengarang = Pengarang.getText().trim();
    String isbn = ISBN.getText().trim();

    // Validasi input tidak boleh kosong
    if (judul.isEmpty() || pengarang.isEmpty() || isbn.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Semua data harus diisi!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validasi ISBN harus 13 digit angka
    if (!isbn.matches("\\d{13}")) {
        javax.swing.JOptionPane.showMessageDialog(this, "ISBN harus berupa 13 digit angka!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Tambahkan data ke tabel
    DefaultTableModel data = (DefaultTableModel) tableBuku.getModel();
    data.addRow(new Object[]{judul, pengarang, isbn});

    // Kosongkan kembali input setelah data ditambahkan
    JudulBuku.setText("");
    Pengarang.setText("");
    ISBN.setText("");

    // Tampilkan pesan sukses
    textKeterangan.setForeground(Color.GREEN);
    textKeterangan.setText("Buku berhasil ditambahkan!");
} catch (HeadlessException e) {
    textKeterangan.setForeground(Color.RED);
    textKeterangan.setText("Error: " + e.getMessage());
}


    }//GEN-LAST:event_btnTambahActionPerformed

    private void TahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TahunTerbitActionPerformed

   try {
    String judul = JudulBuku.getText().trim();
    String pengarang = Pengarang.getText().trim();
    String isbn = ISBN.getText().trim();
    String tahunTerbit = TahunTerbit.getText().trim();

    // Validasi input tidak boleh kosong
    if (judul.isEmpty() || pengarang.isEmpty() || isbn.isEmpty() || tahunTerbit.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Semua data harus diisi!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validasi ISBN harus 13 digit angka
    if (!isbn.matches("\\d{13}")) {
        javax.swing.JOptionPane.showMessageDialog(this, "ISBN harus berupa 13 digit angka!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validasi tahun terbit harus berupa angka dan berada dalam rentang wajar
    if (!tahunTerbit.matches("\\d{4}")) {
        javax.swing.JOptionPane.showMessageDialog(this, "Tahun terbit harus berupa 4 digit angka!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    int tahun = Integer.parseInt(tahunTerbit);
    if (tahun < 1500 || tahun > java.time.Year.now().getValue()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Tahun terbit harus berada antara 1500 hingga tahun saat ini!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Pastikan tabel memiliki kolom Tahun Terbit
    DefaultTableModel data = (DefaultTableModel) tableBuku.getModel();

    // Menambah data ke tabel
    data.addRow(new Object[]{judul, pengarang, isbn, tahunTerbit});

    // Kosongkan kembali input setelah data ditambahkan
    JudulBuku.setText("");
    Pengarang.setText("");
    ISBN.setText("");
    TahunTerbit.setText("");

    // Tampilkan pesan sukses
    textKeterangan.setForeground(Color.GREEN);
    textKeterangan.setText("Buku berhasil ditambahkan!");
} catch (HeadlessException | NumberFormatException e) {
    textKeterangan.setForeground(Color.RED);
    textKeterangan.setText("Error: " + e.getMessage());
}


    }//GEN-LAST:event_TahunTerbitActionPerformed

    private void HargaBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaBukuActionPerformed
    try {
    String hargaBuku = HargaBuku.getText().trim();

    // Validasi harga buku harus berupa angka
    if (hargaBuku.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Harga buku tidak boleh kosong!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!hargaBuku.matches("\\d+")) {
        javax.swing.JOptionPane.showMessageDialog(this, "Harga buku harus berupa angka positif!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    double harga = Double.parseDouble(hargaBuku);
    if (harga <= 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Harga buku harus lebih dari 0!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Tambahkan harga ke tabel
    DefaultTableModel data = (DefaultTableModel) tableBuku.getModel();
    data.addRow(new Object[]{hargaBuku});

    // Kosongkan kembali input setelah data ditambahkan
    HargaBuku.setText("");

    // Tampilkan pesan sukses
    textKeterangan.setForeground(Color.GREEN);
    textKeterangan.setText("Harga buku berhasil ditambahkan!");
} catch (HeadlessException | NumberFormatException e) {
    textKeterangan.setForeground(Color.RED);
    textKeterangan.setText("Error: " + e.getMessage());
}

    }//GEN-LAST:event_HargaBukuActionPerformed

    private void KategoriBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategoriBukuActionPerformed
        try {
    String kategoriBuku = KategoriBuku.getText().trim();

    // Validasi kategori buku tidak boleh kosong
    if (kategoriBuku.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Kategori buku tidak boleh kosong!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Tambahkan kategori ke tabel
    DefaultTableModel data = (DefaultTableModel) tableBuku.getModel();
    data.addRow(new Object[]{kategoriBuku});

    // Kosongkan kembali input setelah data ditambahkan
    KategoriBuku.setText("");

    // Tampilkan pesan sukses
    textKeterangan.setForeground(Color.GREEN);
    textKeterangan.setText("Kategori buku berhasil ditambahkan!");
} catch (HeadlessException e) {
    textKeterangan.setForeground(Color.RED);
    textKeterangan.setText("Error: " + e.getMessage());
}

    }//GEN-LAST:event_KategoriBukuActionPerformed

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
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HargaBuku;
    private javax.swing.JTextField ISBN;
    private javax.swing.JTextField JudulBuku;
    private javax.swing.JTextField KategoriBuku;
    private javax.swing.JTextField Pengarang;
    private javax.swing.JTextField TahunTerbit;
    private javax.swing.JButton btnTambah;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBuku;
    private javax.swing.JLabel textHargaBuku;
    private javax.swing.JLabel textISBN;
    private javax.swing.JLabel textJudul;
    private javax.swing.JLabel textKategoriBuku;
    private javax.swing.JLabel textKeterangan;
    private javax.swing.JLabel textPengarang;
    private javax.swing.JLabel textTahunTerbit;
    // End of variables declaration//GEN-END:variables
}
