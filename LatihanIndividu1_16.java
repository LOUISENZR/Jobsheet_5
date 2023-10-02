
import java.util.Scanner;
public class LatihanIndividu1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jarak;
        System.out.print("Masukan jarak pertarungan(M): ");
        jarak = sc.nextInt();

        if (jarak <=5){
        System.out.println("Pertarungan jarak dekat gunakan Melee Weapon");
        }
        else{
        System.out.println("Pertarungan jarak jauh gunakan Range Weapos");
        sc.close();
        }

    }
    
}
