package indomaret;

/**
 *
 * @author Xierra
 */
public class indomaret {

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Kartu Indomaret");

       
        KartuIndomaret kartu = new KartuIndomaret(50000);
        kartu.cekSaldo();

        kartu.isiKartu(700000);
        kartu.pakaiKartu(220000);
    }
}
