

package Vacaciones;

import java.io.*;

public class PersistenciaUsuario {
   
    public void guardar(Usuario u)throws Exception{
        
        //PASO 1
        
        File file=new File("D:\\archivo.yo"); //El constructos que contiene?indica la ruta del archivo y el nombre
        
        //PASO 2
        
        FileOutputStream fos= new FileOutputStream(file);
        
        //PASO 3 LLENARLO CON ALGO EN ESTE CASO ES UN USUARIO
        
        ObjectOutputStream oos = new ObjectOutputStream(fos);
    
    oos.writeObject(u); //METODO PARA GUARDAR UN METODO SERIALIZADO ES WRITEOBJECT, ESTE GUARDA EL OBJETO
    oos.close();
 
    }
    
    
    public Usuario leer()throws Exception{
        
         //PASO 1
        
        File file=new File("D:\\archivo.yo");
        
        
        FileInputStream fis = new FileInputStream(file);
        
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Usuario u=new Usuario(); //CONSTRUCTOR POR DEFECTO
        
        u=(Usuario)ois.readObject();
        
        return u;
        
        
    }
}
