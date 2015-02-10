
package Areas;
public class Cuadrado {
    private float lado;

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
