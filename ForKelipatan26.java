import java.util.Scanner;

public class ForKelipatan26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int kelipatan;

        int jumlah = 0;
        int counter = 0;

        System.out.print("Masukkan Bilangan Kelipatam (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        System.out.printf("Banyaknya Bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total Bilangan Kelipatan %d dari 1 sampai 50 adala %d\n", kelipatan, jumlah);
    }
}
