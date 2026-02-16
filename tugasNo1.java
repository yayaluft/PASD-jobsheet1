import java.util.Scanner;
public class tugasNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] plat = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] platKota = {
                { 'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' ' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' ' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' ' },
                { 'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' ' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' ' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' ' },
                { 'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }
        };

        System.out.print("Masukkan kode plat:");
        char kodeInput = sc.next().charAt(0);

        boolean found = false;
        for (int i =0; i < plat.length; i++) {
            if (kodeInput == plat[i]) {
                System.out.print("Kota: ");
                for (int j =0; j < platKota[i].length;j++) {
                    if (platKota[i][j] != ' ') {
                        System.out.print(platKota[i][j]);
                    }
                }
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kode tidak ditemukan");
        }
    }
}
