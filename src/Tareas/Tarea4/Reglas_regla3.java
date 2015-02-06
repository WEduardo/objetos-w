/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas.Tarea4;


public class Reglas_regla3 {

 
    public static void main(String[] args) {
   
Regla3 constructor1 = new Regla3();

Regla3 constructor2 = new Regla3(1,2);

Regla3 constructor3 = new Regla3(1.2f,2);

Regla3 constructor4 = new Regla3(5);

Regla3 constructor5 = new Regla3(21, 70);  /*AQUI SE VE EL ERROR, PERO EN LA CLASE
                                            LO REMARCA EL PROGRAMA COMO EL CONSTRUCTOR (INT,INT)
                                            YA FUE DECLARADO, EL ERRO ES REPETIR EL TIPO DE ARGUMENTO
                                            EN EL MISMO ORDEN*/
        
    }
    
}




