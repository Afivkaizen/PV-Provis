package pkg5_nilairatarata;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean inginMelanjutkan = true;

        while (inginMelanjutkan) {
            int jumlahAngka = 0;
            int total = 0;
            double rataRata = 0.0;

            System.out.println("Program Penghitung Rata-rata");
            System.out.print("Masukkan jumlah angka yang akan dihitung: ");

            try {
                jumlahAngka = input.nextInt();
                if (jumlahAngka <= 0) {
                    System.out.println("Masukkan jumlah angka yang valid (lebih dari 0).");
                    continue;
                }

                System.out.println("Masukkan " + jumlahAngka + " angka:");

                for (int i = 0; i < jumlahAngka; i++) {
                    total += input.nextInt();
                }

                rataRata = (double) total / jumlahAngka;
                System.out.println("Nilai rata-rata adalah: " + rataRata);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Masukkan hanya angka yang valid.");
                input.nextLine();
                continue;
            }

            System.out.print("Apakah Anda ingin menghitung lagi? (y/n): ");
            String lanjutkan = input.next();

            if (!lanjutkan.equalsIgnoreCase("y")) {
                inginMelanjutkan = false;
            }
        }
    }
    
}