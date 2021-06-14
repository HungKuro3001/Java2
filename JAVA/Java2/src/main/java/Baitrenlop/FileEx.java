/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitrenlop;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Administrator
 */
public class FileEx {
    private static void write(){
        File file = new File("D:\\XFile\\demo.dat");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Ví dụ");
            writer.write("\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    private static void read(){
        File file = new File("D:\\XFile\\demo.dat");
        try {
            FileReader reader = new FileReader(file);
            int c = reader.read();
            while(c!=-1){
                System.out.println((char)c);
                c = reader.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        write();
        read();
    }
}
