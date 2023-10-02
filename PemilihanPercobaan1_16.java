import java.util.Scanner;
public class PemilihanPercobaan1_16 {

public static void main(String[] args) {
    Scanner sc16 = new Scanner(System.in);
    System.out.print("Masukan angka: ");
    int angka = sc16.nextInt();
    if (angka % 2 == 0)
    System.out.println("Angka  "+angka+" bilangan genap");
    else 
    System.out.println("Angka "+angka+" bilangan ganjil");
    sc16.close();
    }
}