package Practica1_DeclaracionClases;

/**
 * Created by vitaly94 on 22/09/2016.
 */
public class Pagina {
    private int dia;
    private int mes;
    private boolean festivo;

    public Pagina(int dia, int mes, boolean festivo) {
        this.dia = dia;
        this.mes = mes;
        this.festivo = festivo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean isFestivo() {
        return festivo;
    }

    public void setFestivo(boolean festivo) {
        this.festivo = festivo;
    }
}
