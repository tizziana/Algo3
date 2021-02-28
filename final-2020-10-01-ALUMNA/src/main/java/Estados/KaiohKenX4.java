package Estados;

import Personajes.Goku;
import Personajes.Personaje;
import Personajes.Vegeta;

public class KaiohKenX4 extends Estado {
    private int turnos;

    public KaiohKenX4(){
        intensidad = 800;
        turnos = 2;
    }

    public void atacar(Vegeta vegeta, Goku goku) {
        turnos -= 1;
        if(turnos<1) {
            goku.turnoTrajeTerminado();
            goku.atacarConKameHameHA(vegeta);
            return;
        }
        vegeta.esAtacado(intensidad);
        goku.aumentaVidaPorAtaqueX4(300);
    }
}
