import java.util.Scanner;
public class Berhitung {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int A, B, pilih, hasil= 0;
        System.out.println("Program Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Sisa Bagi");
        System.out.println("-----------------------------");

        // Input dan validasi angka
        do {
            System.out.print("Masukan Angka Pertama (1 ≤ A ≤ 1000): ");
            A = input.nextInt();
        } while (A <= 1 || A >= 1000);

        do {
            System.out.print("Masukan Angka Kedua (1 ≤ B ≤ 1000): ");
            B = input.nextInt();
        } while (B <= 1 || B >= 1000);

        // Pilihan Operasi
        System.out.print("Masukan Operasi: ");
        pilih = input.nextInt();

        switch (pilih)
        {
            case 1 : hasil = A + B;
            break;
            case 2 : hasil = A - B;
            break;
            case 3 : hasil = A / B;;
            break;
            case 4 : hasil = A * B;
            break;
            case 5 : hasil = A % B;
            break;
            default : System.out.println("Salah Memasukan Pilihan Harap Baca Pilihan di Menu");
        }
        System.out.println("Hasil: " + hasil);
    }
}