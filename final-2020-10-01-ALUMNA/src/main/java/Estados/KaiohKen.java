package Estados;

import Personajes.Goku;
import Personajes.Personaje;
import Personajes.Vegeta;

public class KaiohKen extends Estado{
    private int turnos;

    public KaiohKen(){
        turnos = 4;
        intensidad = 100;
    }

    public void atacar(Vegeta vegeta, Goku goku) {
        turnos -= 1;
        if(turnos<1) {
            goku.turnoTrajeTerminado();
            goku.atacarConKameHameHA(vegeta);
            return;
        }
        vegeta.esAtacado(((goku.getVida() * 0.5) - intensidad));
        }
    }

