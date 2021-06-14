/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_Gson;

/**
 *
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
//        MyThread thread1 = new MyThread("Thread 1");
//        MyThread thread2 = new MyThread("Thread 2");
//        thread1.start();
//        thread2.start();
//        System.out.println("Finish!");
    ThreadEx t1 = new ThreadEx("Thread 1");
    ThreadEx t2 = new ThreadEx("Thread 2");
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }
}
