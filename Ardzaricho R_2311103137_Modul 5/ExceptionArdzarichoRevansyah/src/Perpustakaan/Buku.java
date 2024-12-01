package Perpustakaan;

/**
 * @author Ardzaricho Revansyah
 * 2311103137
 * S1SI-07-c
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private String tahunTerbit;
    private String harga;
    private String kategori;
    
    public Buku(String judul, String pengarang, String isbn, String tahunTerbit,
    String harga, String kategori) throws ValidasiInputException {
    if (judul.isEmpty()) {
        throw new ValidasiInputException("Judul buku tidak boleh kosong!");
    }
    if (pengarang.isEmpty()) {
        throw new ValidasiInputException("Pengarang tidak boleh kosong!");
    }
    if (!isbn.matches("\\d{13}")) {
        throw new ValidasiInputException("ISBN harus 13 digit angka!");
    }
    if (!tahunTerbit.matches("\\d{4}")) {
        throw new ValidasiInputException("Tahun Terbit harus 4 digit angka!");
    }
    try {
        long hargaNumber = Long.parseLong(harga); 
        if (hargaNumber < 0) {
            throw new ValidasiInputException("Harga tidak boleh angka negatif!");
        }
    } catch (NumberFormatException e) {
        throw new ValidasiInputException("Input harus berupa angka!");
    }
    if (kategori == null || kategori.isEmpty()) {
        throw new ValidasiInputException("Kategori harus dipilih!");
    }
    
    this.judul = judul;
    this.pengarang = pengarang;
    this.isbn = isbn;
    this.tahunTerbit = tahunTerbit;
    this.harga = harga;
    this.kategori = kategori;
    
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
    
    public String getTahunTerbit() {
        return tahunTerbit;
    }
    
    public String getHarga() {
        return harga;
    }
    
    public String getKategori() {
        return kategori;
    }
}
