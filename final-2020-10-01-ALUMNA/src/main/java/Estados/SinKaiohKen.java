package Estados;

import Personajes.Goku;
import Personajes.Personaje;
import Personajes.Vegeta;

public class SinKaiohKen extends Estado {

    public SinKaiohKen(){
        intensidad = 100;
    }


    public void atacar(Vegeta vegeta, Goku goku) {
        vegeta.esAtacado(intensidad);
    }
}
