import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai AKhir");
        System.out.println("==================");
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int nilaiUAS = sc.nextInt();
        System.out.println("==================");
        System.out.println("==================");

        if (nilaiTugas > 100 || nilaiTugas < 0) {
            System.out.println("nilai tidak valid");
        } else if (nilaiKuis > 100 || nilaiKuis < 0) {
            System.out.println("nilai tidak valid");
        } else if (nilaiUTS > 100 || nilaiUTS < 0) {
            System.out.println("nilai tidak valid");
        } else if (nilaiUAS > 100 || nilaiUAS < 0) {
            System.out.println("nilai tidak valid");
        } else {
            double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);

            String nilaiHuruf;
            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("nilai akhir: " + nilaiAkhir);
            System.out.println("nilai huruf: " + nilaiHuruf);
            System.out.println("==================");
            if (nilaiAkhir >= 51 && nilaiAkhir <= 100) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        }
    }
}