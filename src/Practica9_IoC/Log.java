package Practica9_IoC;

/**
 * Created by vitaly94 on 14/10/2016.
 */
public interface Log {
    /* Interfaz Log que establece los métodos que se van a usar. */
    void logInfo(String textToLog);
    void logWarn(String textToLog);
    void logError(String textToLog);

    void setLogError(boolean logError);
    void setLogWarn(boolean logWarn);
    void setLogInfo(boolean logInfo);
}
