/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class StudentList {

    ArrayList<Student> stl = new ArrayList<Student>();

    public void them(Student st) {
        stl.add(st);
    }
}
