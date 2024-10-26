//INI SUDAH MODIFIKASI

import java.util.Scanner;

public class Triangle19Mod {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        int n;
        int i, j;

        System.out.print("Masukkan nilai N : ");
        n = input19.nextInt();

        i = 1; 
        while (i <= n) {
            j = 0; 
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

