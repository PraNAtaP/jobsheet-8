import java.util.Scanner;

public class Porseni19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        String caBor;
        String nama;
        int jmlPoltek;
        
        System.out.print("Jumlah Politeknik yang mendaftar: ");
        jmlPoltek = input19.nextInt(); 
        input19.nextLine(); 
        
        for (int i = 1; i <= jmlPoltek; i++) {
            System.out.println("Politeknik ke-" + i);
            System.out.println("Masukkan nama atlet untuk cabang olahraga berikut:");
            caBor = "Badminton";
            System.out.println("Cabang Olahraga : " + caBor);
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nama atlet ke-" + j + " : ");
                nama = input19.nextLine();
                System.out.println("Atlet ke-" + j + " : " + nama);
            }
            caBor = "Tenis Meja";
            System.out.println("Cabang Olahraga : " + caBor);
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nama atlet ke-" + j + " : ");
                nama = input19.nextLine();
                System.out.println("Atlet ke-" + j + " : " + nama);
            }
            caBor = "Basket";
            System.out.println("Cabang Olahraga : " + caBor);
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nama atlet ke-" + j + " : ");
                nama = input19.nextLine();
                System.out.println("Atlet ke-" + j + " : " + nama);
            }
            caBor = "Volly";
            System.out.println("Cabang Olahraga : " + caBor);
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nama atlet ke-" + j + " : ");
                nama = input19.nextLine();
                System.out.println("Atlet ke-" + j + " : " + nama);
            }
        }
    }
}
