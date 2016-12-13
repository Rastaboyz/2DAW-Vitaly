package Practica11_Prototype;

import java.awt.*;

/**
 * Created by vitaly94 on 17/10/2016.
 */
public class Linea extends Figura {
    private Color color;
    private int posX1, posY1;

    public Linea(boolean relleno, Color color, int posX1, int posY1) {
        super(relleno, color);
        this.posX1 = posX1;
        this.posY1 = posY1;
    }

    public void visualizar(Graphics g) {
        super.visualizar(g);
        g.drawLine(posX1, posX1, posY1, posY1);

        g.setColor(color);
    }
}
