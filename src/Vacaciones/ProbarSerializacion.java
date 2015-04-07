/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacaciones;

/**
 *
 * @author T-107
 */
public class ProbarSerializacion {

    
    public static void main(String[] args) {
       
        //CREAMOS UN USUARIO
        
        Usuario u = new Usuario();
        u.setEmail("rex.asesino@hotmail.com");
        u.setNombre("Carrana Jimenez Eduardo Alejandro");
        u.setSueldo(100);
        
        //LO GUARDAMOS
        
        PersistenciaUsuario per=new PersistenciaUsuario();
        
        try{
        per.guardar(u);
        
        System.out.println("Usuario guardado con exito");
        
        }catch (Exception ex){
            
            System.out.println(ex.getMessage());
        }        
        
    }
 
}
