


package Tareas.Tarea4;


public class Regla3 { 
    
    /*REGLA 3: PUEDES AGREGAR MAS DE UN CONSTRUCTOR A UNA CLASE SIEMPRE Y CUANDO NO SE CONFUNDA 
    EL METODO MAIN
    */
    
public  Regla3(){ 
    
    /*CONSTRUCTOR POR DEFECTO */   
    }

public Regla3(int numero, int numero2){
    /*SEGUNDO CONSTRUCTOR */ 
}

public Regla3(float numero, int numero2){
    /*TERCERO CONSTRUCTOR */ 
}


public Regla3(int numeroS){
    /*CUARTO CONSTRUCTOR */ 
}

//public Regla3(int edad, int peso){ 
    /*QUINTO CONSTRUCTOR Y MALO */ 
        
        /*El error esta en la asignacion de los tipos de argumentos, ya que el segundo constructor tiene
        el mismo orden de argumentos tipos "int", lo cual creara confusion en el metodo main al procesar
        una invocacion a un metodo llamado Regla3.
        ESTE ERROR SERIA DE COMPILACION
        */
}

/* AL PONER TODOS ESTOS CONSTRUCTORES SE DICE QUE HAY UNA SOBRECARGA DE CONSTRUCTORES, LO CUAL NOS AYUDA
A LA CREACION DE NUEVOS OBJETOS, YA QUE LO HACE MAS FLEXIBLE.
*/



//}

