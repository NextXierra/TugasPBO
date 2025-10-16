package diagram;

/**
 *
 * @author Xierra
 */
public class Buku {
    private int id_buku;
    private char judul_buku;
    private char pengarang;
    
    public void insert_data() {
        System.out.println("Data buku dengan ID " + id_buku + " berhasil ditambahkan");
    }
    
    public void update_data() {
        System.out.println("Data buku dengan ID " + id_buku + " berhasil diupdate");
    }
}

class Buku_asing extends Buku {
    private int id_buku;
    private char judul_buku;
    private char pengarang;
    
    public void insert_data() {
        System.out.println("Data buku asing dengan ID " + id_buku + " berhasil ditambahkan");
    }
    
    public void update_data() {
        System.out.println("Data buku asing dengan ID " + id_buku + " berhasil diupdate");
    }
}

class Buku_lokal extends Buku {
    private int id_buku;
    private char judul_buku;
    private char pengarang;
    
    public void insert_data() {
        System.out.println("Data buku lokal dengan ID " + id_buku + " berhasil ditambahkan");
    }
    
    public void update_data() {
        System.out.println("Data buku lokal dengan ID " + id_buku + " berhasil diupdate");
    }
}

