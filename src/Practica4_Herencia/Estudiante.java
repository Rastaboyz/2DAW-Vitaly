package Practica4_Herencia;

/**
 * Created by vitaly94 on 29/09/2016.
 */
public class Estudiante extends Alumnados{
    private String nif;

    public Estudiante(String nombre, String direccion, String fechaAlta, int edad, String nif) {
        super(nombre, direccion, fechaAlta, edad);
        this.nif = nif;
    }
}
