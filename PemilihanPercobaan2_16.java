import java.util.Scanner;
public class PemilihanPercobaan2_16 {

    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        System.out.print("Nilai uas        : ");
        float uas = sc16.nextFloat();
        System.out.print("Nilai uts        : ");
        float uts = sc16.nextFloat();
        System.out.print("Nilai kuis       : ");
        float kuis = sc16.nextFloat();
        System.out.print("Nilai tugas      : ");
        float tugas = sc16.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir      = " + total + " sehingga " +message);
        if (total <=39){
            System.out.println(total + " Akreditas E (0.0) /GAGAL");
        }
        else if (total >80 && total <=100){
            System.out.println(total + " Akreditas A (4.0) /SANGAT BAIK");
        }
        else if (total >73 && total <=80){
            System.out.println(total + " Akreditas B+ (3.5) /LEBIH DARI BAIK");
        }
        else if (total >65 && total <=73){
            System.out.println(total + " Akreditas B (3.0) /BAIK");
        }
        else if (total >60 && total <=65){
            System.out.println(total + " Akreditas C+ (2.5) /LEBIH DARI CUKUP");
        }
        else if (total >50 && total <=60){
            System.out.println(total + " Akreditas C (2.0) /CUKUP");
        }
        else if (total >39 && total <=50){
           System.out.println(total + " Akreditas D (1.0)/KURANG"); 
        }
        else{
          System.out.println("Ulangi Semester depan"); 
        }
        sc16.close();
    }
    
}
