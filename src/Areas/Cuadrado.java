
package Areas;
public class Cuadrado {
    private float lado;
/**
 * Este constructor tiene un argumento de tipo flotante
 * @param lado.El parametro que debes ingresar es el valor
 * del lado de tu cuadrado
 */
    
    public Cuadrado(){
    
    }
    
    public Cuadrado(float lado){
        this.lado=lado;
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    float calcularArea(){
        float area=lado*lado;
        return area;
    }
}
