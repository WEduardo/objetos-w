/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;

/**
 *
 * @author T-107
 */
public class Circulo implements Superficies{
    private float radio;

    
    public float CalcularArea(){ 
        System.out.print("El area del circulo es: ");
        return  3.1416f*radio*radio;
    }
    
    
    
    public Circulo() {
    }
    

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
   
}
