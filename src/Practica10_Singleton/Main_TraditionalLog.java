package Practica10_Singleton;

import java.util.List;

/**
 * Created by vitaly94 on 14/10/2016.
 */
public class Main_TraditionalLog {
    public static void main(String[] args) {

        //Instancias de Singleton
        LogFile.ThreadSave().setLogError(true);
        LogFile.ThreadSave().setLogInfo(true);
        LogFile.ThreadSave().setLogWarn(true);

        List<String> list = null;

        if (list == null) LogFile.ThreadSave().logWarn("LLista nula");

        try {
            LogFile.ThreadSave().logInfo("Anem a afegir un element.");
            list.add("Element");
        } catch (NullPointerException npe){
            LogFile.ThreadSave().logError(" excepcio:" + npe.getMessage());
        }
    }
}
