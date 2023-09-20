package pkg3_hitungbilangan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double penjumlahan, pengurangan, perkalian, pembagian;
        
        System.out.print("Masukan angka pertama : ");
        a = input.nextInt();
        System.out.print("Masukan angka kedua : ");
        b = input.nextInt();
        
        System.out.println("                        ");
        
        penjumlahan = a + b ;
        System.out.printf("Hasil dari %d + %d = %s\n", a, b, penjumlahan);
        pengurangan = a - b;
        System.out.printf("Hasil dari %d - %d = %s\n", a, b, pengurangan);
        perkalian = a * b;
        System.out.printf("Hasil dari %d x %d = %s\n", a, b, perkalian);
        pembagian = a / b;
        System.out.printf("Hasil dari %d / %d = %s\n", a, b, pembagian);
    }
    
}
