package Practica2;

/**
 * Created by vitaly94 on 23/09/2016.
 */
public class LimpiarObjeto {

    //No existe CONSTRUCTOR por tanto en cuanto inicializamos el objeto, no muestra nada.
    /*public LimpiarObjeto() {
        finalize();
    }*/

    protected void finalize(){
        try{
            System.out.println("Realizando tareas....");
        }catch (Throwable throwable){
            System.out.println(throwable.getMessage());
        }
    }
}
