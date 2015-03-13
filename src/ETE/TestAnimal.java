/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ETE;

/**
 *
 * @author T-107
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        for(Anima b:GenerarAnimales.generarAnima()){
            System.out.println(b.getNombre() + " " + b.getEdad());
        }
        
    }
    
}
