package Practica0_RepasoJava.SegundoGrado;

/**
 * Created by vitaly94 on 27/10/2016.
 */
public class SegundoGrado {
    public static void main(String args[]) {
        int a = 2;
        int b = 6;
        int c = 4;
        calcular(a,b,c);

    }

    private static void calcular(int a, int b, int c){
        ReturnValue devolverValor = new ReturnValue();

        double resultadoPositivo = (-b+(Math.sqrt((Math.pow(b,2))-4*a*c)))/(2*a);
        double resultadoNegativo = (-b-(Math.sqrt((Math.pow(b,2))-4*a*c)))/(2*a);

        /*double p1 = Math.pow(b,2);
        double p2 = (p1 - 4*a*c);
        double p3 = Math.sqrt(p2);
        double p4 = (-b) + (p3);
        double p5 = (p4/2);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p4: " + p4);
        System.out.println("p5: " + p5);*/

        devolverValor.setResultadoPositivo(resultadoPositivo);
        devolverValor.setResultadoNegativo(resultadoNegativo);

        System.out.println(devolverValor.toString());
    }
}
