package Practica10_Singleton;

import java.util.List;

/**
 * Created by vitaly94 on 14/10/2016.
 */
public class Main_TraditionalLog {
    public static void main(String[] args) {

        //Instancias de Singleton
        LogFile.getInstance().setLogError(true);
        LogFile.getInstance().setLogInfo(true);
        LogFile.getInstance().setLogWarn(true);

        List<String> list = null;

        if (list == null) LogFile.getInstance().logWarn("LLista nula");

        try {
            LogFile.getInstance().logInfo("Anem a afegir un element.");
            list.add("Element");
        } catch (NullPointerException npe){
            LogFile.getInstance().logError(" excepcio:" + npe.getMessage());
        }
    }
}
