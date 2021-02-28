package modelo.Corredor;
import modelo.Excepciones.*;
import modelo.SerVivo.SerVivo;

public class NoCorre {
    public int corre(String superficie, SerVivo serVivo) throws NoNadadorException {
        throw  new NoCorredorException();
    }
}
