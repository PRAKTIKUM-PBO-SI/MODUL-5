/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author hanaf
 */
public class Buku {

    private String judul;
    private String pengarang;
    private String isbn;
    private String tahunTerbit;
    private String hargaBuku;
    private String kategori;

    public Buku(String judul, String pengarang, String isbn) throws ValidationException {
        if (judul.isEmpty()) {
            throw new ValidationException("Judul buku tidak boleh kosong!");
        }
        if (pengarang.isEmpty()) {
            throw new ValidationException("Pengarang tidak boleh kosong!");
        }
        if (!isbn.matches("\\d{13}")) {
            throw new ValidationException("ISBN harus 13 digit angka!");
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
    
    public String gethargaBuku() {
        return hargaBuku;
    }
    
    public String getkategori() {
        return kategori;
    }

}
