
package perpustakaan;

/**
 *
 * @author GeordySiphoSamuelDamanik
 * 2311103112
 * S1SI-07-C
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private String tahunTerbit;
    private double hargaBuku;
    private String kategori;
    
    public Buku (String judul, String pengarang, String isbn, String tahunTerbit, double hargaBuku, String kategori)throws ValidasiInputException{
        if(judul.isEmpty()){
            throw new ValidasiInputException ("Judul Kosong Tulung isi dulu");
        }
        if(pengarang.isEmpty()){
            throw new ValidasiInputException ("Pengarang Kosong woyy");
        }
        if(!isbn.matches("\\d{13}")){
            throw new ValidasiInputException ("ISBN ISI 13 Brayy");
        }
        
        if(!tahunTerbit.matches("\\d{4}")){
            throw new ValidasiInputException("Tahun Terbit harus 4 digit angka");
        }
        
        if(hargaBuku <= 0){
            throw new ValidasiInputException("Harga Buku harus positif");
        }
        
        if(kategori == null || kategori.isEmpty()){
            throw new ValidasiInputException("Kategori Buku harus dipilih");
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
