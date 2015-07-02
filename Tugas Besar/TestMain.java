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

        Klub arema1 = new Klub("Arema Cronus",lpi,indonesia);
        Klub persib = new Klub("Persib Bandung",lpi,indonesia);


        indonesia.setDaftarDivisi(isl);
        indonesia.setDaftarDivisi(lpi);


        isl.setDaftarKlub(arema);
        isl.setDaftarKlub(persebaya);

        lpi.setDaftarKlub(arema1);
        lpi.setDaftarKlub(persib);

//        No 1(Get Divisi dengan nama Liga)
        System.out.println("Nomer 1 Get daftar divisi by nama liga");
        System.out.println(indonesia.getDaftarDivisi());
        System.out.println("");

//        No 2(Get
        System.out.println("Nomer 2 get daftar klub by nama liga");
        indonesia.setDaftarKlub(arema);
        System.out.println(indonesia.getNamaLiga());
        System.out.println(indonesia.getDaftarKlub());
        System.out.println("");


//        No 3(Get
        System.out.println("Nomer 3 get daftar klub by nama divisi");
        System.out.println(isl.getDaftarKlub());
        System.out.println(lpi.getDaftarKlub());
        System.out.println("");


//        No 4(Get
        System.out.println("Nomer 4 get klub ini berada di divisi mana by nama klub");
        System.out.println(arema.getNamaKlub());
        System.out.println(arema.getDivisi());
        System.out.println("");

//        No 5(get
        System.out.println("Nomer 5 get klub ini berada di liga apa by nama klub");
        arema.setLiga(divisi1);
        arema.getNamaKlub();
        System.out.println(arema.getNamaKlub());
        System.out.println(arema.getLiga());
        System.out.println("");


    }
}
