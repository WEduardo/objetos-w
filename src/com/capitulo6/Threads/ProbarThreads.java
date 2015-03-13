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
public class ProbarThreads {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
           
        System.out.println("Probar thread");
        //PASO 1 CREARLO
        
        Facil t1= new Facil();
        Facil t11=new Facil();
        Regular r1=new Regular();    //r1 no es objeto es por runneable hasta aqui es una interfaz
        Thread t2=new Thread(r1);
        
        Thread t3=new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Soy un thred mucho mejor");   
            }    
        }
        );
        Relojito treloj3=new Relojito();
        
       t1.setName("Lalo");
        
        t1.start();
        t11.start();
        t2.start();
        t3.start();
        treloj3.start();
        
        
        
        
        
    }
    
}
