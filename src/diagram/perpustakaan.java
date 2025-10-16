package diagram;

/**
 *
 * @author Xierra
 */
import java.util.Date;
public class perpustakaan {
}

class Anggota {
    private int id;
    private char nama;
    
    public void insert_data() {
        System.out.println("Data anggota dengan ID " + id + " berhasil ditambahkan");
    }
    
    public void update_data() {
        System.out.println("Data anggota dengan ID " + id + " berhasil diupdate");
    }
}

class Petugas_perpustakaan {
    private int id_petugas;
    private char nama;
    
    public void insert_data() {
        System.out.println("Data petugas dengan ID " + id_petugas + " berhasil ditambahkan");
    }
    
    public void update_data() {
        System.out.println("Data petugas dengan ID " + id_petugas + " berhasil diupdate");
    }
}

class Pinjam_buku {
    private int id;
    private Date tanggal_pinjam;
    private int id_buku;
    private Date tanggal_pengembalian;
    private int id_petugas;
    
    public void insert_data() {
        System.out.println("Data peminjaman dengan ID " + id + " berhasil ditambahkan");
    }
    
    public void update_data() {
        System.out.println("Data peminjaman dengan ID " + id + " berhasil diupdate");
    }
    
    public void pilih_buku() {
        System.out.println("Buku dengan ID " + id_buku + " telah dipilih");
    }
}

