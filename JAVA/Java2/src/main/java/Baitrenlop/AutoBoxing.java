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
public class AutoBoxing {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        int c = 100;
        i.shortValue();
        Integer.parseInt("xxx");
        System.out.println(i);
        
    }
}
