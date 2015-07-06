package TugasBesar;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.ArrayList;

/**
 * Created by blacklist on 8/23/2009.
 */
public class TestMain {

    public static void main(String[] args) {
//      Membuat Objek
        Liga indonesia = new Liga("Indonesia");
        Liga divisi1 = new Liga("Divisi Utama");

        Divisi isl = new Divisi("Indonesia Super Legue");
        Divisi lpi = new Divisi("Liga Primer Indonesia");

        Klub arema = new Klub("Arema Indonesia",isl,indonesia);
        Klub persebaya = new Klub("Persebaya",isl,indonesia);

        Klub arema1 = new Klub("Arema Cronus",lpi,divisi1);
        Klub persib = new Klub("Persib Bandung",lpi,divisi1);


        indonesia.setDaftarDivisi(isl);
        divisi1.setDaftarDivisi(lpi);


        indonesia.setDaftarKlub(arema);
        indonesia.setDaftarKlub(persebaya);

        divisi1.setDaftarKlub(arema1);
        divisi1.setDaftarKlub(persib);

        isl.setDaftarKlub(arema);
        isl.setDaftarKlub(persebaya);

        lpi.setDaftarKlub(arema1);
        lpi.setDaftarKlub(persib);



//
        System.out.println("Tambahan Pak Prima");
        System.out.println("dari liga manggil semua klub dari divisi");
        System.out.println(indonesia.getDaftarKlub(isl));
        System.out.println(divisi1.getDaftarKlub(lpi));
        System.out.println("");

        System.out.println("Tambahan dari pak. Prima");
        indonesia.setNamaDivisi(isl);
        isl.setNamaKlub(arema);
        System.out.println(isl.getNamaKlub());
        System.out.println(indonesia.getNamaDivisi());
        System.out.println("");


//
        System.out.println("Nomer 1 Get daftar divisi by nama liga");
        indonesia.setNamaDivisi(lpi);
        indonesia.getDaftarDivisi();
        System.out.println(indonesia.getNamaLiga());
        System.out.println(indonesia.getNamaDivisi());
        System.out.println("");

//
        System.out.println("Nomer 2 get daftar klub by nama liga");
        indonesia.setDaftarKlub(arema);
        System.out.println(indonesia.getNamaLiga());
        System.out.println(indonesia.getDaftarKlub());
        System.out.println("");


//
        System.out.println("Nomer 3 get daftar klub by nama divisi");
        System.out.println(isl.getDaftarKlub());
        System.out.println(lpi.getDaftarKlub());
        System.out.println("");


//
        System.out.println("Nomer 4 get klub ini berada di divisi mana by nama klub");
        System.out.println(arema.getNamaKlub());
        System.out.println(arema.getDivisi());
        System.out.println("");

//        No 5(get
        System.out.println("Nomer 5 get klub ini berada di liga apa by nama klub");
        arema.setLiga(divisi1);
        arema.setLiga(indonesia);
        System.out.println(arema.getNamaKlub());
        System.out.println(arema.getLiga());
        System.out.println("");



    }
}
