/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import javax.swing.UIManager;

/**
 *
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        NewClass a = new NewClass();
        try {
            a.setMark(7);
            System.out.println("mark" + a.getMark());
            a.setMark(20);
            System.out.println("mark" + a.getMark());
            
        } catch (InvalidMarkException ex) {
            System.out.println(ex.getMessage());
        }   
    }
    
    
    
    
}
