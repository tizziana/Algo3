package modelo.Volador;
import modelo.Excepciones.*;

public interface Volador {
    public abstract int vuela() throws NoVoladorException;
}
