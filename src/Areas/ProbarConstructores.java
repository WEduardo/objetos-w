
package Areas;




public class ProbarConstructores {
    
    public static void main(String arg[]){
    
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
       // b=s;
        s=b;
    i=s;
    b=(byte)l;
    l=i;
    s=(short)i;
    b=(byte)s;
    s=(short)l;
    l=s;
    b=(byte)i;
    b=(byte)s;
    i=b;
    
   /* 
    float f=45;
    float f2=45.2;
    float f3=45.2f;
    float f4=(float)45.2;
    */
    int i2=300;
    
    double dedos=45.2;
    /*
    Cuadrado c=new Cuadrado(i2);
            */
    
    Cuadrado c=new Cuadrado((float)dedos);
  
    }
            
            
         
}
