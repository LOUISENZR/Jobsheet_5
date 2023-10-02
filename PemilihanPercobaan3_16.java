import java.util.Scanner;
public class PemilihanPercobaan3_16 {

    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;
        
        System.out.print("Masukan angka pertama: " );
        angka1 = sc16.nextDouble();
        System.out.print("Masukan angka kedua  : ");
        angka2 = sc16.nextDouble();
        System.out.print("Masukan operator (+ - * /): ");
        operator = sc16.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                ;
            case '-':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;

            

        }

        sc16.close();

    }
}
