package RefuerzoHerencia;

/**
 * Created by vitaly94 on 28/09/2016.
 */
public class AnyDeTraspas extends Data{
    public boolean AnyDeTraspas() {
        descomposaData2();
        return getAny()%2==0;
    }
}
