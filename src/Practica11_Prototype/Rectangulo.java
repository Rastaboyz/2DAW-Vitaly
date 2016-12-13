package Practica11_Prototype;

import java.awt.*;

/**
 * Created by vitaly94 on 07/10/2016.
 */
public class Rectangulo extends Figura {
    private int alto, ancho;
    private boolean relleno;
    private Color color;

    public Rectangulo(boolean relleno, Color color, int alto, int ancho) {
        super(relleno, color);
        this.alto = alto;
        this.ancho = ancho;
        this.relleno = relleno;
        this.color = color;
    }

    public void visualizar(Graphics g) {
        super.visualizar(g);
        g.drawRect(10,10,ancho,alto);

        g.setColor(color);

        if (relleno){
            g.fillRect(10,10,ancho,alto);
        }
    }
}
