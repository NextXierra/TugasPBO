package indomaret;

/**
 *
 * @author Xierra
 */
public class KartuIndomaret {

    private double saldo;

    public KartuIndomaret(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public void isiKartu(double jumlah) {
        double bonus = jumlah * 0.10;
        saldo += jumlah + bonus;
        System.out.println("Isi Kartu: Rp. " + jumlah);
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }

    public void pakaiKartu(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Pakai kartu: Rp. " + jumlah);
            System.out.println("Saldo saat ini: Rp. " + saldo);
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }

    public void cekSaldo() {
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }
}
