package Practica4_Herencia;

/**
 * Created by vitaly94 on 29/09/2016.
 */
public class PersonalGestion extends Trabajadores {
    private String posicion;

    public PersonalGestion(String nombre, String direccion, int numSS, String posicion) {
        super(nombre, direccion, numSS);
        this.posicion = posicion;
    }
}
