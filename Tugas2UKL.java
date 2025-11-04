import java.util.Scanner;
public class Tugas2UKL {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG FAKTORIAL ===");
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long hasil = faktorial(n);
            System.out.println("Faktorial dari " + n + " adalah: " + hasil);
        }
    }
    public static long faktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}
