package Practica8_Figuras;

import java.awt.*;

/**
 * Created by vitaly94 on 17/10/2016.
 */
public class Cuadrado extends Figura {
    private int lado;
    private boolean relleno;
    private Color color;

    public Cuadrado(boolean relleno, Color color, int lado) {
        super(relleno, color);
        this.lado = lado;
        this.relleno = relleno;
        this.color = color;
    }

    public void visualizar(Graphics g) {
        super.visualizar(g);
        g.drawRect(10,10,lado, lado);

        g.setColor(color);

        if (relleno){
            g.fillRect(10,10,lado, lado);
        }
    }
}
