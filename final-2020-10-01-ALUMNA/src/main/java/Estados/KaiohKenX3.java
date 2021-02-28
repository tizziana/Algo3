package Estados;

import Personajes.Goku;
import Personajes.Personaje;
import Personajes.Vegeta;

public class KaiohKenX3 extends Estado {
    private int turnos;

    public KaiohKenX3(){
        intensidad = 100;
        turnos = 3;
    }

    public void atacar(Vegeta vegeta, Goku goku) {
        turnos -= 1;
        if(turnos<1) {
            goku.turnoTrajeTerminado();
            goku.atacarConKameHameHA(vegeta);
            return;
        }
        vegeta.esAtacado(((goku.getVida() * 0.15) - intensidad));
    }


}
