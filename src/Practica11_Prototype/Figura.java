package Practica11_Prototype;

import java.awt.*;

/**
 * Created by vitaly94 on 07/10/2016.
 */
public class Figura implements Cloneable{
    private boolean relleno;
    private Color color;

    public Figura(boolean relleno, Color color) {
        this.relleno = relleno;
        this.color = color;
    }

    public void visualizar(Graphics g){

    }

    //Método importado de la interfaz de Cloneable()
    @Override
    protected Figura clone() throws CloneNotSupportedException {
        return (Figura)super.clone();
    }
}
