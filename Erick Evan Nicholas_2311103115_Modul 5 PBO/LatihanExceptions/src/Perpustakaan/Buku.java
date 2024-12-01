/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 * 2311103115
 * @author Erick Evan Nicholas
 * S1SI-07C
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private String tahunTerbit;
    private double hargaBuku;
    private String kategori;

public Buku(String judul, String pengarang, String isbn,String tahunTerbit, double hargaBuku, String kategori) throws ValidasiInputException {
    if (judul.isEmpty()) {
    throw new ValidasiInputException("Judul buku tidak boleh kosong!");
    }
    if (pengarang.isEmpty()) {
    throw new ValidasiInputException("Pengarang tidak boleh kosong!");
    }
    if (!isbn.matches("\\d{13}")) {
    throw new ValidasiInputException("ISBN harus 13 digit angka!");
    }
    if (!tahunTerbit.matches("\\d{4}")) {
    throw new ValidasiInputException("Tahun terbit harus 4 digit angka!");
    }
    if (hargaBuku <= 0) {
    throw new ValidasiInputException("Harga buku harus lebih dari 0!");
    }
    if (kategori == null || kategori.isEmpty()) {
    throw new ValidasiInputException("Kategori buku tidak boleh kosong!");
    }
    this.judul = judul;
    this.pengarang = pengarang;
    this.isbn = isbn;
    this.tahunTerbit = tahunTerbit;
    this.hargaBuku = hargaBuku;
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

    public double getHargaBuku() {
        return hargaBuku;
    }

    public String getKategori() {
        return kategori;
    }
}