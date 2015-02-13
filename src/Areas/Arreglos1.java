
package Areas;


public class Arreglos1 {
    
    
    public void tuNombre(int x[]){
    
    
    //en esta parte el arreglo se adecua al dato o nombre que se agregara
      //  int x[] 
    
    }
    
    
    
    public static void main (String arg[]){
    
        int x[]=new int[3];
        int []y=new int[3];
        int z[]={10,20,50};  /*   TIENE EL TAMAÑO DE SUS VALORES EN LOS PARENTESIS OSEA 3 se usa cuando se tengan los valores definidos  */
        
        //MALAS DECLARACIONES
        
        //int w=new int[];
        //int j[3]=new int[];
        //int m[4]=new int[4];
        //int []n={1,4.5,5,4};   //El 4.5 es dobule y no int
       
       
        
        
        x[0]=200;
        x[1]=-23;
        x[2]=12;
        //x[3]=!2;
    
    //ITERAR
        //length es una propiedad para el arreglo por si cambia de tamaño
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    
      for(int algo:x){
            System.out.println(algo);
    
    //S´PER FOR AVENGER FOR MEJORADO
    }
    }
}
