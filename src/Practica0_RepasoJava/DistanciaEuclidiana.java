package Practica0_RepasoJava;

import java.util.ArrayList;

/**
 * Created by vitaly94 on 10/11/2016.
 */
public class DistanciaEuclidiana {
    static int[] arrayX = new int[2];
    static int[] arrayY = new int[2];
    public static void main(String args[]) {
        double res = calcular(5,15,5,15);
        System.out.println("Resultado: " + res);
    }

    private static double calcular(int x1,int x2,int y1,int y2){
        arrayX[0] = x1;
        arrayX[1] = x2;
        arrayY[0] = y1;
        arrayY[1] = y2;

        double X = (Math.pow(arrayX[1],2) - Math.pow(arrayX[0],2));
        double Y = (Math.pow(arrayY[1],2) - Math.pow(arrayY[0],2));

        double sumaXyY = X + Y;

        return Math.sqrt(sumaXyY);
    }
}
