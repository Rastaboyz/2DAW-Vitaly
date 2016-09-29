package Practica4_Herencia;

/**
 * Created by vitaly94 on 29/09/2016.
 */
public class Trabajadores extends Personas {
    private int numSS;

    public Trabajadores(String nombre, String direccion, int numSS) {
        super(nombre, direccion);
        this.numSS = numSS;
    }
}
