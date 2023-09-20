package pkg1_LuasSegitiga;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, t;
        double Luas;
        
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("------------------------");
        System.out.println("                        ");
        
        System.out.print("Masukan alas= ");
        a = input.nextInt();
        System.out.print("Masukan tinggi= ");
        t = input.nextInt();
        
        Luas= 0.5 * a * t;
        System.out.println("Luas Segitiga adalah= " + Luas);
    }    
}
