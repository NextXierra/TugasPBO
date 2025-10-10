package tugasKelompok;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========== SISTEM PEMBAYARAN SUPERMARKET ==========");
        
        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = scanner.nextLine();
        
        System.out.print("Masukkan jumlah belanja: Rp ");
        double jumlahBelanja = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("\nPilih metode pembayaran:");
        System.out.println("1. Cash");
        System.out.println("2. E-Wallet");
        System.out.println("3. Credit Card");
        System.out.print("Pilihan (1-3): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        
        Pembayaran pembayaran = null;
        
        switch (pilihan) {
            case 1:
                pembayaran = new Cash(namaPembeli, jumlahBelanja);
                break;
                
            case 2:
                System.out.println("\nPilih jenis E-Wallet:");
                System.out.println("1. DANA");
                System.out.println("2. OVO");
                System.out.println("3. Gopay");
                System.out.println("4. ShopeePay");
                System.out.print("Pilihan (1-4): ");
                int pilihanEWallet = scanner.nextInt();
                scanner.nextLine();
                
                switch (pilihanEWallet) {
                    case 1:
                        pembayaran = new DANA(namaPembeli, jumlahBelanja);
                        break;
                    case 2:
                        pembayaran = new OVO(namaPembeli, jumlahBelanja);
                        break;
                    case 3:
                        pembayaran = new Gopay(namaPembeli, jumlahBelanja);
                        break;
                    case 4:
                        pembayaran = new ShopeePay(namaPembeli, jumlahBelanja);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        return;
                }
                break;
                
            case 3:
                System.out.println("\nPilih jenis Credit Card:");
                System.out.println("1. Visa");
                System.out.println("2. MasterCard");
                System.out.print("Pilihan (1-2): ");
                int pilihanCredit = scanner.nextInt();
                scanner.nextLine();
                
                switch (pilihanCredit) {
                    case 1:
                        pembayaran = new Visa(namaPembeli, jumlahBelanja);
                        break;
                    case 2:
                        pembayaran = new MasterCard(namaPembeli, jumlahBelanja);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        return;
                }
                break;
                
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        
        System.out.println("\nApakah ingin menggunakan promo?");
        System.out.println("1. Ya, dengan kode promo");
        System.out.println("2. Tidak");
        System.out.print("Pilihan (1-2): ");
        int pilihanPromo = scanner.nextInt();
        scanner.nextLine();
        
        switch (pilihanPromo) {
            case 1:
                System.out.print("Masukkan kode promo : ");
                String kodePromo = scanner.nextLine();
                pembayaran.applyPromo(kodePromo);
                break;

            case 2:
                break;
                
            default:
                System.out.println("Pilihan tidak valid! Melanjutkan tanpa promo.");
        }
        
        pembayaran.hitungTotalHarga();
        pembayaran.cetakStruk();
    }
}