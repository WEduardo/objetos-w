/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;

/**
 *
 * @author T-301
 */
import java.util.*;
public  class GenerarSuperficies  {
//obtenerfiguras es un metodo
    public static ArrayList<Superficies>obtenerFiguras()throws Exception{
        ArrayList<Superficies>figuritas=new ArrayList<Superficies>();
        //Primer crear cuadrados
        Cuadrado cu1=new Cuadrado(12);
        Cuadrado cu2=new Cuadrado(14);
        Cuadrado cu3=new Cuadrado(13);
        
        //Crear 1 rectangulos
        
        Rectangulo rec1=new Rectangulo(11,15);
        
        
        
        //Crear 2 Triangulos
        
        Triangulo tri1=new Triangulo(12,14);
        Triangulo tri2=new Triangulo(12,14);
        
        //Crear 2 circulos
        
        Circulo cir1=new Circulo(12);
        Circulo cir2=new Circulo(16);
        
        //Agregarlos al ArrayList
        
        figuritas.add(cu1);   
        figuritas.add(cu2);  
        figuritas.add(cu3);  
      
        figuritas.add(rec1);
        
        figuritas.add(tri1);
        figuritas.add(tri2);
         
        figuritas.add(cir1);
        figuritas.add(cir2);
         
        return figuritas;
         
        
    }
    
    
    
    
}
