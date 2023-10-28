package si_regpagi_22166030_latihan20_targetsaldotabungan;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : pembuatan program target saldo tabungan sampai mencapai saldo target dengan ketentuan
 * saldo awal Rp. 3.500.000, bunga per bulan 8%, dan saldo target Rp. 6.000.000.
 */
public class SI_RegPagi_22166030_Latihan20_TargetSaldoTabungan {
    public static void main (String[] args) {
        double saldoAwal = 3500000; // Saldo Awal
        double bungaPerBulan = 0.08; // Bunga per bulan (15%)
        double SaldoTarget = 6000000; // Mulai dari bulan pertama
        int bulan = 1;
        while (saldoAwal <= SaldoTarget ) {
            // Menghitung bunga
            double bunga = saldoAwal * bungaPerBulan;

            // Menambahkan bunga ke saldo awal
            saldoAwal += bunga;
            
            // Menampilkan saldo setiap bulan
            System.out.println("Saldo di bulan ke- " + bulan + ": Rp. " + saldoAwal);
            //Pindah ke bulan berikutnya
            bulan++; 
        }
    }
    
}
