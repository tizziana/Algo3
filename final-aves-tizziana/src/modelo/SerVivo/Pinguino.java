package modelo.SerVivo;
import modelo.Cantador.*;
import modelo.Corredor.*;
import modelo.Nadador.*;
import modelo.Volador.*;
import modelo.Excepciones.*;

public class Pinguino implements SerVivo {
    NoCanta noCantador;
    NoVuela noVolador;
    Corre corredor;
    Nada nadador;

    public Pinguino(){
        noCantador = new NoCanta();
        noVolador = new NoVuela();
        corredor = new Corre();
        nadador = new Nada();
    }

    @Override
    public String cantar(String cancion) throws NoCantorException {
        return noCantador.cantarCancion(cancion);
    }

    @Override
    public int correr(String superficie) throws NoCorredorException{
        return corredor.corre(superficie, this);
    }

    @Override
    public int volar() throws NoVoladorException {
        return noVolador.vuela();
    }

    @Override
    public int nadar() throws  NoNadadorException{
        return nadador.nada();
    }

}
