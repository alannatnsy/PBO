import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca input berupa dua bilangan besar
        System.out.println("Masukkan bilangan besar pertama :");
        BigInteger a = new BigInteger(sc.next());
        System.out.println("Masukkan bilangan besar kedua :");
        BigInteger b = new BigInteger(sc.next());

        // Operasi penjumlahan
        BigInteger sum = a.add(b);

        // Operasi perkalian
        BigInteger product = a.multiply(b);

        // Output hasil penjumlahan
        System.out.println(sum);

        // Output hasil perkalian
        System.out.println(product);

        sc.close();
    }
}
