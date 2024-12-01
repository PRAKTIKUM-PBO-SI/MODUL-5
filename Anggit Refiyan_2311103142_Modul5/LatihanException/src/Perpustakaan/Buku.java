/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author Anggit
 * 2311103142
 * 7c
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private int tahunTerbit;
    private int hargaBuku;
    private String kategoriBuku;
    
    public Buku(String judul, String pengarang, String isbn, int tahunTerbit, int hargaBuku, String kategoriBuku)throws ValidasiInputException{
        if(judul.isEmpty()){
            throw new ValidasiInputException("Judul Kosong");
        }
        if(pengarang.isEmpty()){
            throw new ValidasiInputException("Pengarang Kosong");
        }
        if(!isbn.matches("\\d{13}")){
            throw new ValidasiInputException("Isbn harus 13 angka");
        }
        if (String.valueOf(tahunTerbit).length() != 4) {
            throw new ValidasiInputException("Tahun terbit harus berupa angka 4 digit.");
        }
        if (hargaBuku <= 0) {
            throw new ValidasiInputException("Harga buku harus lebih besar dari 0.");
        }
        if (kategoriBuku == null || kategoriBuku.isEmpty() || kategoriBuku.equalsIgnoreCase("Pilih Kategori")) {
            throw new ValidasiInputException("Kategori buku harus dipilih.");
        }
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahunTerbit = tahunTerbit;
        this.hargaBuku = hargaBuku;
        this.kategoriBuku = kategoriBuku;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public String getPengarang(){
        return pengarang;
    }
    
    public String getIsbn(){
        return isbn;
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public int getHargaBuku() {
        return hargaBuku;
    }

    public String getKategoriBuku() {
        return kategoriBuku;
    }
}
