package com.pras;

/**
 * Created by blacklist on 6/11/2015.
 */
public class Inventori {

    private String buildInven;
    private String resep;
    private String efek;
    private String durasiEfek;
    private int harga;
    private Dota heroby;

    public Inventori() {
    }

    public Inventori(String buildInven, String resep, String efek, int harga, Dota heroby) {
        this.buildInven = buildInven;
        this.resep = resep;
        this.efek = efek;
        this.harga = harga;
        this.heroby = heroby;
    }

    public Inventori(String buildInven, String resep, String efek, String durasiEfek, int harga, Dota heroby) {
        this.buildInven = buildInven;
        this.resep = resep;
        this.efek = efek;
        this.durasiEfek = durasiEfek;
        this.harga = harga;
        this.heroby = heroby;
    }

    public String getBuildInven() {
        return buildInven;
    }

    public void setBuildInven(String buildInven) {
        this.buildInven = buildInven;
    }

    public String getResep() {
        return resep;
    }

    public void setResep(String resep) {
        this.resep = resep;
    }

    public String getEfek() {
        return efek;
    }

    public void setEfek(String efek) {
        this.efek = efek;
    }

    public String getDurasiEfek() {
        return durasiEfek;
    }

    public void setDurasiEfek(String durasiEfek) {
        this.durasiEfek = durasiEfek;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Dota getHeroby() {
        return heroby;
    }

    public void setHeroby(Dota heroby) {
        this.heroby = heroby;
    }

    @Override
    public String toString() {
        return "Inventori{" +
                "buildInven='" + buildInven + '\'' +
                ", resep='" + resep + '\'' +
                ", efek='" + efek + '\'' +
                ", durasiEfek='" + durasiEfek + '\'' +
                ", harga=" + harga +
                ", heroby=" + heroby +
                '}';
    }
}
