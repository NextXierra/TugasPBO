package indomaret;

public class KartuIndomaretOverload {
    private String nomorKartu;
    private String namaPemilik;
    private double saldo;

    public KartuIndomaretOverload(String nomorKartu, String namaPemilik) {
        this.nomorKartu = nomorKartu;
        this.namaPemilik = namaPemilik;
        this.saldo = 0.0;
    }

    public KartuIndomaretOverload(String nomorKartu, String namaPemilik, double saldoAwal) {
        this.nomorKartu = nomorKartu;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    public void tambahSaldo(double jumlah) {
        saldo += jumlah;
    }

    public void tambahSaldo(double jumlah, double bonus) {
        saldo += jumlah + bonus;
    }

    public boolean bayar(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }
}
