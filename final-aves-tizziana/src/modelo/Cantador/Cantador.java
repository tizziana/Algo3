package modelo.Cantador;
import modelo.Excepciones.*;

public interface Cantador {
    public abstract String cantarCancion(String cancion) throws NoCantorException;
}
