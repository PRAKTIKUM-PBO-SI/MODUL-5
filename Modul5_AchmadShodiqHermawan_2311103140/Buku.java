/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author Achmad
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private String tahunTerbit;
    private String harga;
    private String kategori;
    
    public Buku(String judul, String pengarang, String isbn, String TahunTerbit)throws ValidasiInputException{
       if(judul.isEmpty()){
           throw new ValidasiInputException("judul kosong");
       }
       if(pengarang.isEmpty()){
           throw new ValidasiInputException("pengarang kosong");
       }
       if(!isbn.matches("\\d{13}")){
           throw new ValidasiInputException("isbn harus 13 angka");
       }
       if (!tahunTerbit.matches("\\d{4}")) { 
           throw new ValidasiInputException("Tahun Terbit harus 4 digit angka!"); 
       } 
      try { 
         long hargaNumber = Long.parseLong(harga); // Ubah ISBN menjadi angka 
         if (hargaNumber < 0) { 
         throw new ValidasiInputException("Harga tidak boleh angka negatif!"); 
         } 
         } catch (NumberFormatException e) { 
         throw new ValidasiInputException("Input harus berupa angka!"); 
         } 
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahunTerbit= tahunTerbit;
        this.kategori = kategori;
        
    }

    Buku(String judul, String pengarang, String Isbn, String TahunTerbit, String harga, String kategori) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public String getisbn(){
        return isbn;
    }
    public String getTahunTerbit(){
        return tahunTerbit;
    }  
    public String getKategori(){
        return kategori;
    }

    Object getHarga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

