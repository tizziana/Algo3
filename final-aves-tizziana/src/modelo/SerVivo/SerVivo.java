package modelo.SerVivo;
import modelo.Excepciones.*;

public interface SerVivo {

    public abstract String cantar (String cancion) throws NoCantorException;

    public abstract int correr (String superficie) throws NoCantorException;

    public abstract int volar () throws NoVoladorException;

    public abstract int nadar () throws NoNadadorException;



}
