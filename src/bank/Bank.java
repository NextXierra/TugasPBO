package bank;

/**
 *
 * @author Xierra
 */
public class Bank {

    double saldo;

    public Bank(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public void simpanUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }

    public void ambilUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
            System.out.println("Saldo saat ini: Rp. " + saldo);
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }

    public void getSaldo() {
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }
}
