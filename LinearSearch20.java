import java.util.Scanner;

public class LinearSearch20 {
    public static void main (String[] args) {

        Scanner input20 = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array: ");
        int jmlElemen = input20.nextInt();

        int[] arrayInt = new int [jmlElemen];

        for (int i = 0; i < jmlElemen; i++) {
            System.out.println("Masukkan elemen ke-" + (i + 1) + ": ");
            arrayInt[i] = input20.nextInt();
            }

        System.out.println("Masukkan key yang ingin dicari: ");
        int key = input20.nextInt();

        int hasil = -1;

        for (int i = 0; i < jmlElemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan dalam array");
        }
    }
}