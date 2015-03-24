/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrusel.proyecto;
import java.util.*;
import java.util.ArrayList;


public class ModeloGaleriaGenerar {
    
    public static ArrayList<Galeria>generarGaleria(){
     
        ArrayList<Galeria>arreglo=new ArrayList<Galeria>();
        
        Galeria g1=new Galeria("Titulo:Castillo Frontenac","Descripcion:Hotel","/Carrusel/proyecto/frontenac.jpg");
        Galeria g2=new Galeria("Titulo:Torre de la inovacion","Descripcion:Proyectos innovadores","/Carrusel/proyecto/inovacion.jpg");
        Galeria g3=new Galeria("Titulo:San Diego Temple","Descripcion:Templo","/Carrusel/proyecto/templo.jpg");

        arreglo.add(g1);
        arreglo.add(g2);
        arreglo.add(g3);

        return arreglo;
    }
    
    
}















































































