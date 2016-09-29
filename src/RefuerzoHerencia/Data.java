package RefuerzoHerencia;

/**
 * Created by vitaly94 on 28/09/2016.
 */

/*
* 1. Reflexiona sobre les linies marcades amb #1 i #2.
* 2. Implementa una nova classe anomenada AnyDeTrespas que determini si una determinada data pertany a un any de trespàs
*    (per simplificar l'algoritmia considerarem que els anys de trespàs son tots els anys parells). Reflexiona sobre:
*       2.1 A què pots accedir de la superclasse?
*           - A todos los metodos publicos.
*       2.2 A què no pots accedir?
*           - A atributos privados ni metodos privados.
* 3. Ara canvia la implementació de la classe Data. Fes-la amb la representació de la data amb tres atributs enters (dia, mes, any).
*       3.1 Segueix funcionant la classe AnyDeTrespas?
*           - Sí, ya que la funcionalidad final es la misma.
*       3.2 Què hauria passat si per algun motiu haguesis pogut emprar el mètode privat descomposaData.
* */
public class Data {
    //#1
    private static final String SEPARADOR = "-"; //Variable de clase.
    //private String data;
    private int dia, mes, any; //3.

    //@Deprecated --> Deniega el uso del metodo.
    public String getData() {
        //return data;
        return dia + "-" +  mes + "-" + any;
    }

    public void setData(String data) throws Exception {
        //#2
        if (!data.contains(SEPARADOR)) throw new Exception();
        //this.data = data;
        //3.
        this.dia = descomposaData()[0];
        this.mes = descomposaData()[1];
        this.any = descomposaData()[2];
        //3. Solucion alternativa
        /*int[] dates = descomposaData(data);
        this.dia = dates[0];
        this.mes = dates[1];
        this.any = dates[2];*/
    }

    public int getAny(){
        //return data != null ? descomposaData()[2] : 0;
        return any;
    }

    private int[] descomposaData(){ //private int[] descomposaData(String data){

        //String[] dataDescomposada = data.split(SEPARADOR);
        String[] dataDescomposada = getData().split(SEPARADOR); //3.
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);

        return dataDescomposadaInt;

    }

    //3.2
    public int[] descomposaData2(){
        //String[] dataDescomposada = data.split(SEPARADOR);
        String[] dataDescomposada = getData().split(SEPARADOR); //3.
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);

        return dataDescomposadaInt;

    }
}
