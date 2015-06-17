package al;

/**
 * Created by blacklist on 6/17/2015.
 */
public class Nasabah {

    private String namaDepan;
    private String namaBelakang;
    private int rek;
    private Account rekening;

    public Nasabah() {
    }

    public Nasabah(String namaDepan, String namaBelakang, int rek) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.rek = rek;
    }

    public Nasabah(String namaDepan, String namaBelakang, int rek, Account rekening) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.rek = rek;
        this.rekening = rekening;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public int getRek() {
        return rek;
    }

    public void setRek(int rek) {
        this.rek = rek;
    }

    public Account getRekening() {
        return rekening;
    }

    public void setRekening(Account rekening) {
        this.rekening = rekening;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "namaDepan='" + namaDepan + '\'' +
                ", namaBelakang='" + namaBelakang + '\'' +
                ", rek=" + rek +
                ", rekening=" + rekening +
                '}';
    }
}
