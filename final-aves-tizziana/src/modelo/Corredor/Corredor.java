package modelo.Corredor;
import modelo.SerVivo.*;
import modelo.Excepciones.*;

public interface  Corredor {

    public abstract int corre(String superficie, AbelPintos abelPintos) throws NoCorredorException;

    public abstract int corre(String superficie, Gorrion gorrion) throws NoCorredorException;

    public abstract int corre(String superficie, Avestruz avestruz) throws NoCorredorException;

    public abstract int corre(String superficie, Pinguino pinguino) throws NoCorredorException;

}
