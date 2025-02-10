import java.util.Scanner;

public class TabunganMenikah {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Apakah sudah memiliki calon pasangan? [ya / belum]: ");
        String pasangan = myObj.nextLine();

        System.out.print("Masukan jumlah uang tabungan: ");
        int tabungan = myObj.nextInt();

        boolean statusIzin = (tabungan > 100000000 && pasangan.equals("ya"));

        System.out.println("\nMemiliki Pasangan: " + pasangan);
        System.out.println("Jumlah Tabungan: Rp " + tabungan);
        System.out.println("Status Izin Menikah: " + statusIzin);
        

        myObj.close();
    }
}
