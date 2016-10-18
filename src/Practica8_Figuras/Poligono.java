package Practica8_Figuras;

import java.awt.*;

/**
 * Created by vitaly94 on 17/10/2016.
 */
public class Poligono extends Figura {
    private Color color;
    private boolean relleno;
    private int[] puntosX, puntosY;

    public Poligono(boolean relleno, Color color, int[] puntosX, int[] puntosY) {
        super(relleno, color);
        this.color = color;
        this.relleno = relleno;
        this.puntosX = puntosX;
        this.puntosY = puntosY;
    }

    public void visualizar(Graphics g) {
        super.visualizar(g);
        g.drawPolygon(puntosX, puntosY, puntosX.length);

        g.setColor(color);

        if (relleno){
            g.fillPolygon(puntosX, puntosY, puntosX.length);
        }
    }
}
