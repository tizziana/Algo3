package modelo.SerVivo;
import modelo.Cantador.*;
import modelo.Corredor.*;
import modelo.Nadador.*;
import modelo.Volador.*;
import modelo.Excepciones.*;

public class AbelPintos implements SerVivo {
	private static final String CANTO = "vas a entrar sin pedirme la llave...";
	private static final int COEFICIENTE_BARRO = 2;
	private static final int COEFICIENTE_HIELO = 0;
	private static final int COEFICIENTE_PISTA_ATLETISMO = 15;
	Canta cantador;
	NoNada noNadador;
	NoVuela noVolador;
	Corre corredor;

	public AbelPintos () {
		cantador = new Canta();
		corredor = new Corre();
		noNadador = new NoNada();
		noVolador = new NoVuela();
	}

	
	@Override
	public String cantar(String cancion) throws NoCantorException{
		return cantador.cantarCancion(cancion);
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
			// unos 15 km/h
			return 15;
		}
		
		if (superficie == Superficie.BARRO) {
			//medio lento pero se puede
			return 2;
		}
		
		if (superficie == Superficie.HIELO) {
			//olvidate, me caigo.
			return 0;
		}
		
		return -1;
	}
*/
}