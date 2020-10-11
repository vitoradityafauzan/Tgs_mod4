package com.prakpsd.no2; // Identitas Package

import java.io.BufferedReader; // Impor Fungsi input
import java.io.InputStreamReader;
import java.io.IOException;

public class Main extends Biodata{ // Class Main diwarisi class Biodata
    public static void main(String[] args) { // method utama
        InputStreamReader isr = new InputStreamReader(System.in); // Deklarasi objek
        BufferedReader br = new BufferedReader(isr);
        Biodata biot = new Biodata();

        String name, name2, name3, name4; // Deklarasi atribut
        int nim, nim2, nim3, nim4;

        try { // proses input data
            System.out.println("Isi Data Ketua: ");
            System.out.print("Nama = ");
            name = br.readLine();
            System.out.print("Nim  = ");
            nim = Integer.parseInt(br.readLine());

            System.out.println("Isi Data Wakil Ketua: ");
            System.out.print("Nama = ");
            name2 = br.readLine();
            System.out.println();
            System.out.print("Nim  = ");
            nim2 = Integer.parseInt(br.readLine());

            System.out.println("Isi Data Sekretaris: ");
            System.out.print("Nama = ");
            name3 = br.readLine();
            System.out.print("Nim  = ");
            nim3 = Integer.parseInt(br.readLine());

            System.out.println("Isi Data Bendahara: ");
            System.out.print("Nama = ");
            name4 = br.readLine();
            System.out.print("Nim  = ");
            nim4 = Integer.parseInt(br.readLine());

            // proses output data
            biot.chariman(name, nim);
            System.out.println();
            biot.vice(name2, nim2);
            System.out.println();
            biot.secretary(name3, nim3);
            System.out.println();
            biot.tresurer(name4, nim4);

        } catch (IOException e) { // Fungsi untuk memberitahu error input dari BufferedReader
            e.printStackTrace();

            System.out.println();

        }
    }
}

