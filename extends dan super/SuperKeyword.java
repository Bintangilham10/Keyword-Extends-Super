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
public class SuperKeyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BeratBox box1 = new BeratBox(10, 20, 15, 34.3);
        BeratBox box2 = new BeratBox(2, 3, 4, 0.076);
        BeratBox box3 = new BeratBox(); //ketika default.
        BeratBox kubus = new BeratBox(3, 2);
        BeratBox klon = new BeratBox(box1);
        
        double vol;
        vol = box1.volume();
        System.out.println("Volume dari Box 1 adalah " + vol);
        System.out.println("Berat dari Box 1 adalah " + box1.berat);
        System.out.println();
        vol = box2.volume();
        System.out.println("Volume dari Box 2 adalah " + vol);
        System.out.println("Berat dari Box 2 adalah " + box2.berat);
        System.out.println();
        vol = box3.volume();
        System.out.println("Volume dari Box 3 adalah " + vol);
        System.out.println("Berat dari Box 3 adalah " + box3.berat);
        System.out.println();
        vol = klon.volume();
        System.out.println("Volume dari Klon(box1) adalah " + vol);
        System.out.println("Berat dari Klon(box1 adalah " + klon.berat);
        System.out.println();
        vol = kubus.volume();
        System.out.println("Volume dari Kubus adalah " + vol);
        System.out.println("Berat dari Kubus adalah " + kubus.berat);
        System.out.println();
    }
}
 