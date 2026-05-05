import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList <MetodePembayaran> metodeList = new ArrayList<MetodePembayaran>();
        metodeList.add(new EWallet());
        metodeList.add(new KartuKredit());
        
        for (MetodePembayaran list : metodeList){
            if (list instanceof EWallet){
                EWallet eWallet1 = (EWallet) list;
                eWallet1.metodeBayar(100000, "082299035254");
            } else if (list instanceof KartuKredit){
                KartuKredit kartuKredit1 = (KartuKredit) list;
                kartuKredit1.verifikasiPIN();
                kartuKredit1.metodeBayar(100000);
            } else {
                list.metodeBayar(100000);
            }
        }
    }
}
