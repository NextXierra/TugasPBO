package tugasKelompok;

class EWallet extends Pembayaran {
    public EWallet(String namaPembeli, double jumlahBelanja, String jenisEWallet) {
        super(namaPembeli, jumlahBelanja, "E-Wallet (" + jenisEWallet + ")");
    }

    @Override
    public void hitungBiayaAdmin() {
        this.biayaAdmin = jumlahBelanja * 0.015;
    }
}

class DANA extends EWallet {
    public DANA(String namaPembeli, double jumlahBelanja) {
        super(namaPembeli, jumlahBelanja, "DANA");
    }

    @Override
    public void hitungBiayaAdmin() {
        this.biayaAdmin = jumlahBelanja * 0.015;
    }
}

class OVO extends EWallet {
    public OVO(String namaPembeli, double jumlahBelanja) {
        super(namaPembeli, jumlahBelanja, "OVO");
    }

    @Override
    public void hitungBiayaAdmin() {
        this.biayaAdmin = jumlahBelanja * 0.02;
    }
}

class Gopay extends EWallet {
    public Gopay(String namaPembeli, double jumlahBelanja) {
        super(namaPembeli, jumlahBelanja, "Gopay");
    }

    @Override
    public void hitungBiayaAdmin() {
        this.biayaAdmin = jumlahBelanja * 0.018;
    }
}

class ShopeePay extends EWallet {
    public ShopeePay(String namaPembeli, double jumlahBelanja) {
        super(namaPembeli, jumlahBelanja, "ShopeePay");
    }

    @Override
    public void hitungBiayaAdmin() {
        this.biayaAdmin = jumlahBelanja * 0.022;
    }
}