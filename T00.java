import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;

        System.out.println("Masukkan bilangan pertama");
        a = Integer.parseInt(input.nextLine());
        System.out.println("Masukkan bilangan kedua");
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("Bilangan pertama genap");
        } else {
            System.out.println("Bilangan pertama ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("Bilangan kedua genap");
        } else {
            System.out.println("Bilangan kedua ganjil");
        }
        if (a == b) {
            System.out.println("Kedua bilangan sama besar");
        } else {
            System.out.println("Berbeda jenis");
            if (a < b) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Bilangan kedua lebih kecil");
            }
        }
        if (a % 2 == 0 && b % 2 == 0) {
            c = a + b;
            System.out.println("Hasil penjumlahan" + c);
        } else {
            if (b + 1 % 2 == 0 && a % 2 == 0) {
                d = a * b;
                System.out.println("Hasil perkalian" + " " + d);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}
