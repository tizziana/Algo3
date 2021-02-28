package modelo.SerVivo;
import modelo.Cantador.*;
import modelo.Corredor.*;
import modelo.Nadador.*;
import modelo.Volador.*;
import modelo.Excepciones.*;


public class Avestruz implements SerVivo {

    NoCanta noCantador;
    NoVuela noVolador;
    Corre corredor;
    NoNada noNadador;
    
    public Avestruz() {
        corredor = new Corre();
        noCantador = new NoCanta();
        noVolador = new  NoVuela();
        noNadador = new  NoNada();
    }

    @Override
    public String cantar(String cancion) {
        return noCantador.cantarCancion(cancion);
    }

    @Override
    public int correr(String superficie) throws NoCorredorException{
        return corredor.corre(superficie, this);
    }

    @Override
    public int volar() throws NoVoladorException{
        return noVolador.vuela();
    }

    @Override
    public int nadar() throws  NoNadadorException{
        return noNadador.nada();
    }
    
/*
	
	@Override
	public int correr(Superficie superficie) {
		
		if (superficie == Superficie.PISTA_ATLETISMO) {
			// corriendo soy un/a champion 70 km/h
			return 70;
		}
		
		if (superficie == Superficie.BARRO) {
			// Nada me detiene !!
			return 70;
		}
		
		if (superficie == Superficie.HIELO) {
			// En realidad el hielo si.
			return 0;
		}
		
		return -1;
	}

}
*/
}