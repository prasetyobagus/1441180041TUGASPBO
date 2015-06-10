package com.pras;

/**
 * Created by blacklist on 6/10/2015.
 */
public class Buku {

    private String namaBuku;
    private Double harga;
    private String penerbit;
    private Penulis createdBy;

    public Buku() {
    }

    public Buku(String namaBuku, Penulis createdBy) {
        this.namaBuku = namaBuku;
        this.createdBy = createdBy;
    }

    public Buku(Double harga, String penerbit) {
        this.harga = harga;
        this.penerbit = penerbit;
    }

    public Buku(String namaBuku, Double harga, String penerbit, Penulis createdBy) {
        this.namaBuku = namaBuku;
        this.harga = harga;
        this.penerbit = penerbit;
        this.createdBy = createdBy;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Penulis getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Penulis createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "namaBuku='" + namaBuku + '\'' +
                ", harga=" + harga +
                ", penerbit='" + penerbit + '\'' +
                ", createdBy=" + createdBy +
                '}';
    }
}
