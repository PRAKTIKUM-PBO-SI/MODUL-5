/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author TigrisYedijaMaarende
 * 2311103103
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private String tahunTerbit;

    // Konstruktor dengan validasi input
    public Buku(String judul, String pengarang, String isbn, String tahunTerbit) throws ValidasiInputException {
        if (judul == null || judul.trim().isEmpty()) {
            throw new ValidasiInputException("Judul buku tidak boleh kosong!");
        }

        if (pengarang == null || pengarang.trim().isEmpty()) {
            throw new ValidasiInputException("Pengarang tidak boleh kosong!");
        }

        if (isbn == null || !isbn.matches("\\d{13}")) {
            throw new ValidasiInputException("ISBN harus 13 digit angka!");
        }

        if (tahunTerbit == null || !tahunTerbit.matches("\\d{4}")) {
            throw new ValidasiInputException("Tahun terbit harus 4 digit angka!");
        }

        this.judul = judul.trim();
        this.pengarang = pengarang.trim();
        this.isbn = isbn.trim();
        this.tahunTerbit = tahunTerbit.trim();
    }

    // Getter untuk properti `judul`
    public String getJudul() {
        return judul;
    }

    // Getter untuk properti `pengarang`
    public String getPengarang() {
        return pengarang;
    }

    // Getter untuk properti `isbn`
    public String getIsbn() {
        return isbn;
    }

    // Getter untuk properti `tahunTerbit`
    public String getTahunTerbit() {
        return tahunTerbit;
    }
}


