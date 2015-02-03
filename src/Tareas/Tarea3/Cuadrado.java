/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas.Tarea3;

/**
 *
 * @author usuario
 */
public class Cuadrado {
    
 private float ancho;
 private float largo;
 private String figura;
 
 public void setAncho(float ancho){
     this.ancho=ancho; 
 }
 public void setLargo(float largo){
     this.largo=largo;    
 }
    public float getAncho(){
    return ancho;
    }
    public float getLargo(){
    return largo;
    }
    
    public void  setFigura(String figura){
        this.figura=figura;
    
    }
    public String getFigura(){
    return figura;
    }
    
    public void Figura(){
        
                if(figura.equals("cuadrado")){
                   Calular_Area();}
                else{
                    if(figura.equals("rectangulo")){
                   Calular_Area();}
                else{
                  System.out.println("No existe esa informacion");}
    
               }
    }
public void Calular_Area(){
float areacuadrado=largo*ancho;
System.out.println("El area del cuadrado es : " + areacuadrado);
System.out.println("La figura es : " + figura);
 
} 
}
