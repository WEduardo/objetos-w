
package Enumeraciones;


public class Enumeraciones {

    
    public static void main(String[] args) {

        //System.out.println("El estado de la maquina es: ");
       MaquinaBuena maquina=new MaquinaBuena();
       maquina.setEstado(EstadoDeMaquina.ATASCADA);
       System.out.println("El stado de la maquina es: " + maquina.getEstado());
    
    
    
    
    }
    
}
