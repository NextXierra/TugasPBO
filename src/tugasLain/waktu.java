package tugasLain;

/**
 *
 * @author Xierra
 */
public class waktu {
    private static int menitWaktu = 0;

    static int getJam() {
        return menitWaktu / 60;
    }

    static int getMenit() {
        return menitWaktu % 60;
    }

    static int getDetik() {
        return menitWaktu * 60;
    }

    static int getTotalMenit() {
        return menitWaktu;
    }

    static void setMenit(int menit) {
        menitWaktu = menit;
    }

    static void setJam(int jam) {
        menitWaktu = jam * 60;
    }

    static void tambahJam(int jam) {
        menitWaktu += jam * 60;
    }

    static void tambahMenit(int menit) {
        menitWaktu += menit;
    }

    static void tambahWaktu(int jam, int menit) {
        menitWaktu += (jam * 60) + menit;
    }

    static void tampilkanWaktu() {
        System.out.println("Waktu: " + getJam() + " jam " + getMenit() + " menit");
    }

    public static void main(String[] args) {
        setJam(1);
        setMenit(30);
        tampilkanWaktu();

        tambahJam(2);
        tambahMenit(45);
        tampilkanWaktu();

        tambahWaktu(1, 20);
        tampilkanWaktu();

        System.out.println("Total Menit: " + getTotalMenit());
    }
}
