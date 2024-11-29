package Perpustakaan;
/**
 * @author Levina Maheswari
 * 2311103110/S1SI07C
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn; 
    private String tahunTerbit;
    private String hargaBuku;
    private String kategori;
    public Buku(String judul, String pengarang, String isbn, String tahunTerbit, String hargaBuku, String kategori)throws ValidasiInputException {
        if(judul.isEmpty()){
            throw new ValidasiInputException("Judul Kosong");
        }
        if(pengarang.isEmpty()){
            throw new ValidasiInputException("Pengarang Kosong");
        }
        if(!isbn.matches("\\d{13}")){
            throw new ValidasiInputException("Judul Kosong");
        }
        if(!tahunTerbit.matches("\\d{4}")){
            throw new ValidasiInputException("Tahun Terbit Kosong");
        }
        if(hargaBuku.isEmpty()){
            throw new ValidasiInputException("Harga Buku Kosong");
        }
        if(kategori.isEmpty()|| kategori == null){
            throw new ValidasiInputException("Kategori Kosong");
        }
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahunTerbit = tahunTerbit;
        this.hargaBuku = hargaBuku;
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
    public String gettahunTerbit(){
        return tahunTerbit;
    }
    public String gethargaBuku(){
        return hargaBuku;
    }
    public String getkategori(){
        return kategori;
    }
}
