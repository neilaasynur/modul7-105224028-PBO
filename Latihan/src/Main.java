import java.util.ArrayList;
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
    }
}
