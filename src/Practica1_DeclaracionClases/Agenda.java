package Practica1_DeclaracionClases;

import java.util.List;

/**
 * Created by vitaly94 on 22/09/2016.
 */
public class Agenda {
    protected int any;
    public List<Pagina> paginas;

    public Agenda(int any, List<Pagina> paginas) {
        this.any = any;
        this.paginas = paginas;
    }

    public int getAny() {
        return any;
    }


    public void setAny(int any) {
        this.any = any;
    }

    public List<Pagina> getPaginas() {
        return paginas;
    }

    public void setPaginas(List<Pagina> paginas) {
        this.paginas = paginas;
    }
}
