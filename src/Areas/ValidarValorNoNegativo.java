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
public class ValidarValorNoNegativo {
    
    
    public static void validar (float valor)throws NumeroNoNegativoException {
        if(valor<0)throw new NumeroNoNegativoException(); //SE LANZA EL OBJETO NUEVO DE TIPO DE MI EXCEPCION UDSNDO THROW
  //SE VALIDA LA EXCEPCION SI EL VALOR ES NEGATIVO LANZA UN OBJETO DEL TIPO DE MI EXCEPCION
    }
    
}
