package pkg2_biodata;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int Usia;
        double TinggiBadan;
        
        System.out.print("masukan nama anda = ");
        String nama = data.nextLine();
        System.out.print("masukan usia anda = ");
        Usia = data.nextInt();
        System.out.print("masukan tinggi anda = ");
        TinggiBadan = data.nextDouble();
        
        System.out.println("                          ");
        System.out.println("Nama : "+ nama);
        System.out.println("Usia : "+ Usia);
        System.out.println("Tinngi badan : "+ TinggiBadan);    
    }
}
