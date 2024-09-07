import java.util.Scanner;

public class BukaTutupjalan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String platNomor = scanner.nextLine();

        String gabungan = platNomor.replace(" ", "");

        long totalNomor = Long.parseLong(gabungan);

        long result = totalNomor - 999999;

        if (result % 5 == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }

        scanner.close();
    }
}
