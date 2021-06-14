/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class NewClass {
    private double mark;

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) throws ArithmeticException, InvalidMarkException {
        this.mark = mark;
        if(mark>10||mark<0){
        throw new InvalidMarkException("Mark is not valid");
        }else{
            this.mark = mark;
        }
    }
    public void getMarksFromFile() throws IOException{
      
            File f = new File("C:/abc");
        
    }
}
