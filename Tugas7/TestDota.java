package com.pras;

/**
 * Created by blacklist on 6/11/2015.
 */
public class TestDota {

    public static void main(String[] args) {

        Dota traxex = new Dota("Traxex", "Frost Arrows, Gust, Trueshot Aura, Marksmanship", 4, "Mele", "Range");
        System.out.println(traxex.getNamaHeroDota());
        System.out.println(traxex.getSkillDota());
        System.out.println(traxex.getJumlahSkill());
        System.out.println(traxex.getSex());
        System.out.println(traxex.getJenisSenjata());

        Inventori butterfly = new Inventori("Butterfly", "Eaglehorn, Talisman of Evasion, recipe", "+30 Agility, +30 Damage+, +30 Attack Speed, +35 Evasion", 6000, traxex);
        System.out.println("-----Inventori-----");
        System.out.println("Build :" +butterfly.getBuildInven());
        System.out.println("Resep :" +butterfly.getResep());
        System.out.println("Efek :" +butterfly.getEfek());
        System.out.println("Harga :" +butterfly.getHarga());
        System.out.println(butterfly.getHeroby());
    }
}
