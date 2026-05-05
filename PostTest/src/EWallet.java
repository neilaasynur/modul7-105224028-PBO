public class EWallet extends MetodePembayaran{
    @Override
    void metodeBayar (double nominal){
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal);
    }

    void metodeBayar (double nominal, String nomorHp){
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + " dari nomor " + nomorHp);
    }
}
