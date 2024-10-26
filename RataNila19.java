import java.util.Scanner;

public class RataNila19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        int i=1;
        int j, nilaiMhs;
        float totalNilai, rataNilai;

        while (i <= 5) {
            totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke " + i);
            for(j=1; j<=5; j++) {
                System.out.print("Nilai ke-"+ j + " = ");
                nilaiMhs=input19.nextInt();
                totalNilai+=nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            i++;
        }
    }
}
