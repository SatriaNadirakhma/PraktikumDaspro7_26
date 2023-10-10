import java.util.Scanner;
public class ForVar326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int bil, n;
        boolean berhenti = false;
        
        for (n = 0; !berhenti; n++) {
            System.out.print("Masukkan Bilangan: ");
            bil = sc.nextInt();
            System.out.println("Bilangan yang Anda Masukkan: " + bil);
            if (bil < n) {
                berhenti = true;
            }
        }
        System.out.println("Program Berakhir");
    }   
}
