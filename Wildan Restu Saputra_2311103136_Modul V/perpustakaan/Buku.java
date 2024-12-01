/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 * 
 * Penulis: Wildan
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;

    // Konstruktor dengan validasi input
    public Buku(String judul, String pengarang, String isbn) throws ValidasiInputException { 
        if (judul.isEmpty()) {
            throw new ValidasiInputException("Judul buku tidak boleh kosong!");
        }
        if (pengarang.isEmpty()) {
            throw new ValidasiInputException("Pengarang tidak boleh kosong!");
        }
        if (!isbn.matches("\\d{13}")) {
            throw new ValidasiInputException("ISBN harus 13 digit angka!");
        }

        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
    }

    // Getter untuk atribut judul
    public String getJudul() {
        return judul;
    }

    // Getter untuk atribut pengarang
    public String getPengarang() {
        return pengarang;
    }

    // Getter untuk atribut ISBN
    public String getIsbn() {
        return isbn;
    }
}
