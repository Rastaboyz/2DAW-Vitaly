package Practica2;

/**
 * Created by vitaly94 on 23/09/2016.
 */
public class Main {
    /**
     * Finalize - Garbage Collector
     * @param args
     */
    public static void main(String args[]){
        //Procesa datos en una posicion de memoría.
        LimpiarObjeto lo = new LimpiarObjeto();

        //Espera de 10 segundos.
        System.out.println("Objeto inicicializado. 10 segundos de tarea 'fantasma' del objeto inicializado.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Dejamos de apuntar a la posicion de memoria reservada.
        System.out.println("Limpiando objeto...");
        lo = null;

        //Limpiamos la memoria.
        System.out.println("Ejecutando Garbage Collector limpiando la memoria...");
        System.gc();

        //Esperamos 10 segundos.  NOTA: Aquí es cuando aparecen las "tareas" del objeto "LimpiarObjeto" sin haberlo llamado
        // mientras realiza la tarea de "esperar".
        System.out.println("Esperamos 10 segundos para que Garbage Collector haga su limpieza");
        try {
            Thread.sleep(10000);
            System.out.println("Tarea finalizada. Memoria limpia.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
