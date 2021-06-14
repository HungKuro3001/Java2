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
public class ThreadEx extends Thread {
    
    public ThreadEx(String name){
        super(name);
        
    }

    
    @Override
    public void run(){
        synchronized (this){
        try {
             for(int i = 0; i<10; i++){
            System.out.println(getName()+ ":"+i);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    }
        
        
}
