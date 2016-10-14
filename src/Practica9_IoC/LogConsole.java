package Practica9_IoC;

/**
 * Created by vitaly94 on 14/10/2016.
 */
public class LogConsole extends LogAbstract {
    public void logInfo(String textToLog) {
        if (isLogInfo()){
            System.out.println(INFO_PREFIX + textToLog);
        }

    }

    public void logWarn(String textToLog) {
        if (isLogWarn()){
            System.out.println(WARN_PREFIX + textToLog);
        }

    }

    public void logError(String textToLog) {
        if (isLogInfo()){
            System.out.println(ERROR_PREFIX + textToLog);
        }

    }
}
