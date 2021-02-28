package modelo.Volador;
import modelo.Excepciones.*;

public class NoVuela implements Volador {
    public int vuela() throws NoVoladorException {
        throw new NoVoladorException();
    }
}

