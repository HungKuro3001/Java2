/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Staff implements Serializable{
    protected String id;
    protected String name;
    protected int    age;
    protected String email;
    protected double salary;

    public Staff() {
    }

    public Staff(String id, String name, int age, String email, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", salary=" + salary + '}';
    }


}
