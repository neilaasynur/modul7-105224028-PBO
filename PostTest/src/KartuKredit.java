public class KartuKredit extends MetodePembayaran{
    @Override
    void metodeBayar (double nominal){
        System.out.println("Mencetak tagihan Kartu Kredit sebesar Rp" + nominal);
    }
    void verifikasiPIN (){
        System.out.println("Memverifikasi PIN Kartu Kredit... BERHASIL!");
    }
}
