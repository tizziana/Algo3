package modelo.SerVivo;
import modelo.Cantador.*;
import modelo.Corredor.*;
import modelo.Nadador.*;
import modelo.Volador.*;
import modelo.Excepciones.*;

public class Gorrion implements SerVivo {
	Cantador cantador;
	Vuela volador;
	NoCorre noCorredor;
	NoNada noNadador;

	public Gorrion(){
		cantador = new Canta();
		volador = new Vuela();
		noCorredor = new NoCorre();
		noNadador = new  NoNada();
	}

	@Override
	public String cantar(String cancion) throws NoCantorException{
		return cantador.cantarCancion(cancion);
	}


	@Override
	public int correr(String superficie) throws NoCorredorException{
		return noCorredor.corre(superficie, this);
	}

	@Override
	public int volar() throws NoVoladorException{
		return volador.vuela();
	}

	@Override
	public int nadar() throws  NoNadadorException{
		return noNadador.nada();
	}
}
