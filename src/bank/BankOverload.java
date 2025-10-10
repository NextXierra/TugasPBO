package bank;

public class BankOverload {
    private String namaBank;
    private double saldo;

    public BankOverload(String namaBank) {
        this.namaBank = namaBank;
        this.saldo = 0.0;
    }

    public BankOverload(String namaBank, double saldoAwal) {
        this.namaBank = namaBank;
        this.saldo = saldoAwal;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }

    public void setor(double jumlah, double bonus) {
        saldo += jumlah + bonus;
    }

    public boolean tarik(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public double getSaldo() {
        return saldo;
    }
}
