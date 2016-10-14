package Practica9_IoC;

import java.util.List;

/**
 * Created by vitaly94 on 14/10/2016.
 */
public class Main_TraditionalLog {
    public static void main(String[] args) {

        //Delegam les responsabilitats del log
        // en una entitat externa --> Log
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
