package al;
import java.util.Scanner;
/**
 * Created by blacklist on 6/17/2015.
 */
public class TestBank {
    public static void main(String[] args) {

        Account aa = new Account(20000000.0);
        System.out.println(aa.toString());
        Nasabah bb = new Nasabah("Prasetyo", "Pramono", 1441180041);
        System.out.println(bb.toString());

        bb.setRekening(aa);
        System.out.println(bb.toString());

//        tarik saldo sebesar 10 juta
        aa.tarik(10000000.0);
//        tampilkan saldo sekarang
        System.out.println("Tarik Rp. 10.000.000");
        System.out.println("Saldo Sekarang = " + aa.getSaldo());
//      setor saldo 5 juta
        aa.setor(5000000.0);
//        tampilkan saldo sekarang
        System.out.println("Setor Rp. 5.000.000");
        System.out.println("Saldo Sekarang = " +aa.getSaldo());
    }
}
