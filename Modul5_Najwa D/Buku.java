/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author Najwa D
 * 2311103108
 * S1SI07C
 */
public class Buku {
 private String judul;
 private String pengarang;
 private String isbn;
 private String tahunTerbit;
 private double hargaBuku;
 private String kategori;
 
 public Buku (String judul, String pengarang, String isbn, String tahunTerbit, double hargaBuku, String 
kategori)throws validasiinputException{
 if(judul.isEmpty()){
 throw new validasiinputException ("Judul Kosong! Please isi dulu");
 }
 if(pengarang.isEmpty()){
 throw new validasiinputException ("Pengarang Kosong!");
 }
 if(!isbn.matches("\\d{13}")){
 throw new validasiinputException ("ISBN ISI HARUS 13");
 }
 
 if(!tahunTerbit.matches("\\d{4}")){
 throw new validasiinputException("Tahun Terbit 4 digit angka");
 }
 
 if(hargaBuku <= 0){
 throw new validasiinputException("Harga Buku positif");
 }
 
 if(kategori == null || kategori.isEmpty()){
 throw new validasiinputException("Kategori Buku pilih satu");
 }
 
 this.judul = judul;
 this.pengarang = pengarang;
 this.isbn = isbn;
 this.tahunTerbit = tahunTerbit;
 this.hargaBuku = hargaBuku;
 this.kategori = kategori;
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
 
 public String getJudul (){
 return judul;
 }
 public String getPengarang (){
 return pengarang;
 }
 public String getIsbn (){
 return isbn;
 }
}