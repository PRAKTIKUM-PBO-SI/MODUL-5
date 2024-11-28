package unguided_1;
//@author Rizqi Dwi Saputra_2311103133

public class Buku {
    
    private String judul;
    private String pengarang;
    private String isbn;
    private String tahun;
    
    public Buku(String judul, String pengarang, String isbn, String tahun) throws ValidasiInputExc {
        
        if(judul.isEmpty()){
            throw new ValidasiInputExc("Silahkan isi Judul buku");
        }
        
        if(pengarang.isEmpty()){
            throw new ValidasiInputExc("Silahkan isi Nama Pengarang");
        }
        
        if(!isbn.matches("\\d{13}")){
            throw new ValidasiInputExc("Nomor ISBN minimal 13 angka");
        }
        
        if(tahun.isEmpty()){
            throw new ValidasiInputExc("Silahkan isi Tahun Terbit");
        }
        
        if(!tahun.matches("\\d+")){
            throw new ValidasiInputExc("Tahun Terbit tidak boleh pakai huruf gusy");
        }
        
        if(!tahun.matches("\\d{4}")){
            throw new ValidasiInputExc("Tahun Terbit harus 4 angka guys");
        }
        
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahun = tahun;
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
    
    public String getTahun(){
        return tahun;
    }
    
}
