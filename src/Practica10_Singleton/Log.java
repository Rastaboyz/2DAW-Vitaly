package Practica10_Singleton;

/**
 * Created by vitaly94 on 14/10/2016.
 */
public interface Log {
    void logInfo(String textToLog);
    void logWarn(String textToLog);
    void logError(String textToLog);

    void setLogError(boolean logError);
    void setLogWarn(boolean logWarn);
    void setLogInfo(boolean logInfo);
}
