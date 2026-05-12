public class LayananInternasional extends LayananEkspedisi{
    //atribut tambahan untuk kelas layanan internasional
    public String negaraTujuan;
    public double nilaiBarangUSD;

    //constructor
    LayananInternasional (String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD){
        //memanggil super untuk value yang sudah ada dari parent
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
        //mengisi value dari inputan parameter
        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    //overriding method hitung ongkir dengan biaya per km adalah 20000 dari berat efektif barang
    @Override
    public double hitungOngkir (){
        double hargaAwal = 200000 * super.hitungBeratEfektif();
        //jika harga barang melebihi $50, maka akan dikenai pajak
        if (nilaiBarangUSD > 50){
            //pajak yang akan ditambah ke biaya ongkir ada sebesar 20% dari harga ongkir awal
            double pajak = 0.2 * hargaAwal;
            return hargaAwal + pajak;
        }
        //jika harga dibawah $50, maka kembalikan nilai ongkir awal
        return hargaAwal;
    }

    //mencetak manifest untuk barang yang mau dikirim
    void cetakManifest() {
        System.out.println("Manifest Internasional ke " + negaraTujuan + " - Deklarasi Nilai: $" + nilaiBarangUSD);
    }
}
