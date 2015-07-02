package TugasBesar;

/**
 * Created by blacklist on 8/23/2009.
 */
public class Klub {

    private String namaKlub;
    private Divisi divisi;
    private Liga liga;

    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public Klub(String namaKlub, Divisi divisi, Liga liga) {
        this.namaKlub = namaKlub;
        this.divisi = divisi;
        this.liga = liga;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public void setNamaKlub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public Divisi getDivisi() {
        return divisi;
    }

    public void setDivisi(Divisi divisi) {
        this.divisi = divisi;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "Klub{" +
                "namaKlub='" + namaKlub + '\'' +
                '}';
    }
}
