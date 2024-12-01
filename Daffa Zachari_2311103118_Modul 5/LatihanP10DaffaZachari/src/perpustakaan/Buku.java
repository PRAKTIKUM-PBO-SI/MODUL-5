
package perpustakaan;

/**
 *
 * @author Daffa Zachari 2311103118 S1SI07C
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private String tahun;
    private String harga;
    private String kategori;
    
    public Buku (String judul, String pengarang, String isbn, String tahun, String harga, String kategori)throws ValidasiInputException{
        if(judul.isEmpty()){
            throw new ValidasiInputException ("Judul Kosong Blokk");
        }
        if(pengarang.isEmpty()){
            throw new ValidasiInputException ("Pengarang Kosong Jing");
        }
        if(!isbn.matches("\\d{13}")){
            throw new ValidasiInputException ("ISBN ISI 13 DULU GA!?!?");
        }
                 
         if(tahun.isEmpty()){ 
            throw new ValidasiInputException("Silahkan isi Tahun Terbit!!"); 
        } 
         
        if(!tahun.matches("\\d+")){ 
            throw new ValidasiInputException("Tahun Terbit ga boleh pakai huruf broo"); 
        } 
         
        if(!tahun.matches("\\d{4}")){ 
            throw new ValidasiInputException("Tahun Terbit 4 angka ya broo"); 
        }
        if(harga.isEmpty()){ 
        throw new ValidasiInputException("Silahkan isi Harga Buku Yaa"); 
        } 
        if(!harga.matches("\\d+")){ 
        throw new ValidasiInputException("Harga ya bukan kata kata, jadi pake angka!!"); 
        } 
        int hargaInt = Integer.parseInt(harga);
        if(hargaInt <= 0){ 
        throw new ValidasiInputException("Harga kok minus? emg sikap lo!"); 
        } 
        if(kategori == "Pilih Kategori"){ 
        throw new ValidasiInputException("Kategori jangan kosong ya gantenk"); 
        }

        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahun = tahun;
        this.harga = harga;
        this.kategori = kategori;
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
    public String getTahun (){
        return tahun;
    }
    public String getHarga (){
        return harga;
    }
    public String getKategori(){ 
        return kategori; 
    } 
}
