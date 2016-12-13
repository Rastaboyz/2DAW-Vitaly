package Practica0_RepasoJava.SegundoGrado;

/**
 * Created by vitaly94 on 27/10/2016.
 */
public class ReturnValue {
    private double resultadoPositivo;
    private double resultadoNegativo;

    public void setResultadoPositivo(double resultadoPositivo) {
        this.resultadoPositivo = resultadoPositivo;
    }

    public void setResultadoNegativo(double resultadoNegativo) {
        this.resultadoNegativo = resultadoNegativo;
    }

    @Override
    public String toString() {
        return "ReturnValue{" +
                "resultadoPositivo=" + resultadoPositivo +
                ", resultadoNegativo=" + resultadoNegativo +
                '}';
    }
}
