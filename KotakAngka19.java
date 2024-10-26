import java.util.Scanner;

public class KotakAngka19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        
        int N;
        int i = 0;

        System.out.print("Masukkan nilai N : ");
        N = input19.nextInt();
    
        while (i < N) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N-1 || j == 0 || j == N-1) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            i++;
        }
    }
}
