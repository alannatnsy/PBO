import java.util.Scanner;

public class data_types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah test case: ");
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            System.out.print("Masukkan angka: ");
            String input = scanner.next();

            try {
                long number = Long.parseLong(input);
                System.out.println(number + " dapat disimpan dalam:");

                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                System.out.println("* long");
            } catch (NumberFormatException e) {
                System.out.println(input + " tidak dapat disimpan di mana pun.");
            }

            System.out.println();
        }

        scanner.close();
    }
}

