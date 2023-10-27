import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input20.nextInt();

        int[] umurMhs = new int[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan umur mahasiswa ke-" + (i + 1) + ": ");
            umurMhs[i] = input20.nextInt();
        }

        int umurTertua = umurMhs[0];
        int umurTermuda = umurMhs[0];

        int totalUmur = 0;

        for (int i = 0; i < jumlahMhs; i++) {
            if (umurMhs[i] > umurTertua) {
                umurTertua = umurMhs[i];
            }
            if (umurMhs[i] < umurTermuda) {
                umurTermuda = umurMhs[i];
            }
            totalUmur += umurMhs[i];
        }

        double rataRataUmur = totalUmur / jumlahMhs;

        System.out.println("Umur Mahasiswa Tertua: " + umurTertua + " tahun");
        System.out.println("Umur Mahasiswa Termuda: " + umurTermuda + " tahun");
        System.out.println("Rata-rata Umur Mahasiswa: " + rataRataUmur + " tahun");
    }
}
