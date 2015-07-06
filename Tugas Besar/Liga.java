package TugasBesar;

import java.util.ArrayList;

/**
 * Created by blacklist on 8/23/2009.
 */
public class Liga {

    private String namaLiga;
    private Klub daftarKlub;
    private Divisi divisi;

    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();
    ArrayList<Divisi> namaDivisi = new ArrayList<Divisi>();

    public ArrayList<Klub> getDaftarKlub(Divisi namaDivisi){
        return daftarKlub.getDivisi().daftarKlub;
    }

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

    public ArrayList<Divisi> getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(Divisi namaDivisi ) {
        this.namaDivisi.add(namaDivisi);
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

    public void getDaftarDivisi(String liga)
    {
        if (liga == getNamaLiga())
        {
            for (int j = 0; j <daftarDivisi.size() ; j++)
            {
                System.out.println(daftarDivisi.get(j));
            }
        }
        else
        {
            System.out.println("Tidak Dapat Ditemukan");
        }

    }


    @Override
    public String toString() {
        return "Liga{" +
                "daftarKlub=" + daftarKlub +
                ", namaLiga='" + namaLiga + '\'' +
                '}';
    }
}
