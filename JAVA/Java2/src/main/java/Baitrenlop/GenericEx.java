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
public class GenericEx<T> {
    private T ex01;
    public GenericEx(T t){
        ex01  = t;
    }
    public String greeting(){
        return "Hello generics: ";
    }
    
}
