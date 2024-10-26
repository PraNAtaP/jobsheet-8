import java.util.Scanner;

public class Square19 {

    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        int n, iOuter;

        System.out.print("Masukan nilai N = ");
        n = input19.nextInt();

        for(iOuter=1; iOuter<=n; iOuter++) {
        for(int i=0; i<=n; i++) { 
            System.out.print("*");
            }
            System.out.println();
        } 
    }
}
