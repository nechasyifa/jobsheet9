import java.util.Scanner;

public class ArrayRataNilai20 {
    public static void main(String[] args) {

        Scanner input20 = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input20.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rata2;
        int jmlLulus = 0;
        int jmlTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = input20.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
        } else {
            totalTdkLulus += nilaiMhs[i];
            jmlTdkLulus++;
        }
    }

        double rata2Lulus = jmlLulus > 0 ? totalLulus / jmlLulus : 0;
        double rata2TdkLulus = jmlTdkLulus > 0 ? totalTdkLulus / jmlTdkLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
        
    }
}
