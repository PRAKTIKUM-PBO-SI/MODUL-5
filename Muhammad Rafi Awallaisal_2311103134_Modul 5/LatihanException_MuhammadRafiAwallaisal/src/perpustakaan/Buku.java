/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;
//Author @Muhammad Rafi Awallaisal 2311103134/S1SI07C
public class Buku {
   private String judul;
   private String pengarang;
   private String isbn;
   private String tahunterbit;
   private String hargabuku;
   private String kategoribuku;
   
   public Buku (String judul, String pengarang, String isbn, String tahunterbit, String hargabuku, String kategoribuku )throws ValidasiInputException {
       if(judul.isEmpty()){
           throw new ValidasiInputException ("judul kosong ");
           
       }
       if(pengarang.isEmpty()){
            throw new ValidasiInputException ("pengarang kosong");
       }
       if(!isbn.matches("\\d{13}")){
           throw new ValidasiInputException ("ISBN harus 13 angka");
       }
       this.judul = judul;
       this.pengarang = pengarang;
       this.isbn = isbn;    
   }
   
   public String getJudul (){
       return judul;
   }
   public String getPengarang(){
       return pengarang;
   }
   public String getIsbn (){
       return isbn;
   }
    public String getTahunterbit (){
       return tahunterbit;
    }
     public String getKategoriBuku (){
       return kategoribuku;
    }
      public String getHargabuku (){
       return hargabuku;
    }
}