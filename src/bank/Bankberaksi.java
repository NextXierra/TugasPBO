package bank;

/**
 *
 * @author Xierra
 */
import java.util.Scanner;

public class Bankberaksi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang di Bank ABC");
        Bank bank = new Bank(100000);

        bank.getSaldo();
        System.out.println("Berapa Yang Tang mau Anda Simpan : ");
        int simpan = input.nextInt();
        bank.simpanUang(simpan);
        System.out.println("Berapa Yang Tang mau Anda Ambil : ");
        int ambil = input.nextInt();
        bank.ambilUang(ambil);

    }

}
