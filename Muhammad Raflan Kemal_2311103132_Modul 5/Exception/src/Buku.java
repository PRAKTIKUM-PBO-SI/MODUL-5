 
/**
 *
 * @author Muhammad Raflan Kemal
 * 2311103132
 * 07C
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    private String tahunTerbit;
    private String harga;

    // Konstruktor
    public Buku(String judul, String pengarang, String isbn, String tahunTerbit, String harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    // Getter methods
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
}
