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
public enum Transport {
    CAR(200),
    MOTOBIKE(80),
    BYCYCLE(50),
    TRAIN(100),
    AIRPLANE(1000);
    private int maxSpeed = 0;
    
    private Transport(int speed){
        this.maxSpeed = speed;
        System.out.println("Tạo transport:" + speed);
    }
    public void printMaxSpeed(){
        System.out.println("Max:"+maxSpeed);
    }        
    
}
