package Practica11_Prototype;

import java.awt.*;

/**
 * Created by vitaly94 on 07/10/2016.
 */
public class Circulo extends Figura {
    private int radio;
    private boolean relleno;
    private Color color;

    public Circulo(boolean relleno, Color color, int radio) {
        super(relleno, color);
        this.radio = radio;
        this.relleno =relleno;
        this.color = color;
    }

    public void visualizar(Graphics g) {
        super.visualizar(g);
        g.drawOval(10,10,radio, radio);

        g.setColor(color);

        if (relleno){
            g.fillRect(10,10,radio, radio);
        }
    }
}
