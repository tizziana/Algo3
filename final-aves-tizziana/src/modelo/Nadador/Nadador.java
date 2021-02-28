package modelo.Nadador;
import modelo.Excepciones.*;

public interface Nadador {
    public abstract int nada() throws NoNadadorException;
}
