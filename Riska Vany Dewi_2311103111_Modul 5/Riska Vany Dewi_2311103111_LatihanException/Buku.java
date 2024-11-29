package Perpustakaan;

/**
 * @author Riska Vany Dewi
 * 2311103111
 * S1SI07C
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private String tahunTerbit;
    private double hargaBuku;
    private String kategori;
    
    public Buku(String judul, String pengarang, String isbn, String tahunTerbit,
            String hargaBuku, String kategori) throws ValidasiInputException {
        if(judul.isEmpty()){
            throw new ValidasiInputException("Judul kosong");
        }
        
        if(pengarang.isEmpty()){
            throw new ValidasiInputException("Pengarang kosong");
        }
        
        if(!isbn.matches("\\d{13}")){
            throw new ValidasiInputException("ISBN harus 13 angka");
        }
        
        if (tahunTerbit.length() != 4 || !tahunTerbit.matches("\\d{4}")) {                
            throw new ValidasiInputException("Tahun terbit harus 4 digit");
        }

        double harga = Double.parseDouble(hargaBuku);
        if (harga <= 0) {
            throw new ValidasiInputException("Harga buku harus angka positif");
        }

        if (kategori == null || kategori.isEmpty()) {
            throw new ValidasiInputException("Kategori buku tidak boleh kosong");
        }
        
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahunTerbit = tahunTerbit;
        this.hargaBuku = Double.parseDouble(hargaBuku);
        this.kategori = kategori;
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
    
    public String getTahunTerbit(){
        return tahunTerbit;
    }
    
    public double getHargaBuku(){
        return hargaBuku;
    }
    
    public String getKategori(){
        return kategori;
    }
}
