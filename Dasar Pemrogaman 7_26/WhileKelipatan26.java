import java.util.Scanner;

public class WhileKelipatan26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        double average = 0.0;

        System.out.print("Masukkan Bilangan Kelipatam (1-9): ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            } i++;
            average = (double) jumlah/counter;
        }
        System.out.printf("Banyaknya Bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total Bilangan Kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, average);
    }
}
