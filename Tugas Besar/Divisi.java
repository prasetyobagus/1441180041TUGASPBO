package TugasBesar;

import java.util.ArrayList;

/**
 * Created by blacklist on 8/23/2009.
 */
public class Divisi {


    private String namaDivisi;
    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();
    ArrayList<Klub> namaKlub = new ArrayList<Klub>();

    public Divisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public ArrayList<Klub> getDaftarKlub() {
        System.out.println("Daftar Klub: ");
        return daftarKlub;
    }

    public void setDaftarKlub(Klub klub) {
        this.daftarKlub.add(klub);
    }

    public ArrayList<Klub> getNamaKlub() {
        return namaKlub;
    }

    public void setNamaKlub(Klub namaKlub) {
        this.namaKlub.add(namaKlub);
    }

    @Override
    public String toString() {
        return "Divisi{" +
                "namaDivisi='" + namaDivisi + '\'' +
                '}';
    }
}
