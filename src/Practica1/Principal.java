package Practica1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vitaly94 on 22/09/2016.
 */
public class Principal {
    //Variables globales
    //Constructor
    public Principal() {
        pedirCita();
    }

    /**
     * Anotar cita en la agenda.
     */
    private void pedirCita() {
        String fechaCita; //Variable principal para obtener la fecha escrita por el usuario.
        //Averiguar el día de la Cita
        System.out.println("Especifica dd-mm-aaaa de la cita");
        Scanner sc = new Scanner(System.in);
        fechaCita = sc.next(); //Lectura del teclado por consola.
        String[] fechaAnalizada = analizarFecha(fechaCita);

        //Comprobar que la fecha introducida es de formato correcto.
        try {
            if (fechaAnalizada != null) {
                int dia = Integer.parseInt(fechaAnalizada[0]);
                int mes = Integer.parseInt(fechaAnalizada[1]);
                boolean esFestivo = festivo(fechaAnalizada[0]);
                Pagina pagina = new Pagina(dia, mes, esFestivo);
                List<Pagina> paginas  = new ArrayList<>(); //Inicialización temporal de la lista.
                paginas.add(pagina);
                Agenda agenda = new Agenda(Integer.parseInt(fechaAnalizada[2]), paginas);

                if (esFestivo) {
                    /*String[] fecha = fechaCita.split("-");
                    int dia = Integer.parseInt(fecha[0]);
                    int mes = Integer.parseInt(fecha[1]);*/

                    //Revisar
                }else{
                    System.out.println("La fecha elegida es un día festivo");
                }
            }else{
                System.out.println("Fecha introducida es incorrecta");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Transforma la fecha a tipo Fecha y separa el día, mes y año.
     * @param fechaCita variable rellenada por el usuario.
     * @return fecha en formato Fecha y separado en dia, mes y año.
     */
    private String[] analizarFecha(String fechaCita){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fecha = sdf.parse(fechaCita); //Conversión del valor escrito por el usuario al tipo Fecha del sistema.
            String cadenaFecha = fecha.toString(); //Conversión de tipo Fecha del sistema a tipo Cadena.
            return cadenaFecha.split(" ");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * Comprobar si el día introducido por el usuario es festivo o no.
     * @param diaDelaSemana tras la conversión se pasa el día en formato del sistema.
     * @return True si es Sábado o Domingo. False si es cualquier otro dia de la semana.
     */
    private boolean festivo(String diaDelaSemana) {
        //Comprobar si el día es festivo
        /*
            if (diaDelaSemana.equalsIgnoreCase("Sat") || diaDelaSemana.equalsIgnoreCase("Sun")) {
                return true; //Es festivo
            }
            return false; //No es festivo
         */
        //Simplificado
        return diaDelaSemana.equalsIgnoreCase("Sat") || diaDelaSemana.equalsIgnoreCase("Sun");

        //PRUEBAS
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendario = Calendar.getInstance();
        System.out.println((calendario.getTime()));
        String fechaHoy = calendario.getTime().toString();
        String[] dia = fechaHoy.split(" ");
        if (dia[0].equalsIgnoreCase("Sat") || dia[0].equalsIgnoreCase("Sun")){
            esFestivo = true;
        }*/
    }
}
