package tugasKelompok;

class CreditCard extends Pembayaran {
    public CreditCard(String namaPembeli, double jumlahBelanja, String jenisCreditCard) {
        super(namaPembeli, jumlahBelanja, "Credit Card (" + jenisCreditCard + ")");
    }

    @Override
    public void hitungBiayaAdmin() {
        this.biayaAdmin = 7500;
    }
}

class Visa extends CreditCard {
    public Visa(String namaPembeli, double jumlahBelanja) {
        super(namaPembeli, jumlahBelanja, "Visa");
    }

    @Override
    public void hitungBiayaAdmin() {
        this.biayaAdmin = 5000;
    }
}

class MasterCard extends CreditCard {
    public MasterCard(String namaPembeli, double jumlahBelanja) {
        super(namaPembeli, jumlahBelanja, "MasterCard");
    }

    @Override
    public void hitungBiayaAdmin() {
        this.biayaAdmin = 6000;
    }
}

class Amex extends CreditCard {
    public Amex(String namaPembeli, double jumlahBelanja) {
        super(namaPembeli, jumlahBelanja, "American Express");
    }

    @Override
    public void hitungBiayaAdmin() {
        this.biayaAdmin = 8000;
    }
}