public class LayananReguler extends LayananEkspedisi{
    //constructor
    public LayananReguler (String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    //overiding method hitung ongkir dengan harga ongkir per km adalah 15000. dan mengembalikan nilai ongkir hasil hitungan
    @Override
    public double hitungOngkir (){
        double ongkir = 15000.0 * beratAktualKg;
        return ongkir;
    }

    //overloading method. sebuah method yang sama untuk menghitung ongkir. memiliki perbedaan pada parameter. jika memiliki inputan keterangan member dan ada inputan jarak, maka akan menggunakan method ini
    public double hitungOngkir (boolean isMember, int jarakKm){
        //menghitung ongkir awal yang mesti di bayar
        double hargaAwal = hitungOngkir();
        //jika member bernilai true, akan masuk percabangan
        if (isMember){
            //diberikan diskon 10% dari ongkir asli yang mesti dibayarkan
            double diskon = 0.1 * hargaAwal;
            //biaya tambahan yang akan dikenai per jarak kirim
            double surcharge = 500.0 *jarakKm;
            //hitung ulang ongkir, dan kembalikan nilai ongkir setelah dikurangi diskon dan ditambah dengan biaya tambahan
            double ongkir = hargaAwal - diskon + surcharge;
            return ongkir;
        }
        //jika bukan merupakan member, maka kembalikan ongkir awal yang sebelumnya telah dihitung
        return hargaAwal;
    }
}
