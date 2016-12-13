package Practica11_Prototype;

import java.awt.*;

/**
 * Created by vitaly94 on 17/10/2016.
 */
public class Punto extends Figura {
    private Color color;
    private int posX, posY;

    public Punto(boolean relleno, Color color, int posX, int posY) {
        super(relleno, color);
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public void visualizar(Graphics g) {
        super.visualizar(g);
        g.drawLine(posX, posY, posX, posY);

        g.setColor(color);
    }
}
