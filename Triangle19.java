import java.util.Scanner;

public class Triangle19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        int n;
        int i = 0, j = 0;

        System.out.print("Masukkan nilai N : ");
        n = input19.nextInt();

        while (i <= n) {
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}