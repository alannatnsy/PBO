import java.util.Scanner;

public class GajiAgent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gajiPokok = 500000;
        int hargaPerItem = 50000;

        System.out.println("Masukkan Jumlah Penjualan : ");

        int penjualan = scanner.nextInt();
        scanner.close();

        double gajiAkhir = gajiPokok;

        if (penjualan >= 80) {
            gajiAkhir += penjualan * hargaPerItem * 0.35;
        } else if (penjualan >= 40) {
            gajiAkhir += penjualan * hargaPerItem * 0.25;
        } else if (penjualan < 15) {
            gajiAkhir -= gajiPokok * 0.15;
            gajiAkhir += penjualan * hargaPerItem * 0.1;
        } else {
            gajiAkhir += penjualan * hargaPerItem * 0.1;
        }

        System.out.println("Jumlah Gaji yang Diterima : ");
        System.out.println((int) gajiAkhir);
    }
}
