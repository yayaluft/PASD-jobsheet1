import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String [] matkul = new String[n];
        int [] sks = new int[n];
        int[] nilai  = new int[n];
        double [] setara = new double[n];
        String [] huruf = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Mata Kuliah ke-"+(i+1));
            System.out.print("Nama mata kuliah: ");
            matkul[i] = sc.nextLine();
            System.out.print("Bobot SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Nilai angka: ");
            nilai[i] =sc.nextInt();
            sc.nextLine();
            
            if(nilai[i] >= 80) {
                huruf[i] = "A";
                setara[i] = 4.0;
            } else if (nilai[i] >= 73) {
                huruf[i] = "B+";
                setara[i] = 3.5;
            } else if (nilai[i] >= 65) {
                huruf[i] = "B";
                setara[i] = 3.0;
            } else if (nilai[i] >= 60) {
                huruf[i] = "C+";
                setara[i] = 2.5;
            } else if (nilai[i] >= 50) {
                huruf[i] = "C";
                setara[i] = 2.0;
            } else if (nilai[i] >= 39) {
                huruf[i] = "D";
                setara[i] = 1.0;
            } else {
                huruf[i] = "E";
                setara[i] = 0.0;
            }
        }
       
        System.out.println("=======================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("=======================");
        System.out.printf("%-25s %-10s %-10s %-10s\n",
                "Mata Kuliah", "Nilai", "Huruf", "Mutu");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-10d %-10s %-10.2f\n",
                    matkul[i], nilai[i], huruf[i], setara[i]);
        }
        double total = 0;
        int totalSKS = 0;

        for (int i = 0; i < n; i++) {
            total += setara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = total / totalSKS;

       System.out.println("\nIP Semester = " + ip);
    }
}