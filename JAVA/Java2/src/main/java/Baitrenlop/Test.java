/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitrenlop;

/**
 *
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        Transport t1 = Transport.CAR;
        System.out.println("Transport"+t1);
        t1.printMaxSpeed();
        System.out.println("Compare:"+t1.compareTo(Transport.MOTOBIKE));
    }
}
