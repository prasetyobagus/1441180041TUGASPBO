package com.pras;

/**
 * Created by blacklist on 6/10/2015.
 */
public class TestClass {

    public static void main(String[] args) {

        Penulis rendy = new Penulis("Rendy", "Jl. Jomblo", 'L', "Lajang", 19);

        Buku harryPotter = new Buku("Harry Potter", 100.000 , "Sony Production", rendy);

        System.out.println(harryPotter.getCreatedBy().getAlamatPenulis());
    }


}
