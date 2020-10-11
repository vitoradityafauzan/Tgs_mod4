package com.prakpsd.no2; // Identitas Package

public class Biodata{ // Identitas class

    // method untuk menerima data dan output \/

    public void chariman(String name, int nim) {
        System.out.println("Data Ketua:");
        System.out.println("Nama = " + name);
        System.out.println("Nim  = " + nim);
    }

    public void vice(String name2, int nim2) {
        System.out.println("Data Wakil Ketua:");
        System.out.println("Nama = " + name2);
        System.out.println("Nim  = " + nim2);
    }

    public void secretary(String name3, int nim3) {
        System.out.println("Data Sekretaris:");
        System.out.println("Nama = " + name3);
        System.out.println("Nim  = " + nim3);
    }

    public void tresurer(String name4, int nim4) {
        System.out.println("Data Bendahara:");
        System.out.println("Nama = " + name4);
        System.out.println("Nim  = " + nim4);
    }
}
