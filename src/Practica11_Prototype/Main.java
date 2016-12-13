package Practica11_Prototype;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vitaly94 on 07/10/2016.
 */
public class Main {
    //Variables gloables
    static ArrayList<Figura> listaFiguras;
    public static void main(String[] args) {
        final FigurasJPanel lienzoFigura = new FigurasJPanel();

        //Elección de figura.
        String nombreFigura;

        //Arranque de Frame en un hilo nuevo.
        Runnable guiThread = (new Runnable() {
            @Override
            public void run() {
                JFrame frame;
                frame = new JFrame("Formulario");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setBounds(100,100,800,600);
                frame.getContentPane().add(lienzoFigura);

                frame.setVisible(true);
            }
        });

        try {
            SwingUtilities.invokeAndWait(guiThread);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //Lógica menus
        Menu menu = new Menu();
        boolean salir = false;
        String respuestaSalir;
        Scanner sc = new Scanner(System.in);


        if (listaFiguras != null){
            listaFiguras = new ArrayList<>();
        }


        while (!salir){
            Figura figura = menu.elegirFigura();
            listaFiguras.add(figura);
            lienzoFigura.setFigura(figura);
            lienzoFigura.repaint();
            System.out.println("¿Deseas salir? s/n");
            respuestaSalir = sc.next();
            if (respuestaSalir.equalsIgnoreCase("s")){
                System.exit(0);
                salir = true;
            }
        }
    }
}
