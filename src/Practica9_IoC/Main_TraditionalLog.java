package Practica9_IoC;

import java.util.List;

/**
 * Created by vitaly94 on 14/10/2016.
 */
public class Main_TraditionalLog {
    public static void main(String[] args) {
        // Delegamos las responsabilidades del "log" en una entidad externa llamada "Log".

        // Con esto se define que se mostrarán los logs por consola, en caso de que querramos
        // que muestre por archivo, simplemente haría falta modificar por la clase "LogFile" y
        // si se quiere usar para alguna otra forma, se ha de crear la clase extendiendo de la
        // clase "LogAbstract". Una vez preparado, se inicializa la clase (new LogXXX).
        Log log = new LogConsole();
        log.setLogError(true);
        log.setLogInfo(true);
        log.setLogWarn(true);

        List<String> list = null;

        if (list == null) log.logWarn("LLista nula");

        try {
            log.logInfo("Anem a afegir un element.");
            list.add("Element");
        } catch (NullPointerException npe){
            log.logError(" excepcio:" + npe.getMessage());
        }

    }
}
