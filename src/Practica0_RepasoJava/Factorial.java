package Practica0_RepasoJava;

/**
 * Created by vitaly94 on 27/10/2016.
 */
public class Factorial {
    static private int resultadoRecursivo = 1;
    public static void main(String args[]){
        int valor = 4;
        calcularFactorial(valor);
        calcularFactorialRecursivo(valor);
    }

    private static void calcularFactorial(int valor){
        int resultado = 1;
        for (int i = 1; i <= valor; i++){
            resultado =  resultado * i;
        }
        System.out.println("Factorial de " + valor + " es: " + resultado);
    }

    private static void calcularFactorialRecursivo(int valor){
        resultadoRecursivo = resultadoRecursivo * valor;
        //resultadoRecursivo = resultadoRecursivo * calcularFactorialRecursivo(valor - 1);

        if (valor != 1){
            calcularFactorialRecursivo(valor - 1);
        }else{
            System.out.println("Factorial: " + resultadoRecursivo);
        }
    }
}
