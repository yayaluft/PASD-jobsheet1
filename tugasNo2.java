import java.util.Scanner;

public class tugasNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] info = { "Nama Mata Kuliah", "Ruang", "Hari Kuliah", "Jam Kuliah" };

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] jadwal = new String[n][info.length];

        inputJadwal(jadwal, n);
        tampilData(jadwal, n);
        System.out.print("Cari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        tampilJadwalHari(jadwal, n, hari);

        System.out.print("Cari jadwal berdasarkan mata kuliah: ");
        String mk = sc.nextLine();
        tampilJadwalMatkul(jadwal, n, mk);
    }

    static void inputJadwal(String[][] jadwal, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Nama mata kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang           : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari            : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Waktu           : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilData(String[][] jadwal, int n) {
        System.out.println("====JADWAL====");
        System.out.printf("%-25s %-20s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0], jadwal[i][1],
                    jadwal[i][2], jadwal[i][3]);
        }
    }

    static void tampilJadwalHari(String[][] jadwal, int n, String hari) {
        boolean searching = false;

        System.out.println("====Jadwal Hari "+hari+"====");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println("Mata Kuliah :" + jadwal[i][0]);
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Waktu : " + jadwal[i][3]);
                System.out.println();
                searching = true;
            }
        }
        if (!searching) {
            System.out.println("Jadwal tidak tersedia.");
        }
    }

    static void tampilJadwalMatkul(String[][] jadwal, int n, String mk) {
        boolean searching = false;

        System.out.println("====JADWAL MATA KULIAH "+mk+"====");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("Mata Kuliah :" + jadwal[i][0]);
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari : "+jadwal[i][2]);
                System.out.println("Waktu : " + jadwal[i][3]);
                System.out.println();
                searching = true;
            }
        }
        if (!searching) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}