package Practica10_Singleton;

/**
 * Created by vitaly94 on 14/10/2016.
 */
public class LogFile_Singleton {
   private static LogFile_Singleton ourInstance = new LogFile_Singleton();

    public static LogFile_Singleton getInstance() {
        if (ourInstance == null) createInstance();
        return ourInstance;
    }

    private synchronized static void createInstance(){
        if (ourInstance == null){
            ourInstance = new LogFile_Singleton();
        }
    }
}
