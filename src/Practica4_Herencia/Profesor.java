package Practica4_Herencia;

/**
 * Created by vitaly94 on 29/09/2016.
 */
public class Profesor extends Trabajadores {
    private String titulacion, especialidad;

    public Profesor(String nombre, String direccion, int numSS, String titulacion, String especialidad) {
        super(nombre, direccion, numSS);
        this.titulacion = titulacion;
        this.especialidad = especialidad;
    }
}
