package modelo.Cantador;
import modelo.Excepciones.*;

public class NoCanta implements Cantador {
    public String cantarCancion(String cancion) throws NoCantorException {
        throw new NoCantorException();
    }
}
