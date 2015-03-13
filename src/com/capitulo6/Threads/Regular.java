/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo6.Threads;

/**
 *
 * @author T-301
 */
public class Regular implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
        
        System.out.println("Soy un thread mas dificil");
        }catch(InterruptedException e){}
    }
    

    
    
}
