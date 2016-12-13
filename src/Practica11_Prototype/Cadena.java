package Practica11_Prototype;

import java.awt.*;

/**
 * Created by vitaly94 on 17/10/2016.
 */
public class Cadena extends Figura {
    private Color color;
    private String texto;

    public Cadena(boolean relleno, Color color, String texto) {
        super(relleno, color);
        this.color = color;
        this.texto = texto;
    }

    public void visualizar(Graphics g) {
        super.visualizar(g);
        g.drawString(texto, 30, 30);
        g.setFont(new Font("TimesRoman", Font.BOLD, 100));

        g.setColor(color);
    }
}
