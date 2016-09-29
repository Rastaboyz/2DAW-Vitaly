package Practica4_Herencia;

/**
 * Created by vitaly94 on 29/09/2016.
 */
public class Alumnados extends Personas{
    private String fechaAlta;
    private int edad;

    public Alumnados(String nombre, String direccion, String fechaAlta, int edad) {
        super(nombre, direccion);
        this.fechaAlta = fechaAlta;
        this.edad = edad;
    }
}
