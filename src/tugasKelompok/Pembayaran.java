package tugasKelompok;

class Pembayaran {
    protected String namaPembeli;
    protected double jumlahBelanja;
    protected double totalHarga;
    protected double biayaAdmin;
    protected String metodePembayaran;
    protected double diskon = 0;
    protected String promoCode = "";

    public Pembayaran(String namaPembeli, double jumlahBelanja, String metodePembayaran) {
        this.namaPembeli = namaPembeli;
        this.jumlahBelanja = jumlahBelanja;
        this.metodePembayaran = metodePembayaran;
    }

    public void hitungBiayaAdmin() {
        this.biayaAdmin = 0;
    }

    public void applyPromo(String kodePromo) {
        this.promoCode = kodePromo;
        switch (kodePromo.toUpperCase()) {
            case "HEMAT10":
                this.diskon = 0.10;
                break;
            case "HEMAT20":
                this.diskon = 0.20;
                break;
            case "HEMAT15":
                this.diskon = 0.15;
                break;
            case "HEMAT5":
                this.diskon = 0.05;
                break;
            default:
                this.diskon = 0;
                this.promoCode = "Kode tidak valid";
        }
    }

    public void applyPromo(double persenDiskon) {
        this.diskon = persenDiskon;
        this.promoCode = "Diskon " + (int)(persenDiskon * 100) + "%";
    }

    public void hitungTotalHarga() {
        hitungBiayaAdmin();
        double subtotal = jumlahBelanja - (jumlahBelanja * diskon);
        this.totalHarga = subtotal + biayaAdmin;
    }

    public void cetakStruk() {
        System.out.println("\n========== STRUK PEMBAYARAN ==========");
        System.out.println("Nama Pembeli    : " + namaPembeli);
        System.out.println("Jumlah Belanja  : Rp " + String.format("%,.0f", jumlahBelanja));
        System.out.println("Metode Pembayaran: " + metodePembayaran);
        System.out.println("Biaya Admin     : Rp " + String.format("%,.0f", biayaAdmin));
        if (diskon > 0) {
            System.out.println("Promo           : " + promoCode);
            System.out.println("Diskon          : Rp " + String.format("%,.0f", (jumlahBelanja * diskon)));
        }
        System.out.println("Total Bayar     : Rp " + String.format("%,.0f", totalHarga));
        System.out.println("=====================================\n");
    }
}

class Cash extends Pembayaran {
    public Cash(String namaPembeli, double jumlahBelanja) {
        super(namaPembeli, jumlahBelanja, "Cash");
    }

    @Override
    public void hitungBiayaAdmin() {
        this.biayaAdmin = 0;
    }
}