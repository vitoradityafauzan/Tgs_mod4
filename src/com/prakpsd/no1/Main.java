package com.prakpsd.no1; // Identitas package

import java.util.Scanner; // mengimpor fungsi input

public class Main { // identitas class
    // method untuk menerima data dan ouput \/
    static void celcius(float c) {
        float f, r, k;

        f = (c * 9/5) + 32;
        r = c * 4/5;
        k = c + 273;

        System.out.println("Celcius = " + c);
        System.out.println("To Fahrenheit = " + f);
        System.out.println("To Reamur = " + r);
        System.out.println("To Kelvin = " + k);
    }

    static void fahrenheit(float f) {
        float c, r, k;

        c = (f * 5/9) - 32;
        r = (f * 4/9) - 32;
        k = (f * 5/9) - 32 + 273;

        System.out.println("Fahrenheit = " + f);
        System.out.println("To Celcius = " + c);
        System.out.println("To Reamur = " + r);
        System.out.println("To Kelvin = " + k);
    }

    static void reamur(float r) {
        float c, f, k;

        c = r * 5/4;
        f = (r * 9/4) + 32;
        k = (r * 5/4) + 273;

        System.out.println("Reamur = " + r);
        System.out.println("To Celcius = " + c);
        System.out.println("To Fahrenheit = " + f);
        System.out.println("To Kelvin = " + k);
    }

    static void kelvin(float k) {
        float c, f, r;

        c = k - 273;
        f = (k * 9/5) - 273 + 32;
        r = (k * 4/5) - 273;

        System.out.println("Kelvin = " + k);
        System.out.println("To Celcius = " + c);
        System.out.println("To Fahrenheit = " + f);
        System.out.println("To Reamur = " + r);
    }


    public static void main(String[] args) { // method utama
        Scanner scan = new Scanner(System.in); // deklarasi objek

        System.out.println(" === Program Konversi Suhu === ");
        System.out.println("Pilihan 1. Suhu Awal Celcius");
        System.out.println("Pilihan 2. Suhu Awal Fahrenheit");
        System.out.println("Pilihan 3. Suhu Awal Reamur");
        System.out.println("Pilihan 4. Suhu Awal Kelvin");
        System.out.print("Masukan Pilihan = ");
        int pilih = scan.nextInt(); // Input data penentuan switch case

        System.out.println("");

        switch (pilih) { // Proses input data
            case 1:
                System.out.print("Masukan Suhu = ");
                celcius(scan.nextFloat());
                break;
            case 2:
                System.out.print("Masukan Suhu = ");
                fahrenheit(scan.nextFloat());
                break;
            case 3:
                System.out.print("Masukan Suhu = ");
                reamur(scan.nextFloat());
                break;
            case 4:
                System.out.print("Masukan Suhu = ");
                kelvin(scan.nextFloat());
                break;
        }

        System.out.println("");

    }
}