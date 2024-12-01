/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author MARSYA VALERIA 
 * 2311103105
 * 07C
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private int tahun;
    private double harga;
    private String kategori;

    public Buku(String judul, String pengarang, String isbn, int tahun, double harga, String kategori) throws ValidasiInputException {
        if (judul.isEmpty()) {
            throw new ValidasiInputException("Judul buku tidak boleh kosong!");
        }
        if (pengarang.isEmpty()) {
            throw new ValidasiInputException("Pengarang tidak boleh kosong!");
        }
        if (!isbn.matches("\\d{13}")) {
            throw new ValidasiInputException("ISBN harus 13 digit angka!");
        }
        if (tahun < 1000 || tahun > 9999) {
            throw new ValidasiInputException("Tahun harus 4 digit!");
        }
        if (harga <= 0) {
            throw new ValidasiInputException("Harga harus angka positif!");
        }
        if (kategori == null || kategori.isEmpty()) {
            throw new ValidasiInputException("Kategori tidak boleh kosong!");
        }

        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahun = tahun;
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

    public int getTahun() {
        return tahun;
    }

    public double getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }
}