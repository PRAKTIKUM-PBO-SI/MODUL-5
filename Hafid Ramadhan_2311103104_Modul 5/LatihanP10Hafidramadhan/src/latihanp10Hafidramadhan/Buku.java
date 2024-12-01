/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp10Hafidramadhan;

/**
 * @author Hafid Ramadhan 2311103104
 */
public class Buku {

    private String judul;
    private String pengarang;
    private String isbn;
    private String tahun;
    private String harga;
    private String kategori;

    public Buku(String judul, String pengarang, String isbn, String tahun, String harga, String kategori) throws ValidasiInputException {
        if (judul.isEmpty()) {
            throw new ValidasiInputException("judul kosong");
        }
        if (pengarang.isEmpty()) {
            throw new ValidasiInputException("Pengarang kosong");
        }
        if (!isbn.matches("\\d{13}")) {
            throw new ValidasiInputException("Isbn harus 13 angka");
        }
        if (tahun.isEmpty()) {
            throw new ValidasiInputException("Silahkan isi Tahun Terbit");
        }

        if (!tahun.matches("\\d+")) {
            throw new ValidasiInputException("Tahun Terbit only angka");
        }
        if (!tahun.matches("\\d{4}")) {
            throw new ValidasiInputException("Tahun Terbit wajib isi 4 angka ");
        }
        if (harga.isEmpty()) {
            throw new ValidasiInputException("di isi terlebih dahulu Harga Buku");
        }
        int hargaInt = Integer.parseInt(harga);
        if (hargaInt <= 0) {
            throw new ValidasiInputException("Masukkan Harga bukan utang anda!!");
        }
        if (!harga.matches("\\d+")) {
            throw new ValidasiInputException("Harga wajib angka");
        }
        if (kategori == "--- Masukkan Kategori Buku ---") {
            throw new ValidasiInputException("Masukkan Kategori Dulu jangan buru-buru");
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

    public String getTahun() {
        return tahun;
    }

    public String getHarga() {
        return harga;
    }
     public String getKategori(){ 
        return kategori; 
    } 
}
