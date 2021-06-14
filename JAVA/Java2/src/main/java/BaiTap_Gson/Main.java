/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_Gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Main {
    static ArrayList<Student> list = new ArrayList<>();
    public static void write() {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        try {

            File file = new File("D:\\XFile\\Student.txt");
            FileWriter fw = new FileWriter(file);

            fw.write(json);
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        File file = new File("D:\\XFile\\Student.txt");
        Gson gson = new Gson();
        try {
            FileReader Fr = new FileReader(file);
            ArrayList<Student> list = gson.fromJson(Fr, new TypeToken<ArrayList<Student>>() {
            }.getType());
            for (Student object : list) {

                System.out.println(object);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        list.add(new Student("Hoa Quang Sy"));
        list.add(new Student("Hoàng Phi Hùng"));
     
        write();
        read();
    }

}
