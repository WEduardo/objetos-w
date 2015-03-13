/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

/**
 *
 * @author usuario
 */
public class EdadNoNegativasException extends Exception {
    
    public EdadNoNegativasException(){
        super("No se acceptan edades negativas");
    }
    
}
