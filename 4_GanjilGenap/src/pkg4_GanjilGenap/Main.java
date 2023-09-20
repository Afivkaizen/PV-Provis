package pkg4_GanjilGenap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        
        System.out.println("    Ganjil dan Genap    ");
        System.out.println("------------------------");
        System.out.println("                        ");
        
        System.out.print("masukan bilagan : ");
        bilangan = input.nextInt();
        
        if (bilangan%2==0){
            System.out.println("Bilangan " +bilangan+ " adalah sebuah Bilangan Genap");
        }else{
            System.out.println("Bilangan " +bilangan+ " adalah sebuah Bilangan Ganjil");
        }
        
        }
    }
