import java.util.ArrayList;
import java.util.logging.LogManager;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<PerangkatPintar> objekList = new ArrayList<PerangkatPintar>();
        objekList.add(new AcPintar());
        objekList.add(new LampuPintar());

        for (PerangkatPintar list : objekList){
            if (list instanceof AcPintar){
                AcPintar objekAc = (AcPintar) list;
                objekAc.aturSuhu(20);
            }
            list.aktifkan();
        }
        // hasil output yang berbeda dikarenakan adanya konsep overriding
        // hal ini terjadi karena method anak/child menimpa method dari parentnya.
        // sehingga, meskipun method yang dipanggil berdasarkann referensi dari class parent, tetapi method yang dijalankan tetap berdasarkan objek aslinya

        PerangkatPintar alat1 = new LampuPintar();
        // alat1.aturKecerahan(70, "Putih");
        // baris ini akan error karena tipe referensi PerangkatPintar bukan LampuPintar. di dalam class PerangkatPintar
        // tidak memiliki method aturKecerahan, sehingga ketika baris ini di compile objek akan bingung method ini digunakan untuk siapa. hal ini menyebabkan error

        if (alat1 instanceof LampuPintar){
            LampuPintar objekLampu = (LampuPintar) alat1;
            objekLampu.aturKecerahan(70, "Putih");
        }
    }
}
