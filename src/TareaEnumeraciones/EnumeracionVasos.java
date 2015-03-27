/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaEnumeraciones;

/**
 *
 * @author usuario
 */
public class EnumeracionVasos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Vasos vaso=new Vasos();
        Vasos vaso2=new Vasos();
        Vasos vaso3=new Vasos();
        
        
        vaso.setTamaño(TamañoDeVasos.CHICO);
       System.out.println("El tamaño del vaso comprado es : " + vaso.getTamaño());
       
     
       
       vaso2.setTamaño(TamañoDeVasos.MEDIANO);
       System.out.println("El tamaño del vaso2 comprado es : " + vaso2.getTamaño());
       
       
       
       vaso3.setTamaño(TamañoDeVasos.GRANDE);
       System.out.println("El tamaño del vaso3 comprado es : " + vaso3.getTamaño());
        
    }
    
    
    
}
