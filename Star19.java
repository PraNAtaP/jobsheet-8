import java.util.Scanner;

public class Star19 {

    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        int n, i;

        System.out.print("Masukkan nilai N = ");
        n = input19.nextInt();

        for(i=1; i<=n; i++) {
            System.out.print("*");
        }

    }
}