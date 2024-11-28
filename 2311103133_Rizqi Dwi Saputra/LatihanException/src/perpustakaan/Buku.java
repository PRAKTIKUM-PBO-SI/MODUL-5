package perpustakaan;
//@author Rizqi Dwi Saputra_2311103133

public class Buku {
    
    private String judul;
    private String pengarang;
    private String isbn;
    
    public Buku(String judul, String pengarang, String isbn)throws ValidasiInputExc {
        
        if(judul.isEmpty()){
            throw new ValidasiInputExc("Silahkan isi Judul buku");
        }
        
        if(pengarang.isEmpty()){
            throw new ValidasiInputExc("Silahkan isi Nama Pengarang");
        }
        
        if(!isbn.matches("\\d{13}")){
            throw new ValidasiInputExc("Nomor ISBN minimal 13 angka");
        }
        
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
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
    
}
