/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;

/**
 *
 * @author usuario
 */
public class ExRangos {
    
    private float rango;

    
    
    public ExRangos() {
        
    }

    public ExRangos(float rango) throws RangoNoValido{
         ValidarRangoNoValido.joder(rango);
        this.rango = rango;
    }
    
    
    

    public float getRango() {
        return rango;
    }

    public void setRango(float rango) throws RangoNoValido{
        ValidarRangoNoValido.joder(rango);
        this.rango = rango;
    }
    
    
    
}
