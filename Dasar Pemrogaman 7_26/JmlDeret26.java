import java.util.Scanner;

public class JmlDeret26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
                int total = 0;
                int i = 25;
        
            while (i >= 1) {
                total += i;
                System.out.println("Angka ke-" + i);
                i--;
            }
        
        System.out.println("Hasil penjumlahan deret bilangan dari 25 hingga 1 : " + total);
    }
}