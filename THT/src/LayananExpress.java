public class LayananExpress extends LayananEkspedisi{
    //constructor
    LayananExpress (String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){
        //memanggil super untuk mendapatkan value dari atribut yang telah ada pada parent
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }
    
    //overriding method ongkir dengan membuat harga jarak per km adalah 30000
    @Override
    public double hitungOngkir (){
        double ongkir = 30000 * super.hitungBeratEfektif();
        //kembalikan nilai ongkir awal
        return ongkir;
    }

    //method yang berfungsi untuk klaim asuransi dari paket
    void klaimAsuransi (double nilaiBarang){
        //jika nilai barang yang dikirim melebihi 1000000 (sejuta), asuransi yang digunakan adalah yang VIP
        if (nilaiBarang > 1000000){
            System.out.println ("Klaim Asuransi VIP Rp" + nilaiBarang + " untuk resi " + super.nomorResi + " sedang diproses prioritas.");
        } else {
            //jika nilai barang tidak mencapai 1000000 (sejuta), maka akan menggunakan asuransi standar
            System.out.println ("Klaim Asuransi Standar diproses dalam 7 hari kerja.");
        }
    }


}
