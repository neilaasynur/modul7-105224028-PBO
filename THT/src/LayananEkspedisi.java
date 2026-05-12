public class LayananEkspedisi {
    //atribut dasar untuk setiap kelas layanan
    public String nomorResi;
    public double beratAktualKg;
    public double panjang;
    public double lebar;
    public double tinggi;

    //constructor 
    public LayananEkspedisi (String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    //method yang berguna menghitung berat dari barang
    public double hitungBeratEfektif(){
        //mgnhitung volume dari sebuah barang
        double volume = (panjang * lebar * tinggi ) / 6000;
        //pengecekan jika volume lebih besar dibandingkan berat aktual
        if (volume > beratAktualKg){
            //maka yang akan dikembalikan adalah nilai volume
            return volume;
        }
        //jika volume lebih kecil dari berat aktual barang, maka nilai berat aktual yang akan dikembalikan
        return beratAktualKg;
    }

    //method penghitungan ongkir yang di atur default dengan 0.0
    public double hitungOngkir (){
        return 0.0;
    }


    //mencetak resi dari setiap penggunaan layanan dengan menampilkan nomor resi dan berat dari barang
    void cetakResi (){
        System.out.println("Nomor resi: " + nomorResi + "\nBerat efektif: " + hitungBeratEfektif() + "kg");
    }
}
