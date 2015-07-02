package TugasBesar;

import java.util.ArrayList;

/**
 * Created by blacklist on 8/23/2009.
 */
public class Liga {

    private String namaLiga;
    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();
    private Klub daftarKlub;



    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public Liga(String namaLiga, Klub daftarKlub) {
        this.namaLiga = namaLiga;
        this.daftarKlub = daftarKlub;
    }

    public String getNamaLiga() {
        System.out.println("Nama Liga");
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        System.out.println("Daftar Divisi");
        return daftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi) {
        this.daftarDivisi.add(divisi);
    }

    public Klub getDaftarKlub() {
        return daftarKlub;
    }

    public void setDaftarKlub(Klub daftarKlub) {
        this.daftarKlub = daftarKlub;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                '}';
    }
}
