import java.util.Scanner;
public class PemilihanPercobaan1_16 {

public static void main(String[] args) {
    Scanner sc16 = new Scanner(System.in);
    System.out.print("Masukan angka: ");
    int angka = sc16.nextInt();
    String hasil;
    hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
    System.out.println(angka + " adalah " + hasil);
    sc16.close();
    }
}