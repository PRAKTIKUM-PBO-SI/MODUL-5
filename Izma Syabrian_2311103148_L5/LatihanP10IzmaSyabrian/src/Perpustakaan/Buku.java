/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author Izma Syabri  an 2311103148
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private String tahun;
    private String harga;
    private String kategori;
    
    public Buku(String judul, String pengarang, String isbn, String tahun, String harga, String kategori)throws ValidasiInputException{
        if(judul.isEmpty()){
            throw new ValidasiInputException("Judul Kosong !");
        }
        if(pengarang.isEmpty()){
            throw new ValidasiInputException("Pengarang Kosong!");
        }
        if(!isbn.matches("\\d{13}")){
            throw new ValidasiInputException("ISBN Harus 13 Angka!");
        }
        if(tahun.isEmpty()){
            throw new ValidasiInputException("Tahun Kosong!");
        }
        if(!tahun.matches("\\d{4}")){
            throw new ValidasiInputException("Tahun Harus 4 Angka!");
        }
        if(harga.isEmpty()){
            throw new ValidasiInputException("Harga Kosong!");
        }
        int hargaValid = Integer.parseInt(harga);
        if(hargaValid <= 0){
            throw new ValidasiInputException("Harga harus bernilai positif!");
        }
        if(kategori == "Kategori Buku"){
            throw new ValidasiInputException("Kategori Kosong!");
        }

       
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahun = tahun;
        this.harga = harga;
        this.kategori = kategori;
    }
    
    public String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public String getISBN(){
        return isbn;
    }
    public String getTahun(){
        return tahun;
    }
    public String getHarga(){
        return harga;
    }
    public String getKategori(){
        return kategori;
    }
    
}
