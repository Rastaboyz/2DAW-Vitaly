package Practica11_Prototype;

import java.util.Map;

/**
 * Created by vitaly94 on 20/10/2016.
 */
// Esta clase es usada como Prototype obteniendo las copias de una instancia.
public class CacheFigura {
    private static CacheFigura cacheInstance;
    private Map<String, Figura> cache;

    private CacheFigura(){
        //Instancia Map
        cache.put("cuadrado", getCopiaFigura("cuadrado"));
    }

    private static synchronized void createInstance(){
        if (cacheInstance == null){
            cacheInstance = new CacheFigura();
        }
    }

    public static CacheFigura getInstance(){
        if (cacheInstance == null){
            CacheFigura.createInstance();
        }
        return cacheInstance;
    }

    public Figura getCopiaFigura(String nombre){
        //Aquí se crearía el mapa obteniendo la copia de instancia.
        return null;
    }
}
