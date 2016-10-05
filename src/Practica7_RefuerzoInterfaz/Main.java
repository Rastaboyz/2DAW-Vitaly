package Practica7_RefuerzoInterfaz;

/**
 * Created by vitaly94 on 05/10/2016.
 */
public class Main {
    public static void main (String[] args){
        Student student = new Student();

        /*Siendo "database" la interfaz principal/general y el resto de las clases
         * implementan de ella, es posible usar cualquier clase implementada desde la interfaz. */
        Database db1 = new MetodoMiguel();
        Database db2 = new MetodoPep();

        db1.addStrudent(student);
        db2.addStrudent(student);
    }
}
