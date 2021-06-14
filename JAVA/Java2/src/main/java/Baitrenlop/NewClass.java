/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitrenlop;
import java.lang.Integer;
/**
 *
 * @author Administrator
 */
public class NewClass {
    public static void main(String[] args) {
        GenericEx<String> gl = new GenericEx<>("123");
        System.out.println(gl.greeting());
        GenericEx<Integer> g2 = new GenericEx<>(1234);
        System.out.println(g2.greeting());
    }
    
    
}
