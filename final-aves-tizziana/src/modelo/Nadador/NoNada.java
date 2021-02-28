package modelo.Nadador;
import modelo.Excepciones.*;

public class NoNada implements Nadador {
    public int nada() throws NoNadadorException {
        throw new NoNadadorException();
    }
}
