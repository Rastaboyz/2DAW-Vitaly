package Practica6_Interfaz;

/**
 * Created by vitaly94 on 04/10/2016.
 */
public class Main {
    public static void main (String[] args){
        Persona persona = new Persona();
        //pagaAlTreballador(persona);
        Docente docente = new Docente();
        pagaAlTreballador(docente);
        Primaria primaria = new Primaria();
        pagaAlTreballador(primaria);
    }

    public static void pagaAlTreballador(Trabajador trabajador) {
        String ccc = trabajador.GetCcc();
        //....
    }
}
