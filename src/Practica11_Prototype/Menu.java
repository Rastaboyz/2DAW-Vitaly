package Practica11_Prototype;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by vitaly94 on 07/10/2016.
 */
public class Menu {
    //Variables globales
    Scanner sc = new Scanner(System.in);
    Figura figura;
    boolean relleno;
    Color color;

    public Figura elegirFigura() {
        int opcion;
        imprimirMensaje("Elige una de las opciones:");
        opcionesMenu();
        opcion = leerEntero();
        if (opcion != 9) { //Salir directamente sin pedir el relleno o color
            if (opcion != 1 || opcion != 2 || opcion != 3) { //Evitar pedir el relleno para cadena que no contiene.
                relleno = elegirRelleno();
            }
            if (opcion != 2) {//Evitar pedir el color para el punto.
                color = elegirColor();
            }
        }

        switch (opcion){
            case 1:
                //return "Texto";
                imprimirMensaje("Introduce cadena");
                String texto = sc.next();
                return new Cadena(relleno, color, texto);
            case 2:
                //return "Punto";
                imprimirMensaje("Introduce la posicion X");
                int posX = sc.nextInt();
                imprimirMensaje("Introduce la posicion Y");
                int posY = sc.nextInt();
                return new Punto(relleno, color, posX, posY);
            case 3:
                //return "Linea";
                imprimirMensaje("Introduce la posicion X1");
                int posX1 = sc.nextInt();
                imprimirMensaje("Introduce la posicion Y1");
                int posY1 = sc.nextInt();
                return new Linea(relleno, color, posX1, posY1);
            case 4:
                //return "Circulo";
                imprimirMensaje("Introduce radio");
                int radio = sc.nextInt();
                return new Circulo(relleno, color, radio);
            case 5:
                //return "Cuadrado";
                imprimirMensaje("Introduce el tamaño del lado");
                int lado = sc.nextInt();
                return new Cuadrado(relleno, color, lado);
            case 6:
                //return "Rectangulo";
                imprimirMensaje("Introduce el alto");
                int alto = leerEntero();
                imprimirMensaje("Introduce el ancho");
                int ancho = leerEntero();
                return new Rectangulo(relleno, color, alto, ancho);
            case 7:
                //return "Poligono";
                int[] puntosX = {150, 250, 325, 375, 450, 275, 100};
                int[] puntusY = {150, 100, 125, 225, 250, 375, 300};
                return new Poligono(relleno, color, puntosX, puntusY);
            case 8:
                //Historial

            case 9:
                System.exit(0);
            default:
                imprimirMensaje("No existe esa opción");
        }
        return figura;
    }

    public Color elegirColor(){
        int opcion;
        imprimirMensaje("Elige una de las opciones:");
        opcionesColor();
        opcion = leerEntero();
        switch (opcion){
            case 1:
                return Color.red;
            case 2:
                return Color.GREEN;
            case 3:
                return Color.yellow;
            case 4:
                return Color.magenta;
            case 5:
                return Color.blue;
            case 6:
                return Color.gray;
            case 7:
                return Color.orange;
            default:
                imprimirMensaje("No existe esa opción");
                return null;
        }
    }

    public Boolean elegirRelleno() {
        imprimirMensaje("¿Quieres rellenar la figura? s/n");
        String respuesta = leerString();
        if (respuesta.equalsIgnoreCase("s")){
            return true;
        }else{
            return false;
        }
    }

    private void opcionesMenu() {
        imprimirMensaje("1- Cadena de texto");
        imprimirMensaje("2- Punto");
        imprimirMensaje("3- Linea");
        imprimirMensaje("4- Círculo");
        imprimirMensaje("5- Cuadrado");
        imprimirMensaje("6- Rectángulo");
        imprimirMensaje("7- Polígono");
        imprimirMensaje("8- Historial");
        imprimirMensaje("9- Salir");
    }

    private void opcionesColor(){
        imprimirMensaje("1- Rojo");
        imprimirMensaje("2- Verde");
        imprimirMensaje("3- Amarillo");
        imprimirMensaje("4- Violeta");
        imprimirMensaje("5- Azul");
        imprimirMensaje("6- Gris");
        imprimirMensaje("7- Naranja");
    }

    private void imprimirMensaje(String sms) {
        System.out.println(sms);
    }

    private int leerEntero() {
        return sc.nextInt();
    }

    private String leerString(){
        return sc.next();
    }
}
