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
public class BeratBox extends Box {
    // keyword extends agar bisa menggunakan atribut dari class Box.
    double berat; 

    // konstruktor klon dari suatu objek.
    BeratBox(BeratBox ob) { // memberi objek pada konstruktor.
        super(ob);
        berat = ob.berat;
    }

     // konstruktor ketika ukuran ditentukan.
    BeratBox(double l, double t, double d, double b) {
        super(l, t, d); // panggil superclass konstruktor.
        berat = b;
    }

    //default konstruktor.
    BeratBox() {
        super();
        berat = -1;
    }

    // konstruktor ketika kubus dibuat.
    BeratBox(double len, double b) {
        super(len);
        berat = b;
    }
}
    

