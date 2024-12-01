/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author Vicky Mahya Mafaza
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private String tahunTerbit;
    private String harga;
    private String kategori;
    
    public Buku(String judul, String pengarang, String isbn, String tahunTerbit, String harga, String kategori) throws ValidInputException {
        if (judul.isEmpty()) {
            throw new ValidInputException("Judul buku tidak boleh kosong!");
        }
        
        if (pengarang.isEmpty()) {
            throw new ValidInputException("Pengarang tidak boleh kosong!");
        }
        
        if (!isbn.matches("\\d{13}")) {
            throw new ValidInputException("ISBN harus 13 digit angka!");
        }
        
        if (!tahunTerbit.matches("\\d{4}")) {
            throw new ValidInputException("Tahun Terbit harus 4 digit angka!");
        }
        
        try {
            long hargaNumber = Long.parseLong(harga); // Ubah ISBN menjadi angka
            if (hargaNumber < 0) {
                throw new ValidInputException("Harga tidak boleh angka negatif!");
            }
        } catch (NumberFormatException e) {
            throw new ValidInputException("Input harus berupa angka!");
        }
        
        if (kategori == null || kategori.isEmpty()) {
            throw new ValidInputException("Kategori harus dipilih!");
        }
    
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.kategori = kategori;
    }
    
    public String getJudul() {
        return judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTahunTerbit() {
        return tahunTerbit;
    }
    public String getHarga() {
        return harga;
    }
    public String getKategori() {
        return kategori;
    }
}
