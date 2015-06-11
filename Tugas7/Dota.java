package com.pras;

/**
 * Created by blacklist on 6/11/2015.
 */
public class Dota {

    private String namaHeroDota;
    private String skillDota;
    private int jumlahSkill;
    private String sex;
    private String jenisSenjata;

    public Dota() {
    }

    public Dota(String namaHeroDota, String skillDota, String jenisSenjata) {
        this.namaHeroDota = namaHeroDota;
        this.skillDota = skillDota;
        this.jenisSenjata = jenisSenjata;
    }

    public Dota(String namaHeroDota, String skillDota, int jumlahSkill) {
        this.namaHeroDota = namaHeroDota;
        this.skillDota = skillDota;
        this.jumlahSkill = jumlahSkill;
    }

    public Dota(String namaHeroDota, String skillDota, int jumlahSkill, String sex, String jenisSenjata) {
        this.namaHeroDota = namaHeroDota;
        this.skillDota = skillDota;
        this.jumlahSkill = jumlahSkill;
        this.sex = sex;
        this.jenisSenjata = jenisSenjata;
    }

    public String getNamaHeroDota() {
        return namaHeroDota;
    }

    public void setNamaHeroDota(String namaHeroDota) {
        this.namaHeroDota = namaHeroDota;
    }

    public String getSkillDota() {
        return skillDota;
    }

    public void setSkillDota(String skillDota) {
        this.skillDota = skillDota;
    }

    public int getJumlahSkill() {
        return jumlahSkill;
    }

    public void setJumlahSkill(int jumlahSkill) {
        this.jumlahSkill = jumlahSkill;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJenisSenjata() {
        return jenisSenjata;
    }

    public void setJenisSenjata(String jenisSenjata) {
        this.jenisSenjata = jenisSenjata;
    }

    @Override
    public String toString() {
        return "Dota{" +
                "namaHeroDota='" + namaHeroDota + '\'' +
                ", skillDota='" + skillDota + '\'' +
                ", jumlahSkill=" + jumlahSkill +
                ", sex='" + sex + '\'' +
                ", jenisSenjata='" + jenisSenjata + '\'' +
                '}';
    }
}
