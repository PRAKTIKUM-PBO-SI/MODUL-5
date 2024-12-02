/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author LENOVO
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    
    public Buku(String judul, String pengarang, String isbn){
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
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
    
}
