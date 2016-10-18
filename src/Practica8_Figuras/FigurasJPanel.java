package Practica8_Figuras;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vitaly94 on 07/10/2016.
 */
public class FigurasJPanel extends JPanel{
    private Figura figura;

    public void paint(Graphics g){
        super.paint(g);
        figura.visualizar(g);
    }

    public Figura getFigura(){
        return figura;
    }

    public void setFigura(Figura figura){
        this.figura = figura;
    }
}
