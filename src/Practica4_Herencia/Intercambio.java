package Practica4_Herencia;

/**
 * Created by vitaly94 on 29/09/2016.
 */
public class Intercambio extends Alumnados{
    private String nie, paisOrigen;

    public Intercambio(String nombre, String direccion, String fechaAlta, int edad, String nie, String paisOrigen) {
        super(nombre, direccion, fechaAlta, edad);
        this.nie = nie;
        this.paisOrigen = paisOrigen;
    }
}
