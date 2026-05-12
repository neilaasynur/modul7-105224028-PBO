//import package untuk penggunaan array list
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        //deklare array list dengan referensi ke parent class
        ArrayList<LayananEkspedisi> listLayanan = new ArrayList<LayananEkspedisi>();
        //mengisi list dengan masing masing child class
        listLayanan.add(new LayananReguler("REG-11", 2, 50, 50, 50));
        listLayanan.add(new LayananExpress("EXP-22", 5, 10, 10, 10));
        listLayanan.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100));

        //variabel total pendapatan perusahaan untuk menghitung pendapatan dari ongkir setiap paket
        double totalPendapatanPerusahaan = 0.0;

        //perulangan untuk mencetak resi setiap paket yang dikirim
        for (LayananEkspedisi list : listLayanan) {
            //memanggil fungsi cetak resi
            list.cetakResi();
            //setiap perulangan akan menghitung pendapatan dari menambahkan hasil perhitungan ongkir awal
            totalPendapatanPerusahaan += list.hitungOngkir();
            //downcasting jika memenuhi syarat percabangan
            if (list instanceof LayananReguler){
                //jika merupakan layanan reguler, tampilkan harga ongkir yang mesti dibayarkan jika merupakan member dengan jarak kirim 25km
                System.out.println("Ongkir yang mesti dibayarkan adalah sebesar Rp" + ((LayananReguler) list).hitungOngkir(true, 25));
            } else if (list instanceof LayananExpress){
                //jika merupakan layanan ekspres panggil fungsi klaim asuransi dengan nilai barang sebesar 1500000
                ((LayananExpress) list).klaimAsuransi(1500000);
            } else if (list instanceof LayananInternasional){
                //jika merupakan layanan internasional, cetak manifest dari barang
                ((LayananInternasional) list).cetakManifest();
            }
        }
        //terakhir tampilkan pendapatan yang di dapatkan oleh perusahaan dari pembayaran ongkir awal
        System.out.println("Pendapatan perusahaan dari ongkir dasar adalah Rp" + totalPendapatanPerusahaan);
    }
}
