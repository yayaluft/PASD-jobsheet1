import java.util.Scanner;

public class fungsi {
    static String[] cabangToko = { "RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4" };
    static String[] bunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static int[] harga = { 75000, 50000, 60000, 10000 };
    static int[][] stock = { { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 } };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pendapatan = hitunPendapatan();

        System.out.println("=========================================");
        System.out.println("PENDAPATAN ROYAL CABANG ROYAL GARDEN");
        System.out.println("=========================================");

        for (int i = 0; i < cabangToko.length; i++) {
            status(pendapatan[i], cabangToko[i]);
        }
        System.out.println("=========================================");
    }

    public static int[] hitunPendapatan() {
        int[] pendapatan = new int[cabangToko.length];

        for (int i = 0; i < cabangToko.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < bunga.length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            pendapatan[i] = totalPendapatan;
        }
        return pendapatan;
    }

    public static void status(int pendapatan, String cabangToko) {
        if (pendapatan > 1500000) {
            System.out.println("Toko " + cabangToko);
            System.out.println("Pendapatan = Rp " + pendapatan);
            System.out.println("Status : Sangat Baik");
            System.out.println();
        } else {
            System.out.println("Toko " + cabangToko);
            System.out.println("Pendapatan = Rp " + pendapatan);
            System.out.println("Status = Perlu Evaluasi");
            System.out.println();
        }
    }
}