import java.util.Scanner;

public class Mahasiswa26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String namaMahasiswa, jenisKelamin, namaMahasiswiPerempuan = " ";
        int totalMahasiswaPerempuan = 0;

        for (int counter = 0; counter <= 30; counter++) {
            System.out.print("\nMasukkan nama mahasiswa ke-" + (counter + 1) + " : ");
            namaMahasiswa = sc.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa (L/P) ke-" + (counter + 1) + " : ");
            jenisKelamin = sc.nextLine();

            if (jenisKelamin.equalsIgnoreCase("p")) {
                namaMahasiswiPerempuan += namaMahasiswa;
                totalMahasiswaPerempuan++;
            }
        }

        System.out.printf("Nama Mahasiswa Perempuan    : %s \t \n", namaMahasiswiPerempuan);
        System.out.println("Total Mahasiswa Perempuan   : " + totalMahasiswaPerempuan);
    }
}
