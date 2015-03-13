/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaThreads;


public class VerificarThreads {

     public static void main(String[] args) {
   
     Thread josue=new Thread(new Runnable(){
 
            public void run() {
                 try{
            Thread.sleep(3000);
                
                String nombre=Thread.currentThread().getName();
                System.out.println("Soy el Thread " + nombre);   
            }catch(InterruptedException e){}
     }
     }
     );
     
     
    Thread robin=new Thread(new Runnable(){
        
        public void run() {
            try{
                Thread.sleep(5000);
             String nombre=Thread.currentThread().getName();
             System.out.println("Soy el Thread " + nombre);  
        }catch(InterruptedException e){}
    }
    }
    );
    
    Thread charli=new Thread(new Runnable(){
        
        public void run() {
             try{
                Thread.sleep(9000);
             String nombre=Thread.currentThread().getName();
                System.out.println("Soy el Thread " + nombre); 
                 }catch(InterruptedException e){}
    
    }
    }
    ); 
    josue.setName("Josue");
    robin.setName("Robinson");
    charli.setName("Charli");
    josue.start();
    robin.start();
    charli.start();

     }
 
    }