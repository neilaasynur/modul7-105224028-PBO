import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<PerangkatPintar> objekList = new ArrayList<PerangkatPintar>();
        objekList.add(new AcPintar());
        objekList.add(new LampuPintar());

        for (PerangkatPintar list : objekList){
            list.aktifkan();
        }
        // hasil output yang berbeda dikarenakan adanya konsep overriding dan overloading
        // hal ini terjadi karena method anak/child menimpa method dari parentnya.
        // sehingga, meskipun method yang dipanggil berdasarkann referensi dari class parent, tetapi method yang dijalankan tetap berdasarkan objek aslinya
    }
}
