/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos.w;

import java.util.Scanner;

public class ObjetosW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
Scanner tarea = new Scanner(System.in);

float peso;
float estatura;
float imc;


        System.out.println("Deme su estatura en metros:");
        estatura = tarea.nextFloat();
        System.out.print("Deme su peso en kg:");
        peso = tarea.nextFloat();
        imc = peso/(estatura * estatura);
        System.out.println("su indice de masa corporal es " + imc);
        
imc = peso /(estatura * estatura);
    }
    
}
