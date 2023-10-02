import java.util.Scanner;
public class Latihanindividu2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Username, Password;
        Username = "Louise";
        Password = "Myself";

        System.out.print("Masukan Username: ");
        Username = sc.nextLine();
        System.out.print("Masukan Password: ");
        Password = sc.nextLine();

        if (Username.equals("Louise") && Password.equals("Myself")){
        System.out.println("Anda berhasil masuk ke system");
        }
        else{
        System.out.println("Username atau Password salah");
        sc.close();
        }

    }
    
}
    

