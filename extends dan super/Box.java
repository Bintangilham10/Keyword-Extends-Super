/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance4;

/**
 *
 * @author Bintang.Ilham
 */
public class Box {
    // deklarasi variable instance.
    public double lebar;
    public double tinggi;
    public double dalam;

    // konstruktor klon dari suatu objek.
    Box(Box ob) { // memberi objek pada konstruktor.
        lebar = ob.lebar;
        tinggi = ob.tinggi;
        dalam = ob.dalam;
    }

    // konstruktor ketika ukuran ditentukan.
    Box(double l, double t, double d) {
        lebar = l;
        tinggi = t;
        dalam = d;
    }

    // konstruktor ketika ukuran tidak ditentukan.
    Box() {
        lebar = -1; // indikasi -1
        tinggi = -1; // tidak diinisialisasi
        dalam = -1; // box
    }

    // konstruktor ketika kubus dibuat.
    Box(double len) {
        lebar = tinggi = dalam = len;
    }

    // hitung dan mengembalikan volum.
    double volume() {
        return  lebar*tinggi*dalam;
    }
}
    

